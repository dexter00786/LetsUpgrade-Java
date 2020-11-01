package second;
import java.util.Scanner;

public class Doctor extends Employee{
    private String hospitalName;
    Scanner sc=new Scanner(System.in);

    public void setHospitalName(){
        System.out.println("Enter hospital name");
        hospitalName=sc.next();
    }
    public void getHospitalName(){
        System.out.println("Doctor works in "+hospitalName);
    }
    
}
