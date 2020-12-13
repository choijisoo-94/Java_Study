package log4jTest;

import org.apache.log4j.Logger;

public class Log4jTest {
	//log4jtest package내의 Log4jTest 클래스에 log기록이 가능한 객체 생성
	static Logger logger = Logger.getLogger("log4jtest.Log4jTest");
	
	//사이트 운영 관리자 관점
	//무효한 id로 접속 시도를 했다를 기록(해커라 간주)
	
	
	static void login(String id) {
		if(id.equals("pd")) {
			logger.trace("pd님 로그인 성공");
			//유효한 경우 정상 실행되는 로직들...있다 가정
		}else {
			logger.trace
			("pd가 아닌 사람이 접속 시도 했음" + id);
		}
	}

	public static void main(String[] args) {
		login("pd");
		login("test");
		
	}
	
//	public static void main(String[] args) {
//		logger.trace("trace 레벨");
//		logger.debug("debug 레벨");
//		logger.info("info 레벨");
//		logger.warn("warn 레벨");
//		logger.fatal("fatal 레벨");
//		
//		
//		
//	}

}
