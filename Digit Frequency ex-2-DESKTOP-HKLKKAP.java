import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner scn=new Scanner(System.in);
        int q=scn.nextInt();
        int r=scn.nextInt();
        int ans=aaoo(q,r);
        System.out.println(ans);
    }
    public static int aaoo(int q,int r){
        int y=0;
        while(q!=0){
            int lstdgt=q%10;
            if(lstdgt==r){
                y++;
            }
            q=q/10;
        }
        
       return y ;
    }
}