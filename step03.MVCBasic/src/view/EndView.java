 package view;

import model.domain.Book;

public class EndView {
	//Book ��ü �޾Ƽ� ��¸� ���
	public static void printBook(Book b) {
		System.out.println(b.toString());
	}
	public static void printBooks(Book[] books) {
		for(int i = 0; i < books.length; i++) {
			System.out.println(books[i].toString());
		}
	}
}
