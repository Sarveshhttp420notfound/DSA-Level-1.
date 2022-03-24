import java.util.*;
public class Main{
    public static void main(String []args){
        Scanner scn=new Scanner(System.in);
        int marks=scn.nextInt();
        if (marks>8){
            System.out.println("a");
        }
        else if(marks>6){
            System.out.println("b");
        }
        else if(marks>5){
            System.out.println("c");
        }
        else if(marks>4){
            System.out.println("d");
        }    
        else{
            System.out.println("e");
        }
    }
}