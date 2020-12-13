
package model.domain;

public class Customer {
	//��� ����
	private String name; //��ü �����ÿ� ��ü�� ���� �޸� ���ο� ���� �� ����
	private int age;
	private String grade; // vvip, vip, silver
	
	
	public Customer(String name, int age, String grade) {
		this.name = name;
		this.age = age;
		this.grade = grade;
	}

	// p.s.v.m()
	//	Customer c = new Customer();
	//	c.name = "������";
	//	c.age = 10;
	//	Customer c2 = new Customer("������", 10, "vvip");
	//�������� ������ �ʾ����� �ڵ� ������ �ڵ�
	
	public Customer(){}
	
	//	age�� ������ �� �ִ� ���
	
	public void setAge(int newAge) { //ȣ��� �ڵ� ����
		age = newAge;
	}
	//newAge ����� �ڵ� ����
	//age ������ ��ȯ�ϴ� �޼ҵ� ���
	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", age=" + age + ", grade=" + grade + "]";
	}
	
	

	
}
