import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[]args)throws Exception{
        Scanner scn=new Scanner(System.in);
        int d=scn.nextInt();
        int []arr=new int[d];
        for(int i=0;i<d;i++){
            arr[i]=scn.nextInt();
        }
        int astro=scn.nextInt();
        int asp=cro(arr,astro);
        System.out.println(asp);
    }
    public static int cro (int []arr,int astro){
        int idx=-1;
        for(int i=0;i<arr.length;i++){
            if(astro==arr[i]){
                idx=i;
            }
        }
        return idx;
    }
}