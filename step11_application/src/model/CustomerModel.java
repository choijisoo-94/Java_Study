//SQL을 실제 사용해서 DB와 직접 연동하는 클래스로 변환
package model;

import java.util.ArrayList;
import java.util.List;

import model.db.VirtualDataBase;
import model.domain.Customer;

public class CustomerModel {
	private ArrayList<Customer> datas = VirtualDataBase.getCustomers();
	
	// 모든 고객 검색 - 고객 정보 반환
	public ArrayList<Customer> getCustomers() {
		return datas;
	}

	// 고객 검색 - id로 해당 고객 검색
	public Customer getCustomer(String id) {
			for(Customer c : datas) {
				if(c.getId().equals(id)) {
					return c;
				}
			}
			return null;
		}
	
	// 고객 저장 - 3개의 데이터가 한명의 고객 정보
	/* parameter는 Customer 타입? 
	 * String id, int age, String grade 데이터
	 * 존재할 경우 - 예외발생(중복된 id라는 메세지로 생성)
	 * 미존재할 경우 - 저장
	 */
	
//내가 연습해본 문제(틀린 이유와 왜 틀렸는지 리뷰하기)
//	public boolean void insert (Customer c) {
//		//id 중복 여부 검증 후 미존재할 경우에만 add
//		for(int i = 0; i < c.getId().length(); i++){
//		if(c.getId().equals("id")) {
//			}else {
//				return datas.add(c);
//			}
//		}
//	}
	
	public void insert(Customer c) throws Exception {

	Customer v = getCustomer(c.getId());
	if(v == null) {
		datas.add(c);
	}else {
		throw new Exception("id가 중복 가입 불가");
		}
	}
	
	// 고객 정보 수정
	/* 정상 수정 : true / 비정상 수정 : false
	 * id값으로 등급 수정 로직
	 * 발생 가능한 경우의 수
	 * 	1. id가 존재한다 - 수정 true 반환
	 * 	2. id가 미존재한다 - 수정 불가 false 반환
	 * 
	 */
	public boolean update(String id, String newGrade) {
		boolean result = false;
		Customer v = getCustomer(id);
		
		if(v != null) { //null이 아님 즉 고객이 있음
			v.setGrade(newGrade);
			result = true;
		}
		return result;
	}
	
	// 고객 삭제 - 삭제 성공 시 1 반환, 삭제 실패시 0 반환
	/* ArrayList에 저장된 Customer 즉 ArrayList의 데이터 삭제 - remove(int index), remove(Object o)
	 * 
	 */
	public int delete (String id) {
		int result = 0;
		Customer v = getCustomer(id);
		if( v != null) { //null이 아니다 = customer 존재
			if(datas.remove(v) == true) {
				result = 1;
			}
			
		}
		return result;
		
	
	
	
//	public static void main(String[] args) {
//		CustomerModel c = new CustomerModel();
//		System.out.println(c.datas);
//		c.delete("중기");
//		System.out.println(c.datas);
//		c.update("중기", "vip");
//		c.getCustomers().get(3).setGrade("Gold");
//		c.getCustomers().get(3).getGrade().charAt(3);
		

		//? gold 데이터의 d 철자만 출력
		//ArrayList -> Customer -> grade -> d
		/* ArrayList : c.getCustomers() or c.datas
		 * Customer c : c.getCustomers().get(3) or c.datas.get(3)
		 * Grade : c.getCustomers().get(3).getGrade() or c.datas.get(3).getGrade()
		 * d : c.getCustomers().get(3).getGrade().charAt(0);
		 * 		c.datas.get(3).getGrade().charAt(0);
		 * 
		 */
		
//		System.out.println(c.getCustomers().get(3).getGrade().charAt(3));
		
//		try {
//		c.insert(new Customer("정민", 10, "vvip"));
//		System.out.println(c.datas);
//		System.out.println(c.getCustomers());
//		
//		System.out.println("정상실행");
//		}catch(Exception e){
//			e.printStackTrace();//발생된 모든 내용..관리자용
//			System.out.println(e.getMessage()); //예외 객체가 보유한 메세지
		}
//		System.out.println(c.getCustomers());
//		System.out.println(VirtualDataBase.getCustomers());
//		
//		System.out.println(c.getCustomers());
//		System.out.println(c.getCustomer("다영"));
	
}

