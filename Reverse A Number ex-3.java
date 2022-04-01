import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner scn=new Scanner(System.in);
        int p=scn.nextInt();
        while(p!=0){
            int lastdigit=p%10;
            System.out.println(lastdigit);
            p=p/10;
        }
    }
}