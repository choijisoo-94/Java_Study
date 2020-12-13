
package annotation.test;
import model.domain.Customer;

public class CustomerTest {

	public static void main(String[] args) {
		//Customer.builder().name("이순신")
		//new Customer("이순신")
		Customer c = Customer.builder().name("이순신").build();	
		System.out.println(c.toString());
		
		//시작은 builder() 끝은 build()
		//new Customer("이순신", 10)
		Customer c2 = Customer.builder().name("전지현").age(10).build();	
		System.out.println(c2.toString());
		}

}
