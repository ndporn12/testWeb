package kr.ac.sunmoon.web;

import java.util.List;

public interface DeptMapper {
	
	public List<Dept> selectAll();
	public void delete(Dept dept);
	public void update(Dept dept);
	public void insert(Dept dept);
	public Dept select(Dept dept);
}
