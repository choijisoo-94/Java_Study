package Step04.basic;

public class Step01API {

	public static void main(String[] args) {
		/*문자열 전체에서 첫 음절만 착출
		 * 기능 수행에 필요한 정보
		 * 문자열 객체/문자열의 첫 철자 위치값
		 * 문자열 객체(s)/문자열의 첫 철자 위치값(0) //문자열은 0부터 시작 ~ string은 6까지!
		 * 한 글자만 뽑고 싶을 때는 char사용하기. length는 값의 길이 추출
		 */
	String s = "string";
	System.out.println(s.length());
	System.out.println(s.charAt(3));
	
		//S라는 소문자 철자로 시작하는게 맞다면 true 출력/아니라면 false 기능의 메소드
		/* true or false - 반환타입이 boolean
		 * s소문자로 시작...필요한 비교 데이터
		//ing만 분리해서 출력하세요
		 * 문자열의 일부를 발췌
		 * string -> ing
		 * 반환값은 ing 따라서 Strings
		 * String ?(int index){
		 * 		객체 내부에서 일부만 발췌...
		 */

	
	//	boolean ?(char c)
	//	boolean ?(String str)		

			
	System.out.println(s.startsWith("s"));
	
	System.out.println(s.substring(4));
	
	String s2 = "PlayData"; //"" String 객체 자동 생성
	System.out.println(s2.toLowerCase());
	System.out.println(s2.toUpperCase());
	System.out.println(Math.random());
	System.out.println(Math.max(4, 7));
	}

}

		/* 1. API 활용 시작
		 * 2. 조건문 & 연산자
		 * 3. 배열 & 반복문
		 * 
		 * 4. mini project(3인 1팀 or 2인 1팀)
		 * 	- 발표
		 *
		 */
