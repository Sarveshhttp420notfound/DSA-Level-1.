import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner scn=new Scanner(System.in);
        int s=scn.nextInt();
        int dig=0;
        while(s!=0){
            s=s/10;
            dig++;
        }
        System.out.println(dig);
    }
    
}


