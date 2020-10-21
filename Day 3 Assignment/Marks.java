

import java.util.Scanner;

class Marks{
    int m1, m2, m3, m4, m5;
    static void Grade(float per){

        if(per>=90){
            System.out.println("Grade A");
        }
        else if(per<90 && per>=80){
            System.out.println("Grade B");
        }
        else if(per<80 && per>=70){
            System.out.println("Grade c");
        }
        else if(per<70 && per>=60){
            System.out.println("Grade D");
        }
        else if(per<60 && per>=50){
            System.out.println("Grade E");
        }
        else if(per<50 && per>=33){
            System.out.println("Grade E-");
        }
        else{
            System.out.println("Fail");
        }
    }

    public static void main(String[] args) {
        Marks m = new Marks();
        Scanner s = new Scanner(System.in);

        System.out.println("\nEnter the Marks of 5 subjects:");
        m.m1 = s.nextInt();
        m.m2 = s.nextInt();
        m.m3 = s.nextInt();
        m.m4 = s.nextInt();
        m.m5 = s.nextInt();

        float total_marks = m.m1+m.m2+m.m3+m.m4+m.m5;
        System.out.println("\nTotal Marks :"+total_marks);

        float percentage;
        percentage = (total_marks/500)*100;
        System.out.println("\ntotal Percentage is: "+percentage);

        Grade(percentage);
    }
}