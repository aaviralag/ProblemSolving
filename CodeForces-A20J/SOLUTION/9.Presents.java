import java.util.*;
public class Main {
public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    int n = sc.nextInt();
    int[] numbers=new int [n];
    for(int i=0;i<n;i++)
    {
        numbers[i]=sc.nextInt();
    }
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            if((numbers[j]-1)==i){
                System.out.print((j+1)+" ");
                break;
                
            }}}
}}
