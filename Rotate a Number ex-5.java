import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner scn=new Scanner(System.in);
        int l=scn.nextInt();
        int j=scn.nextInt();
        int t=l;
        int nd=0;
        while(t!=0){
            t=t/10;
            nd++;
        }
        int pow=(int)Math.pow(10,j);
        int left=l/pow;
        int right=l%pow;
        int mul=(int)Math.pow(10,nd-j);
        int ans=right*mul+left;
        System.out.println(ans);
        
    }
}