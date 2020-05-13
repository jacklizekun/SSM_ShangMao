package kun.dao;

import java.util.List;
import java.util.Map;

import kun.domain.Factory;

public interface FactoryDao extends BaseDao<Factory>{
	public void changeState(Map<String, Object> map);
	public List<Factory> combo();
}
