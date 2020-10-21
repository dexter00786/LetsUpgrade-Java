

import java.util.Scanner;

public class Employee {
     public static String name;
     public static int dob, birth_year;
     public static String birth_month;
     public static double monthly_sal, tax;
    // String nm, String bm, int by, int db, double sl

     public void getDetails(){
          Scanner sc = new Scanner(System.in);
          System.out.println("\nEnter the name of the employee: ");
          name = sc.nextLine();
          System.out.println("\nEnter the date of birth of the employee: ");
          dob  = sc.nextInt();
          System.out.println("\nEnter the birth month of the employee: ");
          birth_month = sc.next();
          System.out.println("\nEnter the birth year of the employee: ");
          birth_year = sc.nextInt();
          System.out.println("\nEnter the monthly salary of the employee: ");
          monthly_sal =  sc.nextDouble();
          System.out.println("\nThe name = "+name);
          System.out.println("The age = "+dob);
          System.out.println("The Month of Birth = "+birth_month);
          System.out.println("The Year of Birth = "+birth_year);
               if(monthly_sal>=500000){
                    System.out.println("The Monthly salary = "+monthly_sal);
                    tax = 20;
                    System.out.println("Tax % of the salary = :"+tax);
               }
               else if (monthly_sal<500000 && monthly_sal>=400000){
                    tax = 15;
                    System.out.println("Tax % of the salary is :"+tax);
               }

               else if (monthly_sal<400000 && monthly_sal>=300000){
                    tax = 10;
                    System.out.println("Tax % of the salary is :"+tax);
               }

               else if (monthly_sal<300000 && monthly_sal>=200000){
                    tax = 5;
                    System.out.println("Tax % of the salary is :"+tax);
               }
               else{
                    tax = 0;
                    System.out.println("Tax % is "+tax);
               }
               double tax_amnt = (tax/100)*monthly_sal;
               System.out.println("Tax amount = "+tax_amnt);

          }
     public static void main(String[] args) {
     Employee e = new Employee();
     e.getDetails();
     }
}
