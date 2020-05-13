package kun.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kun.dao.ExportProductDao;
import kun.domain.ExportProduct;
import kun.service.ExportProductService;

@Service
public class ExportProductServiceImpl implements ExportProductService {
	@Autowired
	ExportProductDao exportProductDao;
	
	public List<ExportProduct> find(ExportProduct exportProduct) {
		return exportProductDao.find(exportProduct);
	}

	public ExportProduct get(Serializable id) {
		return exportProductDao.get(id);
	}

	public void insert(ExportProduct exportProduct) {
		exportProductDao.insert(exportProduct);
	}

	public void update(ExportProduct exportProduct) {
		exportProductDao.update(exportProduct);
	}

	public void delete(Serializable id) {
		exportProductDao.delete(id);
	}

	public void delete(Serializable[] ids) {
		exportProductDao.delete(ids);
	}
}
