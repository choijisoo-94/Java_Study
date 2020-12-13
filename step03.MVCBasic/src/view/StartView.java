package view;

import model.Data;

public class StartView {

	public static void main(String [] args) {
		EndView.printBook(Data.getbook());
		EndView.printBooks(Data.getBooks());
	}
}
