package object.domain;

import java.util.ArrayList;
import java.util.logging.Logger;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class EmployeeDTO {
	static Logger logger = Logger.getLogger("log4jtest.CustomerTest");
	
	public String id; //아이디
	private String password; //비밀번호
	public String grade; //등급
	public String skin_type; //피부타입

	public static void printCosmetics(CosmeticDTO[] cosmetic) {//화장품 정보 출력
		System.out.println("=====피부타입에 따른 화장품 및 화장품 가격 출력=====");
		for (int i = 0; i< cosmetic.length; i++) {
			System.out.println("화장품: " + cosmetic[i].getCosmetic() + " / " + "피부타입 : " + cosmetic[i].getSkin_type() + " / " + "가격 : " + cosmetic[i].getCosmetic_price() + "원");
		}
	}

	public static void printCustomer(){//고객 정보 출력
		System.out.println("=====고객정보 리스트 출력=====");
		CustomerDTO c = CustomerDTO.builder().id("이정민").skin_type("건성").grade("vip").build();
		System.out.println(c.toString());
		
		CustomerDTO c2 = CustomerDTO.builder().id("염아정").skin_type("지성").grade("silver").build();
		System.out.println(c2.toString());
		
		CustomerDTO c3 = CustomerDTO.builder().id("장종욱").skin_type("복합성").grade("member").build();
		System.out.println(c3.toString());
		
		CustomerDTO c4 = CustomerDTO.builder().id("최지수").skin_type("예민").grade("nonmember").build();
		System.out.println(c4.toString());
	}
	
	public static void recommendCosmetics() { //피부타입에 따른 화장품 추천
		System.out.println("=====피부 타입에 따른 화장품 추천=====");
		ArrayList al = new ArrayList(); 
		ArrayList al2 = new ArrayList();
		
		al.add("지성"); 
		al.add("건성");
		al.add("예민"); 
		al.add("복합성");
		
		al2.add("오휘미라클아쿠아 젤크림");
		al2.add("뉴트로지나 하이드로 부스트 크림");
		al2.add("닥터바이오 크림");
		al2.add("라네즈베이직라이트 크림");
		
		for (int i = 0; i< al.size(); i++) {
			System.out.println( al.get(i)+"이면 " +al2.get(i)+"입니다.");
		}
	}
	
	public static void buyCosmetics(ArrayList al) { //아이디 같으면, --님 --타입이시므로 --화장품 구매하셨습니다. 가격 : xxx
		System.out.println("=====직원 및 고객 화장품 구매이력 기록=====");
		if(al.get(0).equals("yaj")) {
			logger.info("회원아이디 : " +al.get(0)+", 염아정님 " +al.get(1)+"이시므로 "+al.get(2)+ " 구매하셨습니다." + "가격 : "+al.get(3));
		}else if(al.get(0).equals("jjw")){
			logger.info("회원아이디 : " +al.get(0)+", 장종욱님 " +al.get(1)+"이시므로 "+al.get(2)+ " 구매하셨습니다." + "가격 : "+al.get(3));
		}else if(al.get(0).equals("ljm")) {
			logger.info("회원아이디 : " +al.get(0)+", 이정민님 " +al.get(1)+"이시므로 "+al.get(2)+ " 구매하셨습니다." + "가격 : "+al.get(3));
		}else if(al.get(0).equals("cjs")) {
			logger.info("회원아이디 : " +al.get(0)+", 최지수님 " +al.get(1)+"이시므로 "+al.get(2)+ " 구매하셨습니다." + "가격 : "+al.get(3));
		}else if(al.get(0).equals("employee")) {
			logger.info("직원아이디 : " +al.get(0)+", employee님 " +al.get(1)+"이시므로 "+al.get(2)+ " 구매하셨습니다." + "가격 : "+al.get(3));
		}//0 : 아이디, 1: 피부타입, 2: 화장품, 3:가격
	}
}
