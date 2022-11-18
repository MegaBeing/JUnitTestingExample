import java.util.*;
import java.util.Scanner;
public class JUnitClass {
    public static void AddString(String s1,String s2){
        System.out.println(s1+s2);
    }
    public static void Addnumber(int a1,int a2){
        System.out.println(a1+a2);
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String s1=scan.nextLine();
        String s2=scan.nextLine();
        AddString(s1,s2);
        int a1=scan.nextInt();
        int a2=scan.nextInt();
        Addnumber(a1,a2);
    }
}
