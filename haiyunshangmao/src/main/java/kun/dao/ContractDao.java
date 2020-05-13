package kun.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import kun.domain.Contract;
import kun.vo.OutProduct;

public interface ContractDao extends BaseDao<Contract> {
	public kun.vo.Contract view(Serializable id);
	public void changeState(Map<String,Object> map);
}
