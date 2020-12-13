/*static 키워드
 * 
 */
package Step04.basic;
	
public class Step03Static {
	void m1() {
		System.out.println("non-static 메소드");
	}
	
	static void m2() {
			System.out.println("static 메소드");
	}
	public static void main(String[] args) {
		Step03Static.m2();
//		Step03Static.m1(); 에러
		/* 기본 타입은 클래스 미존재, 가령 객체 타입들로만 저장 및 활용해야 하는 상황이 있을수도..
		 * API 에선 8가지 기본 타입을 support 해주는 개별 클래스들
		 * 기본값(기본타입)을 감싼 구조 - wrapper class 들
		 * int - Integer
		 * byte - Byte
		 * float -Float
		 * ...
		 * 
		 * 
		 */
		/*
		 * java.lang.Integer의 메소드중 문자열(String) -> int로 변환해주는 메소드
		 * 필요데이터 - String, 반환 - int
		 * int ?(필요데이터String s)
		 */
		
		String s = "3";
		int i = Integer.parseInt(s); //String -> int
		System.out.println(i); //3이라는 int값 출력해 보기
		
		String a = "9";
		int j = Integer.parseInt(a);
		System.out.println(j);
		
	}

}
