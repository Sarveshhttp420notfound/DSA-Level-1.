import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner scn=new Scanner(System.in);
        int q=scn.nextInt();
        int k=scn.nextInt();
        int tp=q;
        int nod=0;
        while(tp!=0){
            tp=tp/10;
            nod++;
        }
        int pow=(int)Math.pow(10,k);
        int left=q/pow;
        int right=q%pow;
        int mul=(int)Math.pow(10,nod-k);
        int ans=right*mul+left;
        System.out.println(ans);
    }
}