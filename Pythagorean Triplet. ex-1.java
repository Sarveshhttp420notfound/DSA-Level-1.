import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner scn=new Scanner(System.in);
        int z=scn.nextInt();
        int x=scn.nextInt();
        int c=scn.nextInt();
        if(z*z==(x*x+c*c)){
            System.out.println("Tr");
        }
        else if (x*x==(z*z+c*c)){
            System.out.println("Tr");
        }
        else if(c*c==(z*z+x*x)){
            System.out.println("Tr");
        }
        else{
            System.out.println("Tr");
        }
    }
}