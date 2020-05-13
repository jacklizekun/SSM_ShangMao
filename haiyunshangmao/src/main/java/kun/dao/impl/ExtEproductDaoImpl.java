package kun.dao.impl;

import org.springframework.stereotype.Repository;

import kun.dao.ExtEproductDao;
import kun.domain.ExtEproduct;

@Repository
public class ExtEproductDaoImpl extends BaseDaoImpl<ExtEproduct> implements ExtEproductDao{
	public ExtEproductDaoImpl() {
		this.setNs("kun.mapper.ExtEproductMapper.");			//设置命名空间
	}
}
