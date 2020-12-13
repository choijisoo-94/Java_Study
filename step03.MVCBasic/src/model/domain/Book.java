package model.domain;

public class Book {
	String isbn; // ��� ������
	String bookName;

	private int birthday; // 2020�� ������ �����Ϳ� ���ؼ��� ��ȿ

	Book() {
	} // �⺻ ������

	public Book(String i, String b, int d) {// ��ü ���� �� ��� �����鰪�� ���ϴ� �����ͷ� �ʱ�ȭ
		isbn = i;
		bookName = b;
		setBirthday(d);
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public int getBirthday() {
		return birthday;
	}

	public void setBirthday(int birthday) {
		if (birthday >= 2020) {
			// ���ǽ��� true�� ��� ����Ǵ� ���
			this.birthday = birthday;
		} else {
			System.out.println("��ȿ�� ���ǳ⵵");
		}

	}

	public String toString() {
		return isbn + " " + bookName + " " + birthday;
	}
}
