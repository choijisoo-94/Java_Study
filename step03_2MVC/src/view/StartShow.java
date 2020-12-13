package view;

import model.Data;

public class StartShow {
	public static void main(String [] args) {
		Data data = new Data();
		EndShow show = new EndShow();
		show.printClothes(data.getClothes());
	}
}
