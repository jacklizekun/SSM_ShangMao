package kun.dao.impl;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import kun.dao.ContractDao;
import kun.domain.Contract;
import kun.vo.OutProduct;
@Repository
public class ContractDaoImpl extends BaseDaoImpl<Contract>implements ContractDao{
	public ContractDaoImpl() {
		this.setNs("kun.mapper.ContractMapper.");
	}
	public kun.vo.Contract view(Serializable id) {
		return this.getSqlSession().selectOne(this.getNs() + "view", id);
	}
	
	public void changeState(Map<String, Object> map) {
		this.getSqlSession().update(this.getNs() + "changeState", map);
	}

	public List<OutProduct> outProduct(Serializable inputDate) {
		List<OutProduct> oList =  this.getSqlSession().selectList(this.getNs() + "findOutProduct", inputDate);
		return oList;
	}

	public List<String> getExtName(Serializable contractProductId) {
		return this.getSqlSession().selectList(this.getNs() + "getExtName", contractProductId);
	}	
}
