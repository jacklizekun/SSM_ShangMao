package kun.service;

import java.io.Serializable;
import java.util.List;

import kun.vo.OutProduct;

public interface OutProductService {
	public List<OutProduct> findOutProduct(Serializable inputDate);
	public List<String> getExtName(String contractProductId);
}
