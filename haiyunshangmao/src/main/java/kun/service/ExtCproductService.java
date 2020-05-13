package kun.service;

import java.io.Serializable;
import java.util.List;

import kun.domain.ExtCproduct;

public interface ExtCproductService {
	public List<ExtCproduct> find(ExtCproduct extCproduct);
	public ExtCproduct get(Serializable id);
	public void insert(ExtCproduct extCproduct);
	public void update(ExtCproduct extCproduct);
	public void delete(Serializable id);
	public void delete(Serializable[] ids);
}
