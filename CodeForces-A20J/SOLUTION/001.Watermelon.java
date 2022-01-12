import java.util.*;
public class Main{
public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int diff = 0;
    diff = n-2;
    if(diff>=2 && diff%2==0)
    System.out.println("YES");
    
    else
    System.out.println("NO");
}}
