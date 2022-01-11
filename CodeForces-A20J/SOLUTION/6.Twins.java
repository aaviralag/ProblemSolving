
import java.util.*;
public class Main {
public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    int n = sc.nextInt();
    int[] numbers=new int[n];
    int total=0;
    
    for(int i=0;i<n;i++)
    {
        numbers[i]=sc.nextInt();
        total=total+numbers[i];
    }
    
    Arrays.sort(numbers);
    int total2=0, Coins=0;
    
    for(int i=n-1;i>=0;i--){
        total2=total2+numbers[i];
        Coins++;
        if(total2>(total-total2))
        {
            System.out.println(Coins);
            break;
        }
 
    }
}}
