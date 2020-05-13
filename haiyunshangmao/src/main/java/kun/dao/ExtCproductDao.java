package kun.dao;

import java.io.Serializable;

import kun.domain.ExtCproduct;

public interface ExtCproductDao extends BaseDao<ExtCproduct> {
	public void deleteByContractId(Serializable contractId);
}
