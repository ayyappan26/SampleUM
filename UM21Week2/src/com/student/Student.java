package com.student;

class Vehicle {
	public void horn(){
		System.out.println("Horn in Vehicle...");
	}
}

class Car {
	public void horn(){
		System.out.println("Horn in Car method...");
	}
}

class Bus {
	public void steering(){
		System.out.println("steering in Bus method...");
	}
	
}

class Display {
	 public <E>void displayMethod(E obj){
		 if(obj instanceof Car){
			 Car myCar= (Car)obj;
			 myCar.horn();
		 }
		 
		 if(obj instanceof Bus){
			 Bus myBus = (Bus) obj;
			 myBus.steering();
		 }
		 
	 }
}

class Box<T>{
	private T obj;
	
	public void add(T obj){
		this.obj = obj;
	}
	
	public T get(){
		return obj;
	}
	
}



public class Student {
	public static void main(String[] args) {
		 Box<Vehicle> vehicleBox = new Box<Vehicle>();
		 
		 vehicleBox.add(new Vehicle());
		 
		 Vehicle myVehicle = vehicleBox.get();
		 
		 myVehicle.horn();
		 
		 
		 
		 
		 
		
	}
}
