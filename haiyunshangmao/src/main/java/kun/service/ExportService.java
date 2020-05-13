package kun.service;

import java.io.Serializable;
import java.util.List;

import kun.domain.Export;

public interface ExportService {
	public List<Export> find(Export export);
	public Export get(Serializable id);
	public void insert(Export export);
	public void update(Export export);
	public void delete(Serializable id);
	public void delete(Serializable[] ids);
	public String getHTMLString(String exportId);
}
