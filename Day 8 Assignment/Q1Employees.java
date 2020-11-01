  
import java.util.Scanner;
class Employees
{
    String name;
    int age;
    int salary;
    String designation;
    Scanner s=new Scanner(System.in);
    void getDetails(){
        System.out.println("Enter Name:");
        name=s.next();
        System.out.println("Enter Age:");
        age=s.nextInt();
        System.out.println("Enter Salary:");
        salary=s.nextInt();
        System.out.println("Enter Designation:");
        designation=s.next();
    } 
    void displayDetails(){
        System.out.println("The name is "+name);
        System.out.println("The age is "+age);
        System.out.println("The salary is "+salary);
        System.out.println("The designation is "+designation);
    }
}
