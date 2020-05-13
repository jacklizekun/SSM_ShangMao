package kun.dao.impl;

import org.springframework.stereotype.Repository;

import kun.dao.ExportDao;
import kun.domain.Export;

@Repository
public class ExportDaoImpl extends BaseDaoImpl<Export> implements ExportDao{
	public ExportDaoImpl() {
		this.setNs("kun.mapper.ExportMapper.");			//设置命名空间
	}
}