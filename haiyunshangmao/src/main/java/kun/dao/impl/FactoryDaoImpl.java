package kun.dao.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import kun.dao.FactoryDao;
import kun.domain.Factory;
@Repository
public class FactoryDaoImpl extends BaseDaoImpl<Factory>implements FactoryDao {
	public FactoryDaoImpl(){
		this.setNs("kun.mapper.FactoryMapper.");
	}

	public void changeState(Map<String, Object> map) {
		this.getSqlSession().update(this.getNs()+"changeState", map);
	}
	//下拉列表
	public List<Factory> combo() {
		return this.getSqlSession().selectList(this.getNs() + "combo");
	}
}
