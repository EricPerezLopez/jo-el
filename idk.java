
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class idk {
    public static void main(String[] args) {


        int x;
        int y;
        String a1="1,";
        String a2="2,";
        String a3="3,";
        String a4="4";
        int spaces = 4;
        Scanner sc = new Scanner(System.in);
    
        x = sc.nextInt();
        y = sc.nextInt();

        if (x>0) {
        a2="";
        a3="";
       }
       if (x<0) {
        a4="";
        a1="";

       }
       if (y>0) {
        a4="";
        a3="";
       }
       if (y<0) {
        a2="";
        a1="";
       }
       //
       if (a4 == "" && a3 == "3,") {a3 = "3";}
       if (a3 == "" && a4== "" && a2 =="2,") {a2 = "2";}
       if (a2 == "" && a3 == "" && a4 =="" && a1 == "1,") {a1 = "1";}
       
       System.out.println(a1 + a2 + a3 + a4);
       }
        }


