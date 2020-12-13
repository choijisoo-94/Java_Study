/* client�� 	1 ���� - ��� ������ �˻� ��û�̶� ����
 * 			2 ���� - �Ѹ��� �� ���� �˻� "
 * 			3 ���� - ����
 * 			4 ���� - ����
 * 			5 ���� - ����
 */
package controller;

import model.CustomerModel;
import model.domain.Customer;
import view.EndView;

public class CustomerController {
	private static CustomerModel cm = new CustomerModel();
	
	public static void reqProcess(int reqNo) {
		if(reqNo == 1) { //��� �˻�
			EndView.viewCustAll(cm.getCustomers());

		}else if(reqNo == 2) {
			Customer cust = cm.getCustomer("�ٿ�");
			if(cust != null) {
				EndView.viewCust(cust);
			}else {
				EndView.validateReq("�ش� ���� �� �����մϴ�.");
			}
		}else if(reqNo == 3) {
			boolean result = cm.update("�߱�", "gold");
			
			if(result == true) {
				EndView.validateReq("�� ��� ���� �Ϸ�");
			}else {
				EndView.validateReq("id�� �� �����ϴ� ���� ����� �����Ϸ� �ؼ� ����");
			}
		}else if(reqNo == 4) {
			int result = cm.delete("�߱�");
			if(result == 1) {
				EndView.validateReq("�� ���� �Ϸ�");
			}else {
				EndView.validateReq("�����Ϸ��� �� id�� �����ϴ�.");
			}
		}else if(reqNo == 5) {
			
		try {
			cm.insert(new Customer("�̵���", 22, "vvip"));
			EndView.validateReq("�� ��� �Ϸ�");
		}catch (Exception e) {
			e.printStackTrace(); //������ �� ���� �����ڸ� Ȯ�� ������ �޼���
			EndView.invalidateReq("�ߺ� id ��õ� �ϼ���"); //client ���� ���� �޼���
		}
		}else {
			EndView.invalidateReq("��û�� ���յǴ� ���񽺰� �����ϴ�.");
		}
	}
	
}
