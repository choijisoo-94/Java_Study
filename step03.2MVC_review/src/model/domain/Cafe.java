package model.domain;

public class Cafe {
	String storename; // �Ǵ���, ȫ����, ������
	String staffname; // ������, ������, ������
	int salary;	// 100~150����(�Ǵ���), 150~200����(ȫ����), 200~250����(������)
	
	Cafe(){} //�⺻������
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
			System.out.println("�Ǵ���");
		}else if(salary >= 150 && salary <= 200) {
			this.salary = salary;
			System.out.println("ȫ����");
		}else if(salary >= 200 && salary <= 250) {
			this.salary = salary;
			System.out.println("������");
		}else {
			System.out.println("�ش� ������� �������� �ʽ��ϴ�.");
		}
	}
	
	public String toString() {
		return storename + " " + staffname + " " + salary;
	}
}
