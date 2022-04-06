import java.util.*;
public class Main{
    public static void main(String []args){
        Scanner scn=new Scanner(System.in);
        int s=scn.nextInt();
        int k=scn.nextInt();
        int t=s;
        int d=0;
        while(t!=0){
            t=t/10;
            d++;
        }
        int pow=(int)Math.pow(10,k);
        int le=s/pow;
        int rig=s%pow;
        int mul=(int)Math.pow(10,d-k);
        int ans=rig*mul+le;
        System.out.println(ans);
    }
}