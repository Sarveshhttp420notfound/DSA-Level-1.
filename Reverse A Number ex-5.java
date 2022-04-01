import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner scn=new Scanner(System.in);
        int u=scn.nextInt();
        while(u!=0){
            int ltdigit=u%10;
            System.out.println(ltdigit);
            u=u/10;
            
        }
    }
}