package second;
import java.util.Scanner;

public class Pilot extends Employee{
    private long pilotId;
    Scanner sc=new Scanner(System.in);

    public void setPilotId(){
        System.out.println("Enter pilot Id");
        pilotId=sc.nextLong();
    }
    public void getPilotId(){
        System.out.println("Pilot Id is "+pilotId);
    }
}
