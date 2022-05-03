import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[]args)throws Exception {
        Scanner scn=new Scanner(System.in);
        int b=scn.nextInt();
        int []arr=new int[b];
        for(int i=0;i<b;i++){
            arr[i]=scn.nextInt();
        }
        int drain=scn.nextInt();
        int ans=drop(arr,drain);
        System.out.println(ans);
    }
    public static int drop(int[]arr,int drain){
        int idx=-1;
        for(int i=0;i<arr.length;i++){
            if(drain==arr[i]){
                idx=i;
            }
        }
        return idx;
    }
}