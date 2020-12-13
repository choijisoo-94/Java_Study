
package view;

import java.util.ArrayList;
import object.domain.CustomerDTO;

public class EndView {
	public static void main(String[] args) {
	//화장품 추천을 받고 화장품을 구매한 고객 관점(화장품 추천 받기 및 화장품 구매)
		
	CustomerDTO.getChoice(); //Slf4j를 이용한 화장품 추천 받은 기록
	
	ArrayList al2 = new ArrayList(); //ArrayList를 이용한 고객 아이디,피부타입,화장품,화장품가격 데이터 저장
	al2.add("jjw");
	al2.add("combination skin");
	al2.add("라네즈베이직라이트 크림");
	al2.add(34300);
//	ArrayList al = new ArrayList(); 
//	al.add("cjs");
//	al.add("sensitive skin");
//	al.add("닥터 바이오 크림");
//	al.add(20400);
//	ArrayList al1 = new ArrayList(); 
//	al1.add("ljm");
//	al1.add("dry skin");
//	al1.add("뉴트로지나 하이드로 부스트 크림");
//	al1.add(24086);
//	ArrayList al3 = new ArrayList(); 
//	al3.add("yaj");
//	al3.add("oily skin");
//	al3.add("오휘미라클아쿠아 젤크림");
//	al3.add(51300);
	

	CustomerDTO.buyCosmetics(al2); //Log4j를 이용한 고객 화장품 구매이력 기록
//	CustomerDTO.buyCosmetics(al);
//	CustomerDTO.buyCosmetics(al1);
//	CustomerDTO.buyCosmetics(al3);
	}
}
	


