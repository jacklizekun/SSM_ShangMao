package kun.dao.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.stereotype.Repository;

import kun.dao.OutProductDao;
import kun.vo.OutProduct;

@Repository
public class OutProductDaoImpl extends BaseDaoImpl<OutProduct> implements OutProductDao{
	public OutProductDaoImpl() {
		this.setNs("kun.mapper.OutProductMapper.");			//设置命名空间
	}

	public List<OutProduct> outProduct(Serializable inputDate) {
		List<OutProduct> oList =  this.getSqlSession().selectList(this.getNs() + "findOutProduct", inputDate);
		return oList;
	}

	public List<String> getExtName(Serializable contractProductId) {
		return this.getSqlSession().selectList(this.getNs() + "getExtName", contractProductId);
	}	
}
