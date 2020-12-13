
package view;

import java.util.ArrayList;

import data.model.Data_Cosmetic;
import object.domain.EmployeeDTO;

public class StartView {
	public static void main(String[] args) {
		ArrayList al = new ArrayList(); //직원정보 저장
		al.add("employee");
		al.add("sensitive skin");
		al.add("닥터 바이오 크림");
		al.add(20400);
		
		//화장품 추천 직원 관점(화장품,고객,추천정보 제공 및 화장품 구매)
		EmployeeDTO.printCosmetics(Data_Cosmetic.getCosmetic()); //MVC pattern을 이용한 피부타입에 따른 화장품 및 화장품 가격 출력
		EmployeeDTO.printCustomer(); //Builder를 이용한 고객정보 리스트 출력 (password는 보안상 null로 출력)
		EmployeeDTO.recommendCosmetics(); //ArrayList를 이용한 피부 타입에 따른 화장품 추천 
		EmployeeDTO.buyCosmetics(al);//Log4j를 이용한 직원 화장품 구매이력 기록
	}
}

