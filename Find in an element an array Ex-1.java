import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[]args) throws Exception{
        Scanner scn=new Scanner(System.in);
        int c=scn.nextInt();
        int []arr=new int[c];
        for(int i=0;i<c;i++){
           arr[i]=scn.nextInt();
        }
        int key=scn.nextInt();
        int soar=roar(arr,key);
        System.out.println(soar);
    }
    public static int roar(int []arr,int key){
        int idx=-1;
        for(int i=0;i<arr.length;i++){
            if(key==arr[i]){
                idx=i;
            }
        }
        return idx;
    }
}