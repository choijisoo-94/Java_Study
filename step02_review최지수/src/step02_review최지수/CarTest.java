package step02.review최지수;

public class CarTest {
	
	public static void main(String [] args) {
		
		Car a1 = new Car();
		Car a2 = new Car();
		
		a1.name = "BMW";
		a2.name = "tesla";
		
		a1.num = 1234;
		a2.num = 2345;
		
		a1.color = "black";
		a2.color = "white";
		
		String name1 = a1.name;
		String name2 = a2.name;
		
		System.out.println(name1);
		System.out.println(name2);
		
		int num1 = a1.num;
		int num2 = a2.num;
		
		System.out.println(num1);
		System.out.println(num2);
		
		String color1 = a1.color;
		String color2 = a2.color;
		
		System.out.println(color1);
		System.out.println(color2);
		
		//차1
		System.out.println("1 : " + name1 + "/" + num1 + "/" + color1 );
		System.out.println("2 : " + name2 + "/" + num2 + "/" + color2 );
	}

}

