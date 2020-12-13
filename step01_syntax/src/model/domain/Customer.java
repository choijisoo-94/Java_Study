
package model.domain;

public class Customer {
	//멤버 변수
	private String name; //객체 생성시에 객체의 실제 메모리 내부에 생성 및 구성
	private int age;
	private String grade; // vvip, vip, silver
	
	
	public Customer(String name, int age, String grade) {
		this.name = name;
		this.age = age;
		this.grade = grade;
	}

	// p.s.v.m()
	//	Customer c = new Customer();
	//	c.name = "최지수";
	//	c.age = 10;
	//	Customer c2 = new Customer("최지수", 10, "vvip");
	//육안으로 보이진 않았으나 자동 생성된 코드
	
	public Customer(){}
	
	//	age를 수정할 수 있는 기능
	
	public void setAge(int newAge) { //호출시 자동 생성
		age = newAge;
	}
	//newAge 종료시 자동 삭제
	//age 변수값 반환하는 메소드 기능
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
