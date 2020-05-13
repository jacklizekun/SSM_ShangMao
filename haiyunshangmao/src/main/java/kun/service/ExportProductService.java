package kun.service;

import java.io.Serializable;
import java.util.List;

import kun.domain.ExportProduct;

public interface ExportProductService {
	public List<ExportProduct> find(ExportProduct exportProduct);
	public ExportProduct get(Serializable id);
	public void insert(ExportProduct exportProduct);
	public void update(ExportProduct exportProduct);
	public void delete(Serializable id);
	public void delete(Serializable[] ids);
}