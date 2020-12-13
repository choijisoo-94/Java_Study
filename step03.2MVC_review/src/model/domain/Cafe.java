package model.domain;

public class Cafe {
	String storename; // 건대점, 홍대점, 신촌점
	String staffname; // 김혜경, 최지수, 장종욱
	int salary;	// 100~150만원(건대점), 150~200만원(홍대점), 200~250만원(신촌점)
	
	Cafe(){} //기본생성자
	public Cafe(String st, String sf, int s) {
		storename=st;
		staffname=sf;
		setSalary(s);
	}
	public String getStorename() {
		return storename;
	}
	public void setStorename(String storename) {
		this.storename = storename;
	}
	public String getStaffname() {
		return staffname;
	}
	public void setStaffname(String staffname) {
		this.staffname = staffname;
	}
	public int getSalary() {
		return salary;
	}
	
	public void setSalary(int salary) {
		if(salary >= 100 && salary <= 150) {
			this.salary = salary;
			System.out.println("건대점");
		}else if(salary >= 150 && salary <= 200) {
			this.salary = salary;
			System.out.println("홍대점");
		}else if(salary >= 200 && salary <= 250) {
			this.salary = salary;
			System.out.println("신촌점");
		}else {
			System.out.println("해당 매장명은 존재하지 않습니다.");
		}
	}
	
	public String toString() {
		return storename + " " + staffname + " " + salary;
	}
}
