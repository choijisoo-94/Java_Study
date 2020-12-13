package step02.application;

public class BookCRUD {
	Book book; //��� �޼ҵ忡�� �����ϴ� �ڿ�
	//����
	/* ȣ����(�����) ����
	 * - ���� �޼ҵ� ȣ��ø��� ���ο� �����ͷ� å ����
	 * 	: save(String isbn, String name, int birthday)
	 * - �޼ҵ� body�� �̹� ������ �����ͷ� Book�� ���������
	 * 	: save(){ .. }
	 */
	void save(String isbn, String name, int birthday){
		book = new Book(isbn, name, birthday);
		System.out.println(book.toString());
	}
	//�˻�
	void search() {
		//book.toString()
		/* book ������ �����ϴ� �ּҰ��� ��ü�� ������ toString() ȣ������ �ǹ�
		 * book�� �����ϴ� ��ü�� ���� ��� - ���� 
		 * "		" 		���� ��� - ���µ� ȣ���ߴ� ū�ϳ���.
		 */
		System.out.println(book.toString());
	}
	//���� 
	void update(String newName) {
		book.setBookName(newName);
		System.out.println(book.toString());
	}
	//����
	void delete() {
		book = null;//�ּҰ��� �ʱ�ȭ �ϴ� Ű����, �� ���� Ÿ�� ������ �⺻��
	}

	public static void main(String[] args) {
		BookCRUD crud = new BookCRUD();
		//������ ���� -> Ȯ��(�˻�) -> ���� -> Ȯ��(�˻�) -> ���� -> Ȯ��(�˻�)
		crud.save("E123123A", "����", 2020515);
		crud.search();
		crud.update("�ڹ� ���α׷��� �Թ�");
		crud.delete();
		//? CRUD ���� ������� ȣ���ϼż� ����� Ȯ�� �ϱ�
	}

}
