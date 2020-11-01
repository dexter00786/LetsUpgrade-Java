import java.util.Scanner;

public class Avengers 
{
    Scanner sc = new Scanner(System.in);
    public int age;
    public String name, power, planet, weapon;
    
	public void setDetails(){
        System.out.println("\nEnter the name of avenger:");
        name = sc.nextLine();

        System.out.println("\nEnter the power of avenger:");
        power = sc.nextLine();

        System.out.println("\nEnter the planet of avenger:");
        planet = sc.nextLine();

        System.out.println("\nEnter the weapon of avenger:");
        weapon = sc.nextLine();

        System.out.println("\nEnter the age of avenger:");
        age = sc.nextInt();
    }

    public void printDetails(){
        System.out.println("\nName : "+name);
        System.out.println("Age : "+age);
        System.out.println("Power : "+power);
        System.out.println("Planet : "+planet);
        System.out.println("Weapon : "+weapon);
    }
	
	public static void main(String[] args)
		{
		
				Avengers[] avenger = new Avengers[5];
				
				// creating objects and setting details
				for(int i = 0;i< 5;i++){
					avenger[i] = new Avengers();
					avenger[i].setDetails();
				}
				
				//printing details
				for(int i = 0;i< 5;i++){
				   avenger[i].printDetails();
				}	
		}

}		
		
		