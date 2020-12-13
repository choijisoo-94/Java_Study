
package data.model;

import object.domain.CosmeticDTO;

public class Data_Cosmetic {
	public static CosmeticDTO [] getCosmetic() {
		CosmeticDTO [] all = {new CosmeticDTO("라네즈베이직라이트 크림", "combination_skin", 34300), 
					new CosmeticDTO("뉴트로지나 하이드로 부스트 크림", "dry_skin", 24086),
					new CosmeticDTO("오휘미라클아쿠아 젤크림", "oily_skin",51300), 
					new CosmeticDTO("닥터 바이오 크림", "sensitive_skin",20400)}; 
		
		return all;
	}

}
