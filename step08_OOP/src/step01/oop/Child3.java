package step01.oop;

import java.util.ArrayList;

class Parent3 extends Object{
	String id;
	int age;
	
	void printAll() {
		System.out.println(id);
		System.out.println(age);
	}	
}

public class Child3 extends Parent3{
	String job;
	
	
	void printAll() {
		super.printAll();
		System.out.println(job);
	}
	
	
	static Object m() { //Object 변수 = "문자열"; String 객체가 Object로 자동 형변환
		return "문자열";
	}
	/* 저장 : public boolean add(Object o){}
	 * 		저장 순서에 맞게 index 0부터 자동부여 하면서 순차적으로 데이터 저장
	 * 존재하는 데이터를 반환 : public Object get(int index){
	 * 		해당 index에 저장된 데이터 변환
	 * 
	 * 존재하는 데이터를 삭제 : public
	 * 		해당 index값 기준으로 삭제
	 */
	static void m2() {
	ArrayList al = new ArrayList(); //10개의 size의 배열 생성으로 간주
	al.add("혜성");
	al.add(new Integer(20));
	al.add(new Child());
	
	
	//반복문 활용해서 각 객체들이 보유한 toString() 메소드 호출해서 출력
	//for / print() or println()
	/* 문제 1 : toString()는 Object의 메소드가 호출이 될까요?
	 * 			String or Integer 객체라면 String or Integer
	 * 			클래스의 재정의된 toString()가 호출될까요?
	 * 
	 */
	for(int i = 0; i<al.size(); i++ ) {
		System.out.println(al.get(i));
	}
	System.out.println("----");
	System.out.println(al.get(0));
	al.remove(0);
	System.out.println(al.get(0));
	
	}

	public static void main(String[] args) {
		m2();
		System.out.println("=======");
		//자손만의 멤버는 절대 상위 타입에선 access(호출)불가
		//자손만의 멤버 호출을 위해서는 반드시 형변환 필수
		String s = (String)m();
		System.out.println(s.charAt(0));
		/*컴파일단계
		 * 	- Parent3 컴파일되고 해당 byte code 로 자식클래스 확장
		 * 실행 단계
		 * 	- 자식내부에 존재 여부를 확인해서 자식이 메소드를 보유하고 있다면 실행
		 * 	혹여 자식 클래스에 해당 메소드가 없다면 부모 클래스의 오리지널 메소드 실행
		 */
		
		//자동 형변환
		Parent3 p = new Child3(); //다형성 - 상위타입 변수 = 자식객체;
		p.printAll(); //재정의된 자식 클래스의 메소드가 실행
		p.id = "tester";
		p.age = 10;
//		p.job = "it man";
		
		Child3 c = (Child3)p; //명시적인 형변환
		c.job = "it man";
		
		System.out.println();
	}

}
