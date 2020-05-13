package kun.dao;

import java.io.Serializable;
import java.util.List;

import kun.domain.ContractProduct;

public interface ContractProductDao extends BaseDao<ContractProduct> {
	public void deleteByContractId(Serializable contractId);
	public List<ContractProduct> findForExport(Serializable contractId);
}
