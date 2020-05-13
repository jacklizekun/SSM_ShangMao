package kun.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kun.dao.OutProductDao;
import kun.service.OutProductService;
import kun.vo.OutProduct;

@Service
public class OutProductServiceImpl implements OutProductService {
	@Autowired
	OutProductDao outProductDao;
	

	public List<OutProduct> findOutProduct(Serializable inputDate) {
		return outProductDao.outProduct(inputDate);
	}

	public List<String> getExtName(String contractProductId) {
		return outProductDao.getExtName(contractProductId);
	}	
}