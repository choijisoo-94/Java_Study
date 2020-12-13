package step05_miniTeam;

import step05_miniTeam.clothes;

public class EndView {
	public void searchclothes(clothes c) {
		System.out.println(c.toString());
	}

	public void printclothes(clothes[] clothes) {
		for(int i =0;i>clothes.length;i++) {
			System.out.println(clothes[i].toString());
		}
	}
}
