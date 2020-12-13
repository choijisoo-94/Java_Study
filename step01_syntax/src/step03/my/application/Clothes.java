package step03.my.application;

public class Clothes {
	//���������
	String clothesname; //���̸� : padding, jacket, jeans ...
	String gender; //���� : male, female
	int month; //����� : 20201104, 20201105
	
	Clothes(){} //�⺻������
	Clothes(String c, String g, int d){
		clothesname = c;
		gender = g;
		setmonth(d);	
	}

	public String getClothesname() {
		return clothesname;
	}
	public void setClothesname(String clothesname) {
		this.clothesname = clothesname;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getmonth() {
		return month;
	}
	public void setmonth(int month) {
		switch(month) {
		case 9:
		case 10:
		case 11:
		case 12:
		case 1:
		case 2:	
			this.month = month;
			break;
		default :
			System.out.println("��,����,���� �����");
		}
	}

	public String toString() {
		return clothesname + " " + gender + " " + month;
	}
}
