import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int temp=n;
        int nod=0;
        int k=scn.nextInt();
        while(temp!=0){
            temp=temp/10;
            nod++;
            
        }
        
        int pow=(int)Math.pow(10,k);
        int left=n/pow;
        int right=n%pow;
        int mul=(int)Math.pow(10,nod-k);
        int ans=right*mul+left;
        
        System.out.println(ans);
    }
}