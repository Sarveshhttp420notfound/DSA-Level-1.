import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner scn=new Scanner(System.in);
        int r=scn.nextInt();
        for(int k=2;k*k<=r;k++){
            System.out.println(k*k);
        }
        
    }
}