package kun.service;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import kun.domain.Contract;
import kun.vo.OutProduct;

public interface ContractService {
	public List<Contract> find(Contract contract);
	public Contract get(Serializable id);
	public kun.vo.Contract view(Serializable id);
	public void insert(Contract contract);
	public void update(Contract contract);
	public void delete(Serializable id);
	public void delete(Serializable[] ids);
	
	public void changeState(Map<String,Object> map);
	public void pigeonhole(String[] contractIds);
}
