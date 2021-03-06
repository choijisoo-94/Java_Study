/*생성자 정상 실행 완료 
 * - 해당 클래스가 보유하고 있는 모든 멤버변수들을 메모리에 사용 가능하게 생성 완료
 * - Parent2 객체 생성 완료 = id와 age의 멤버 변수 공간이 heap에 생성 완료
 * - 결론
 * 	상속 관계에선 물려 받는 멤버 변수들이 먼저 생성 완료
 * - id/age가 먼저 생성된 후에  job 이라는 변수공간에 heap 추가되어 생성되는 원리
 */
package step01.oop;
//class 선언구에 extends 코드가 미 코딩시 무조건 "extends Object"
class Parent2 extends Object{
	String id;
	int age;
	Parent2(){
		super(); //parameter가 동일한 부모 생성자 호출
		System.out.println("부모2");
	}
	void printAll() {
		System.out.println(id);
		System.out.println(age);
		
	}
}

public class Child2 extends Parent2{
	String job;
	Child2(){
		super(); //Object 객체 생성 -> Parent 객체 생성 완료(id, age 공간 생성)
		System.out.println("자식2");
	}//job 공간 생성
	
	void printAll() {
		super.printAll(); 
		System.out.println(job);
	}
	
	@Override //재정의 필수, 코드의 명확성을 선언
	//Object 로부터 상속받은 메소드 수정
	public String toString(){
		return "김준형";
	}
	public static void main(String[] args) {
		Child2 c = new Child2(); //부모객체 생성이 무조건 우선
		c.id = "장종욱id"; 
		c.job = "IT man";
		//c.printAll(); 
		//기본 타입의 데이터를 제외한 모든 참조 타입은 무조건 toString() 자동 호출
		//step01.oop.Child2@7852e922
		System.out.println(c); //자동으로 c.toString()
	}

}
