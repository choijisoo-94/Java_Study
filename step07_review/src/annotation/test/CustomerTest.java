package annotation.test;

public class CustomerTest {

	public static void main(String[] args) {
		CustomerDTO client = new CustomerDTO();
		client.setName("최지수"); //고객명
		client.setTem(36.5); //고객 온도
		System.out.println(client.toString());
		}

}
