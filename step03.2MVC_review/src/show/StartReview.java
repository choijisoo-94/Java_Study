package show;

import model.Data;

public class StartReview {

	public static void main(String [] args) {
		Data data = new Data();
		EndReview review = new EndReview();
		review.searchCafe(data.getCafe());
	}
}
