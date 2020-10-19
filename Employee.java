package com.firstjava;

public class Employee {
     public String name;
     public int age;
     public String city;

     public void Display(){
     System.out.println("\nThe name is "+name);
     System.out.println("The age is "+age);
     System.out.println("The city is "+city);
     }
     public static void main(String[] args) {
          // write your code here
          Employee e = new Employee();
          e.name = "sachin";
          e.age = 21;
          e.city = "Delhi";
          e.Display();
          e.name = "Nishant";
          e.age = 20;
          e.city = "Ghaziabad";
          e.Display();
     }
}
