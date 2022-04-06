import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int o=scn.nextInt();
        int p=n;
        int d=0;
        while(p!=0){
            p=p/10;
            d++;
        }
        int pow=(int)Math.pow(10,o);
        int left=n/pow;
        int right=n%pow;
        int mul=(int)Math.pow(10,d-o);
        int ans=right*mul+left;
        System.out.println(ans);
    }
}