package com.test;

public class VehicleTest {
	public static void main(String[] args) {
		MaruthiCar myCar = new MaruthiCar();
	}
}

class Vehicle {
	public Vehicle() {
		System.out.println("In Vehicle...");
	}
 
}

class Car extends Vehicle {  
	public Car(String msg){
		System.out.println("Message : " + msg);
	}
}

class MaruthiCar extends Car {  
	public MaruthiCar(){
		super("Hello");
		System.out.println("In Maruthi Car...");
	}
}

// What is meant by Polymorphism in java
// what is meant by method overloading
// What is meant by method overriding





