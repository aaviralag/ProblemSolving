import java.util.*;
public class Main{
public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    String n1 = sc.next();
    int b[] = new int[3];
    int l = n1.length();
    String j="";
    for(int i = 0; i<l; i++){
    char c = n1.charAt(i);
    
    if(c=='1')
    b[0]++;
    
    else if(c=='2')
    b[1]++;
    
    else if(c=='3')
    b[2]++;
    }

    while(b[0]!=0){
        b[0]--;
        j=j+"1+";
    }
    while(b[1]!=0){
        b[1]--;
        j=j+"2+";
    }
    while(b[2]!=0){
        b[2]--;
        j=j+"3+";
    }
    System.out.println(j.substring(0, j.length() - 1));
}}
    
