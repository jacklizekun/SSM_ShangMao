package kun.dao.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.stereotype.Repository;

import kun.dao.ExportProductDao;
import kun.domain.ExportProduct;

@Repository
public class ExportProductDaoImpl extends BaseDaoImpl<ExportProduct> implements ExportProductDao{
	public ExportProductDaoImpl() {
		this.setNs("kun.mapper.ExportProductMapper.");			//设置命名空间
	}
	public List<ExportProduct> findByExportId(Serializable exportId) {
		return this.getSqlSession().selectList(this.getNs()+"findByExportId",exportId);
	}
}
