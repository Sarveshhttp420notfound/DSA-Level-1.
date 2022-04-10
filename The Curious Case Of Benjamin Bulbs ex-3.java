import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner scn=new Scanner(System.in);
        int G=scn.nextInt();
        for(int s=2;s*s<=G;s++){
            System.out.println(s*s);
        }
        
    
    }
}