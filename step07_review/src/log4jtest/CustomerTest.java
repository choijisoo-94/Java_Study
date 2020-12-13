 package log4jtest;

import java.util.logging.Logger;

import annotation.test.CustomerDTO;


public class CustomerTest {

	static Logger logger = Logger.getLogger("log4jtest.CustomerTest");
	
	static void TemperatureTest(double tem) {
		if(tem >= 37.00) {
			logger.warning("코로나 의심 환자이므로 건물 출입 금지입니다." + "체온은" + tem + "도 입니다. ");
		}else {
			logger.info("건물 출입 가능 - 즐거운 하루 되세요~ " + "체온은" + tem + "도 입니다. ");
		}
	}
	public static void main(String[] args) {
		CustomerDTO client1 = new CustomerDTO();
		CustomerDTO client2 = new CustomerDTO();
		
		client1.setName("최지수");
		client1.setTem(39.5);
		
		client2.setName("장종욱");
		client2.setTem(36.5);
		
		System.out.println(client1.getName() + "님" + " " + "체온은" + client1.getTem() + "도 입니다.");
		TemperatureTest(39.5);
		
		System.out.println(client2.getName() + "님" + " " + "체온은" + client2.getTem() + "도 입니다.");
		TemperatureTest(36.5);
		
	}

}
