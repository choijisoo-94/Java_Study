package model;
		//model package�� ������ ��� Ŭ������ ���� �ݵ�� import ���� �ʼ�
import model.domain.Book;

public class Data {
	public static Book getbook() {//Book ��ü�� �޸� �ּҰ��� ����
		//b ������ ������ ��ü�� �ּҰ�, ��ü�� 3���� �����͸� �����ϰ� ����
		//Book b = new Book("001", "java book", 2020);
		//return b;//�� �ּҰ��� ��ȯ
		
		return new Book("001", "java book", 2020);
	}
		//??? - �� �� �̻��� å ������ ��ȯ�ϴ� �޼ҵ� ����
		//??? - �� �޼ҵ��� ���� ����� �ܼ�â�� ���

	public static Book [] getBooks() {
		Book [] all = {new Book("A1234ABC", "JAVA", 20201105),
				new Book("A2345BCD", "JAVA2", 20201106)
		};
		return all;
	}
	static void printAll(Book [] all) {
		for(int j = 0; j < all.length; j++) {
			System.out.println((all[j]));
		}
	}
	
	public static void main(String[] args) {
		Book [] b = getBooks();
		printAll(b);
	}
}	
