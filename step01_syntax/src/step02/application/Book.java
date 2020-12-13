/* ���� ������ ǥ���� �� �ִ� Ŭ���� - ������ ǥ���� ���� ���� Ŭ����
 * Data Transfer Object[DTO] pattern
 * Value Object pattern[VO]
 */


package step02.application;

public class Book {
	String isbn;	//��� ������
	String bookName;
	//�ܺο��� ȣ�� �Ұ� �� ���� ����, ������ Book Ŭ���������� ȣ�� ������ ����
	private int birthday;	//2020�� ������ �����Ϳ� ���ؼ��� ��ȿ
	
	Book(){}  		//�⺻ ������
	Book(String i, String b, int d){//��ü ���� �� ��� �����鰪�� ���ϴ� �����ͷ� �ʱ�ȭ
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
	//��� ������� ���� �������� ������ ��� ��� ������ this. �ʼ�
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public int getBirthday() {
		return birthday;
	}
	/* ����
	 * birthDay ��� ������ �ݵ�� 20�� ���� �����͸� ����
	 * �� ������ �����ʹ� ���� �Ұ����� ��
	 * 
	 * ����(if)�� �Է��Ϸ��� �����Ͱ��� 20���� ���ų� ũ��(>=2020) ����(=)
	 * �ƴ϶�� ���� �Ұ�
	 */
	public void setBirthday(int birthday) {
		if(birthday >= 2020) {
			//���ǽ��� true�� ��� ����Ǵ� ���
			this.birthday = birthday;
		}else {
			System.out.println("��ȿ�� ���ǳ⵵");
		}
		
	}
	//������ ����� ���Ǽ��� ���ؼ� ��� ��� ������ ���� �ѹ��� ��ȯ�ϴ� �޼ҵ� �߰� ����
	//�ڹ��� ��ȯ Ÿ���� �ݵ�� �ϳ��� ����
	//���ڿ��� ����, +(���տ�����)
	public String toString() {
		return isbn + " " + bookName + " " + birthday;
	}
}





