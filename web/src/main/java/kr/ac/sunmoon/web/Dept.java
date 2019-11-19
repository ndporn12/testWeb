package kr.ac.sunmoon.web;

public class Dept {
	private int deptno;
	private String dname;
	private String loc;
	
	public Dept() {
		
	}
	public Dept(int deptno, String dname, String loc) {
		this.deptno = deptno;
		this.dname = dname;
		this.loc = loc;
	}
	public int getDeptNo() {
		return deptno;
	}
	public void setDeptNo(int deptNo) {
		this.deptno = deptNo;
	}
	public String getdName() {
		return dname;
	}
	public void setdName(String dName) {
		this.dname = dName;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	
	
}
