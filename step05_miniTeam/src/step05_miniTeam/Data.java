package step05_miniTeam;

import step05_miniTeam.clothes;

public class Data {
	public static clothes[] getClothes() {
		clothes[] all = {new clothes("suit", "female", 160000),
				 		new clothes("accessory", "female", 18000),
				 		new clothes("semi suit", "male", 110000)};
			return all ;
	}
}
