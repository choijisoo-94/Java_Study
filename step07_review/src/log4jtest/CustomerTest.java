 package log4jtest;

import java.util.logging.Logger;

import annotation.test.CustomerDTO;


public class CustomerTest {

	static Logger logger = Logger.getLogger("log4jtest.CustomerTest");
	
	static void TemperatureTest(double tem) {
		if(tem >= 37.00) {
			logger.warning("�ڷγ� �ǽ� ȯ���̹Ƿ� �ǹ� ���� �����Դϴ�." + "ü����" + tem + "�� �Դϴ�. ");
		}else {
			logger.info("�ǹ� ���� ���� - ��ſ� �Ϸ� �Ǽ���~ " + "ü����" + tem + "�� �Դϴ�. ");
		}
	}
	public static void main(String[] args) {
		CustomerDTO client1 = new CustomerDTO();
		CustomerDTO client2 = new CustomerDTO();
		
		client1.setName("������");
		client1.setTem(39.5);
		
		client2.setName("������");
		client2.setTem(36.5);
		
		System.out.println(client1.getName() + "��" + " " + "ü����" + client1.getTem() + "�� �Դϴ�.");
		TemperatureTest(39.5);
		
		System.out.println(client2.getName() + "��" + " " + "ü����" + client2.getTem() + "�� �Դϴ�.");
		TemperatureTest(36.5);
		
	}

}
