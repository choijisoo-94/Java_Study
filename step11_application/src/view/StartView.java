package view;

import controller.CustomerController;

public class StartView {
	
	//��� �˻� -> ���� -> ��� �˻� �Ǵ� �ش� �� �˻� -> ���� -> ��� �˻� �Ǵ� �ش� �� �˻� ->
	public static void main(String[] args) {
		System.out.println("--1. ��� �� ���� �˻� --");
		CustomerController.reqProcess(1);
		
		System.out.println("\n--2. ���� �� �˻� --");
		CustomerController.reqProcess(5);
		CustomerController.reqProcess(1);
		
		System.out.println("\n--3. ���� �� �˻� --");
		CustomerController.reqProcess(3);
		CustomerController.reqProcess(1);
		
		System.out.println("\n--4. ���� �� �˻� --");
		CustomerController.reqProcess(4);
		CustomerController.reqProcess(1);
		
		System.out.println("\n--5. �Ѹ��� �� ���� �˻� --");
		CustomerController.reqProcess(2);
	
	}
}
