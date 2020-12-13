/* 학습 내용
 * 1. 계산기 일부 로직을 활용해서 메소드 문법 습득
 * 2. 사칙연산 계산
 * 		기능 - 4개(메소드 4개)
 * 			메소드별 최소 필요한 변수 = 입력데이터 2개, 출력값 1개
 * 
 * 		연사시 필요 최소 데이터 - 2개
 * 		:2개의 입력 데이터 + 사칙연산식 = 결과
 * 
 */

package step01.basic;

public class Step02Mathod {
	
	//+ 기능의 메소드 구현 : sum, 연산된 결과값은 호출한 곳으로 주기
	int sum(int v1, int v2) {
		int r = v1 + v2;
		return r;
	}
	
	void min(int v1, int v2) {
		System.out.println(v1 - v2);
	}
	
	//-
	
	
	// 
	public static void main(String[] args) {
//		1. 변수
//		1-1. 변수 선언 문법
//		-타입 변수명; 선언
//  	-타입 변수명 [= 값] 선언 및 초기화
//		1-2. 변수 호출 문법
//		-변수명 = 값; 호출해서 값 대입
		Step02Mathod s = new Step02Mathod();
		//	더하기 기능의 메소드 호출
		int result = s.sum(3, 4);
		System.out.println(result);
		s.min(10,2);
	}

}
