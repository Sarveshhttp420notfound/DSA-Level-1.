import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner scn=new Scanner(System.in);
        int z=scn.nextInt();
        int x=scn.nextInt();
        int q=scn.nextInt();
        if(z*z==(x*x+q*q)){
            System.out.println("Tr");
        }
        else if(x*x==(z*z+q*q)){
            System.out.println("Tr");
        }
        else if(q*q==(x*x+z*z)){
            System.out.println("Tr");
        }
        else{
            System.out.println("F");
        }
        
    }
}