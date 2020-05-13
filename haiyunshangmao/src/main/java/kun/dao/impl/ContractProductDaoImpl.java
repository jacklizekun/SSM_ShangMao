package kun.dao.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.stereotype.Repository;

import kun.dao.ContractProductDao;
import kun.domain.ContractProduct;

@Repository
public class ContractProductDaoImpl extends BaseDaoImpl<ContractProduct> implements ContractProductDao{
	public ContractProductDaoImpl() {
		this.setNs("kun.mapper.ContractProductMapper.");			//设置命名空间
	}
	public void deleteByContractId(Serializable contractId) {
		this.getSqlSession().delete(this.getNs() + "deleteByContractId", contractId);
	}
	public List<ContractProduct> findForExport(Serializable contractId) {
		return this.getSqlSession().selectList(this.getNs() + "findForExport", contractId);
	}
}