package model.domain;

public class Book {
	String isbn; // 멤버 변수들
	String bookName;

	private int birthday; // 2020년 이후의 데이터에 한해서만 유효

	Book() {
	} // 기본 생성자

	public Book(String i, String b, int d) {// 객체 생성 및 멤버 변수들값을 원하는 데이터로 초기화
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
			// 조건식이 true인 경우 실행되는 블록
			this.birthday = birthday;
		} else {
			System.out.println("무효한 출판년도");
		}

	}

	public String toString() {
		return isbn + " " + bookName + " " + birthday;
	}
}
