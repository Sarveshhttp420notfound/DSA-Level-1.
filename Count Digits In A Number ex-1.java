import java.util.*;
public class Main{
    public static void main(String []args){
        Scanner scn=new Scanner(System.in);
        int j=scn.nextInt();
        int digit=0;
        while(j!=0){
            j=j/10;
            digit++;
        }
        System.out.println(digit);
        
    }
}
