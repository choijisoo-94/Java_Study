/* 객체 생성을 위한 생성자는 개발자가 미코딩시 자동으로 추가(기본 생성자)
 * 생성자{} 내부에는 출력 로직도 가능...
 * 
 */
package Step04.basic;

class A{
	A(){
		//NO 변수 공간 생성 0값으로 자동 초기화 -> 10값으로 재 초기화
	System.out.println("A");	
	}
	int no = 10;
	int getNo() {
		return no; 
	}
}
class B{
	A a = new A(); 
	B(){
		//멤버 변수들 생성 완료 - A a  완벽하게 실행 종료
		System.out.println("B");
	}
}
class C{
	B b = new B();
	C(){
		//멤버 변수들 초기화 로직 수행 B b  = new B() 객체 생성
		System.out.println("C");
	}//생성자 정상 종료는 이 클래스가 보유한 모든 멤버 변수를 완벽하게 메모리에 생성함을
}	

public class Step04Review {

	public static void main(String[] args) {
		/*미션1 - A클래스의 no 변수값 출력
		 *미션2 - 객체 생성 순서? */
		 C c = new C(); 
		 
		 /* C c = new C()
		  * C c 변수 공간 생성
		  * 
		  */
		 System.out.println(c.b.a.getNo());
	}
}

