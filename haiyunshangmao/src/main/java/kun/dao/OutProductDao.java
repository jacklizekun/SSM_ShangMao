package kun.dao;

import java.io.Serializable;
import java.util.List;

import kun.vo.OutProduct;

public interface OutProductDao {
	public List<OutProduct> outProduct(Serializable inputDate);
	public List<String> getExtName(Serializable contractProductId);
}
