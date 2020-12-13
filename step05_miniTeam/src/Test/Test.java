package Test;

public class Test {

	public static void main(String[] args) {
		char c = 'A';
		int i = c; //16bit char --> 32 bit int로 변환, A의 유니코드 번호
		System.out.println(c + " " + i); //A 65
		c = 'a';
		i = c;
		System.out.println(i); //97
		System.out.println("=========");
		
		/*문자임에도 대소비교가 가능하다는 건
		 * 타입을 일치화 해서 비교를 수행
		 * >크다 작다에 대한 기준이기 때문에 웬치 수치연산
		 * char와 정수 비교시 char는 정수로 변환됨을 암시
		 * char 값들이 비교시 유니코드로 변환되어 비교
		 * a = 97, A = 65번..
		 * 
		 */
		
		String v = "abc";
		char c2 = v.charAt(0);
		System.out.println(c2 >= 97); //c2 > 96 : true  | c2 > 97 : false
		
		System.out.println("====! : 부정 연산자 =====");
		System.out.println(!true);
		System.out.println(!false);
		System.out.println(c2 >= 97); //true
		System.out.println( !(c2 >= 97) ); //false
		
	}

}
