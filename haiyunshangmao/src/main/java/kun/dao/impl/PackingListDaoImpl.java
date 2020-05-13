package kun.dao.impl;

import org.springframework.stereotype.Repository;

import kun.dao.PackingListDao;
import kun.domain.PackingList;

@Repository
public class PackingListDaoImpl extends BaseDaoImpl<PackingList> implements PackingListDao{
	public PackingListDaoImpl() {
		this.setNs("kun.mapper.PackingListMapper.");			//设置命名空间
	}
}
