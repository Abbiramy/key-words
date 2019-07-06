package Super;

public class Car {
	 void displayMsg(){
	  System.out.println("In Parent class Car");
	 }
	}

	class FastCar extends Car{
	 void displayMsg(){
	  System.out.println("In child class FastCar");
	  // calling super class method
	  super.displayMsg();
	 }
	 public static void main(String[] args){
	  FastCar fc = new FastCar();
	  fc.displayMsg();
	 }
	}