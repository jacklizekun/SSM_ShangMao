package kun.dao.impl;

import java.io.Serializable;

import org.springframework.stereotype.Repository;

import kun.dao.ExtCproductDao;
import kun.domain.ExtCproduct;

@Repository
public class ExtCproductDaoImpl extends BaseDaoImpl<ExtCproduct> implements ExtCproductDao{
	public ExtCproductDaoImpl() {
		this.setNs("kun.mapper.ExtCproductMapper.");			//设置命名空间
	}
	public void deleteByContractId(Serializable contractId) {
		this.getSqlSession().delete(this.getNs() + "deleteByContractId", contractId);
	}
}