import java.util.*;
public class Main{
public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    String n = sc.next();
    int l = n.length();
    for (int i=0; i<l; i++)
    {
        if (n.charAt(i)=='A'||n.charAt(i)=='a'||n.charAt(i)=='E'||n.charAt(i)=='e'||n.charAt(i)=='I'||n.charAt(i)=='i'||n.charAt(i)=='O'||n.charAt(i)=='o'||n.charAt(i)=='U'||n.charAt(i)=='u'||n.charAt(i)=='Y'||n.charAt(i)=='y'){
        }
        else{
            System.out.print("."+Character.toLowerCase(n.charAt(i)));
        }
    }
}}
