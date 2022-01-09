import java.util.*;
public class Main{
public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    String n1 = sc.next();
    String n2 = sc.next();
    String n3 = n1.toLowerCase();
    String n4 = n2.toLowerCase();
    int  c = (n3.compareTo(n4));
    
    if(c==0)
    System.out.println(0);
    
    else if(c<0)
    System.out.println(-1);
    
    else
    System.out.println(1);
    
}}
