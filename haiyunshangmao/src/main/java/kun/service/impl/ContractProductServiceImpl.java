package kun.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kun.dao.ContractProductDao;
import kun.domain.ContractProduct;
import kun.service.ContractProductService;

@Service
public class ContractProductServiceImpl implements ContractProductService {
	@Autowired
	ContractProductDao contractProductDao;
	public List<ContractProduct> find(ContractProduct contractProduct) {
		return contractProductDao.find(contractProduct);
	}

	public ContractProduct get(Serializable id) {
		return contractProductDao.get(id);
	}

	public void insert(ContractProduct contractProduct) {
		contractProductDao.insert(contractProduct);
	}

	public void update(ContractProduct contractProduct) {
		contractProductDao.update(contractProduct);
	}

	public void delete(Serializable id) {
		contractProductDao.delete(id);
	}

	public void delete(Serializable[] ids) {
		contractProductDao.delete(ids);
	}

	public List<ContractProduct> findForExport(Serializable contractId) {
		return contractProductDao.findForExport(contractId);
	}
}
