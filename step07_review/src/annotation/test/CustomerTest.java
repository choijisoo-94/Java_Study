package annotation.test;

public class CustomerTest {

	public static void main(String[] args) {
		CustomerDTO client = new CustomerDTO();
		client.setName("������"); //����
		client.setTem(36.5); //�� �µ�
		System.out.println(client.toString());
		}

}
