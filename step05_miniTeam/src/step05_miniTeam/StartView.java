package step05_miniTeam;

import step05_miniTeam.Data;

public class StartView {
	public static void main(String [] args) {
		Data data = new Data();
		EndView view = new EndView();
		view.printclothes(data.getClothes());
	}
}
	