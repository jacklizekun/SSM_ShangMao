package kun.dao;

import java.io.Serializable;
import java.util.List;

import kun.dao.BaseDao;
import kun.domain.ExportProduct;

public interface ExportProductDao extends BaseDao<ExportProduct> {
	public List<ExportProduct> findByExportId(Serializable exportId);
	
}
