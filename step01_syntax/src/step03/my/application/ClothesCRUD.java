package step03.my.application;

import step03.my.application.Clothes;

public class ClothesCRUD {
	Clothes clothes;
	//����
	void save(String clothesname, String gender, int month){
		clothes = new Clothes(clothesname, gender, month);
		Clothes b = new Clothes("jacket","Male",9);
		System.out.println(clothes.toString());
	}
	//�˻�
		void search() {
			System.out.println(clothes.toString());
		}
	//����
		void update(String newName) {
			clothes.setClothesname(newName);
			System.out.println(clothes.toString());
		}	
	//����
		void delete() {
			clothes = null;
		}
		
	public static void main(String[] args) {
		ClothesCRUD crud = new ClothesCRUD();
		crud.save("jacket", "feMale", 10);
		crud.search();
		crud.update("jeans");
		crud.delete();
	}

}
