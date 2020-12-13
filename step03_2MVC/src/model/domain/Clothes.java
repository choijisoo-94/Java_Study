package model.domain;

public class Clothes {
	//멤버변수들
	String clothes_name; 
	String clothes_gender; 
	int clothes_price;
	
	Clothes(){} 
	public Clothes(String x, String y, int z){
		clothes_name = x;
		clothes_gender = y;
		clothes_price = z;	
	}

	
	public String getClothes_name() {
		return clothes_name;
	}
	public void setClothes_name(String clothes_name) {
		this.clothes_name = clothes_name;
	}
	public String getClothes_gender() {
		return clothes_gender;
	}
	public void setClothes_gender(String clothes_gender) {
		this.clothes_gender = clothes_gender;
	}
	public int getClothes_price() {
		return clothes_price;
	}

	public void setClothes_price(int clothes_price) {
		if(clothes_price >= 10000 && clothes_price <= 20000) {
			this.clothes_price = clothes_price;
			System.out.println("accessory");
		}else if(clothes_price > 20000 && clothes_price <= 60000) {
			this.clothes_price = clothes_price;
			System.out.println("casual look");
		}else if(clothes_price > 60000 && clothes_price <= 120000) {
			System.out.println("semi suit");
		}else if(clothes_price > 120000 && clothes_price <= 200000) {
			System.out.println("suit");
		}else {
			System.out.println("해당 의류는 입고되지 않았습니다.");
		}
	}

	public String toString() {
		return clothes_name + " " + clothes_gender + " " + clothes_price;
	}
}
