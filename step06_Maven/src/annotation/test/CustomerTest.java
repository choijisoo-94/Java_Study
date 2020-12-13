
package annotation.test;
import model.domain.Customer;

public class CustomerTest {

	public static void main(String[] args) {
		//Customer.builder().name("�̼���")
		//new Customer("�̼���")
		Customer c = Customer.builder().name("�̼���").build();	
		System.out.println(c.toString());
		
		//������ builder() ���� build()
		//new Customer("�̼���", 10)
		Customer c2 = Customer.builder().name("������").age(10).build();	
		System.out.println(c2.toString());
		}

}
