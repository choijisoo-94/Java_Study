package log4jTest;

import org.apache.log4j.Logger;

public class Log4jTest {
	//log4jtest package���� Log4jTest Ŭ������ log����� ������ ��ü ����
	static Logger logger = Logger.getLogger("log4jtest.Log4jTest");
	
	//����Ʈ � ������ ����
	//��ȿ�� id�� ���� �õ��� �ߴٸ� ���(��Ŀ�� ����)
	
	
	static void login(String id) {
		if(id.equals("pd")) {
			logger.trace("pd�� �α��� ����");
			//��ȿ�� ��� ���� ����Ǵ� ������...�ִ� ����
		}else {
			logger.trace
			("pd�� �ƴ� ����� ���� �õ� ����" + id);
		}
	}

	public static void main(String[] args) {
		login("pd");
		login("test");
		
	}
	
//	public static void main(String[] args) {
//		logger.trace("trace ����");
//		logger.debug("debug ����");
//		logger.info("info ����");
//		logger.warn("warn ����");
//		logger.fatal("fatal ����");
//		
//		
//		
//	}

}
