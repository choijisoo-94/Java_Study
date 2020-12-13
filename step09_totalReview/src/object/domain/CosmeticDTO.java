package object.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CosmeticDTO {

	public String cosmetic;
	private String skin_type;
	private int cosmetic_price;
	
	public String toString() {
		return "화장품 : " + cosmetic + "\n"   + "피부타입 : " + skin_type + "가격 : "+ "\n" + cosmetic_price;
	}
}


