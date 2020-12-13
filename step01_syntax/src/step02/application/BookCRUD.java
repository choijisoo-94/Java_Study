package step02.application;

public class BookCRUD {
	Book book; //모든 메소드에서 공유하는 자원
	//저장
	/* 호출자(사용자) 관점
	 * - 저장 메소드 호출시마다 새로운 데이터로 책 저장
	 * 	: save(String isbn, String name, int birthday)
	 * - 메소드 body에 이미 정해진 데이터로 Book를 만들것인지
	 * 	: save(){ .. }
	 */
	void save(String isbn, String name, int birthday){
		book = new Book(isbn, name, birthday);
		System.out.println(book.toString());
	}
	//검색
	void search() {
		//book.toString()
		/* book 변수가 관리하는 주소값의 객체가 보유한 toString() 호출함을 의미
		 * book이 관리하는 객체가 있을 경우 - 실행 
		 * "		" 		없을 경우 - 없는데 호출했다 큰일났다.
		 */
		System.out.println(book.toString());
	}
	//수정 
	void update(String newName) {
		book.setBookName(newName);
		System.out.println(book.toString());
	}
	//삭제
	void delete() {
		book = null;//주소값을 초기화 하는 키워드, 즉 참조 타입 변수들 기본값
	}

	public static void main(String[] args) {
		BookCRUD crud = new BookCRUD();
		//데이터 생성 -> 확인(검색) -> 수정 -> 확인(검색) -> 삭제 -> 확인(검색)
		crud.save("E123123A", "심판", 2020515);
		crud.search();
		crud.update("자바 프로그래밍 입문");
		crud.delete();
		//? CRUD 나름 순서대로 호출하셔서 결과값 확인 하기
	}

}
