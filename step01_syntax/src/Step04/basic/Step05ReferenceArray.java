package Step04.basic;

import model.domain.Customer;

public class Step05ReferenceArray {
	//Customer 배열 생성해서 데이터 저장 및 반환
	static Customer [] getCs(){
		Customer [] all = {new Customer("장종욱", 30, "vvip"), 
						new Customer("김재웅", 27, "vvip")};
		return all;
	}
	//Customer 배열의 데이터를 반복문 활용해서 출력
	/*all[i].getName()
	 * all - Customer[]
	 * all[0] or all[1] - Customer
	 * all[0]
	 * 
	 */
	static void printAll(Customer [] all) {
		for(int i = 0 ; i < all.length; i++ ) {
			System.out.println(all[i].getName());
		}
	}
	
	public static void main(String[] args) {
		Customer [] c = getCs();
		printAll(c);
	}

}
