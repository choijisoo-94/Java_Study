package object.domain;

import java.util.ArrayList;
import java.util.logging.Logger;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Slf4j
public class CustomerDTO extends EmployeeDTO { //상속
	
		//멤버 변수
		public String id; //아이디
		private String password; //비밀번호
		public String grade; //등급
		public String skin_type; //피부타입
		
		
		@Override
		public String toString() {
			return "Customer [id=" + id + ", password=" + password + ", grade=" + grade + ", skin_type=" + skin_type
					+ "]";
		}
		
		public static void getChoice() {
			CustomerDTO c = new CustomerDTO("jjw","0022","member","combination skin");
			CosmeticDTO s = new CosmeticDTO("닥터 바이오 크림","sensitive skin ",20400);
			
			log.info(c.getId() + "," + c.getPassword() + ","
			+ c.getGrade() + "," + c.getSkin_type() + "," + s.getCosmetic());

			System.out.println(c.getId()+"님! " + "당신은 소중한 " + c.getGrade() + " 입니다. \n"
					+ c.getSkin_type() +"타입의 피부를 가지고 계시네요. \n"
				    + "소중한 당신의 피부를 위해 저희 LCJY 코스메틱에서는 "
				    + s.getCosmetic() + " 추천드립니다. \n"
				    + "구매하시겠습니까?");
		}
}

	