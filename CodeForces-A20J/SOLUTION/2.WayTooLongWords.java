import java.util.*;
public class Main{
public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int count = sc.nextInt();
    
    for(int i=0; i< count; i++){
    String n = sc.next();
    int l = n.length();
    if(l>10)
    System.out.println(n.charAt(0)+""+(l-2)+""+n.charAt(l-1));
    if(l<=10)
    System.out.println(n);
}}}
