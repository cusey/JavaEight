package org.cusey.Polymorphism;

public class Employee {
	   private String name;
	   private String address;
	   private int number;

	   public Employee(String name, String address, int number) {
	      System.out.println("Constructing an Employee");
	      this.name = name;
	      this.address = address;
	      this.number = number;
	   }

	   public void mailCheck() {
	      System.out.println("Mailing a check to " + this.name + " " + this.address);
	   }

	   public String toString() {return name + " " + address + " " + number;}

	   public String getName() {return name;}
	   public int getNumber() {return number;}

	   public String getAddress() {return address;}
	   public void setAddress(String newAddress) {address = newAddress;}

	}
