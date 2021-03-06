package com.core.java.collections;

import java.util.TreeSet;

class Vehicle implements Comparable{
	int id ;
	String brand;
	String color;
	String model;
	String type;
	public Vehicle(String brand, String color, String model, String type) {
		super();
		this.brand = brand;
		this.color = color;
		this.model = model;
		this.type = type;
	}
	@Override
	public int compareTo(Object o) {
		Vehicle v = (Vehicle)o;
		int cmp = this.type.compareTo(v.type);
		return (cmp == 0 )? v.brand.compareTo(this.brand) : cmp ;
	}
	@Override
	public String toString() {
		return "Vehicle [id=" + id + ", brand=" + brand + ", color=" + color + ", model=" + model + ", type=" + type
				+ "]\n";
	}
	
	
	
	
}

public class TreesetTest2 {

	public static void main(String[] args) {
		
		Vehicle v1 = new Vehicle("BMW","black","C4","car");
		Vehicle v4 = new Vehicle("Honda","Red","CBR","Byke");
		Vehicle v3 = new Vehicle("AUDI","White","Q7","car");
		Vehicle v5 = new Vehicle("Kingfisher","White","","Airline");
		Vehicle v2 = new Vehicle("Benz","black","S4","car");
		
		TreeSet< Vehicle> vehicles = new TreeSet<Vehicle>(); 
		
		vehicles.add(v1);
		vehicles.add(v2);
		vehicles.add(v3);
		vehicles.add(v4);
		vehicles.add(v5);
		
		
		System.out.println(vehicles);
		
	}
}
