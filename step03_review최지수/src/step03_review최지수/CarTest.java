package step03_reviewÃÖÁö¼ö;

public class CarTest {

	public static void main(String[] args) {
		Car a1 = new Car();
		Car a2 = new Car();
		Car a3 = new Car();
		
		a1.name = "bmw";
		a2.name = "genesis";
		a3.name = "tesla";
		
		String name1 = a1.name;
		String name2 = a2.name;
		String name3 = a3.name;
		
		System.out.println(name1);
		System.out.println(name2);
		System.out.println(name3);
		
		a1.num = 1234;
		a2.num = 4321;
		a3.num = 9876;
		
		int num1 = a1.num;
		int num2 = a2.num;
		int num3 = a3.num;
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		
		a1.color = "black";
		a2.color = "white";
		a3.color = "blue";
		
		String color1 = a1.color;
		String color2 = a2.color;
		String color3 = a3.color;
		
		System.out.println(color1);
		System.out.println(color2);	
		System.out.println(color3);
		
		System.out.println("1. " + "first : " + name1 + " - " + num1 + " - " + color1 );
		System.out.println("2. " + "second : " + name2 + " - " + num2 + " - " + color2 );
		System.out.println("3. " + "third : " + name3 + " - " + num3 + " - " + color3 );
	}

}
