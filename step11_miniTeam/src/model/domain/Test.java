package model.domain;

	public class Test {
		
		static public class Name {
			private String FirstName;
			private String LastName;
			Cat cat = new Cat();
		}
		static public class Cat {
			private String race;
			private int age1;
			Animal1 animal1 = new Animal1();
		}
		static public class Animal1 {
			private String name1; 
			private String race;
			Dog dog = new Dog();
		}
		static public class Dog {
			private String color;
			private int age2;
			Animal2 animal2 = new Animal2();
		}
		static public class Animal2 {
			private String name2; 
			private int age;
			private String type; 
			Rabbit rabbit = new Rabbit();
		}
		static public class Rabbit {
			private String name3;
			private String color;
			Chicken chicken = new Chicken();
		}
		static public class Chicken {
			Chick chick = new Chick();
		}
		static public class Chick {
	  		String hen;
	  		String rooster;
		}
		public static void main(String[] args) {
			Name a = new Name();
			//20
		}
	}
