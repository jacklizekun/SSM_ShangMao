package kun.service.impl;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import common.springdao.SqlDao;
import kun.dao.ContractDao;
import kun.dao.ContractProductDao;
import kun.dao.ExtCproductDao;
import kun.domain.Contract;
import kun.service.ContractService;

@Service
public class ContractServiceImpl implements ContractService{
	@Autowired
	ExtCproductDao extCproductDao;
	@Autowired
	ContractProductDao contractProductDao;
	@Autowired
	ContractDao contractDao;
	
	@Autowired
	SqlDao sqlDao;	
	
	public List<Contract> find(Contract contract) {
		return contractDao.find(contract);
	}

	public Contract get(Serializable id) {
		return contractDao.get(id);
	}
	
	public kun.vo.Contract view(Serializable id) {
		return contractDao.view(id);
	}

	public void insert(Contract contract) {
		contractDao.insert(contract);
	}

	public void update(Contract contract) {
		contractDao.update(contract);
	}

	public void delete(Serializable id) {
		extCproductDao.deleteByContractId(id);				//删除当前合同下的货物下的附件
		contractProductDao.deleteByContractId(id);			//删除当前合同下的货物
		contractDao.delete(id);								//删除合同
	}

	public void delete(Serializable[] ids) {
		for(Serializable id: ids){
			extCproductDao.deleteByContractId(id);			//删除当前合同下的货物下的附件
		}
		for(Serializable id: ids){
			contractProductDao.deleteByContractId(id);		//删除当前合同下的货物		
		}
		contractDao.delete(ids);							//删除合同
	}
	

	public void changeState(Map<String, Object> map) {
		contractDao.changeState(map);
	}

	public void pigeonhole(String[] contractIds) {
		StringBuffer sBuf = new StringBuffer();
		for(String id : contractIds){
			sBuf.append("insert into contract_his_c select * from contract_c where contract_id='" + id + "';");
			sBuf.append("insert into contract_product_his_c select * from contract_product_c where contract_id='" + id + "';");
			sBuf.append("insert into ext_cproduct_his_c select * from ext_cproduct_c where contract_product_id in (select contract_product_id from contract_product_c where contract_id='" + id + "');");
			
			sBuf.append("delete from ext_cproduct_c where contract_product_id in (select contract_product_id from contract_product_c where contract_id='" + id + "');");
			sBuf.append("delete from contract_product_c where contract_id='" + id + "';");
			sBuf.append("delete from contract_c where contract_id='" + id + "';");
			
		}
		
		sqlDao.batchSQL(sBuf.toString().split(";"));
	}
}
