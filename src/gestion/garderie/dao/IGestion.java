package gestion.garderie.dao;

import java.util.List;

public interface IGestion<T> {
	
	public void add(T object);
	public void remove(T object);
	public void update(T object);
	public T getById(int i);
	public List<T> getAll();

}
