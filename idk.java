
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class idk {
    public static void main(String[] args) {        
        Scanner ns = new Scanner(System.in);
    
       // Nota1 = ns.nextLine();
      
        String[] dies = new String[7];
        dies[0]="lunes";
        dies[1]="martes";
        dies[2]="miercoles";
        dies[3]="jueves";
        dies[4]="viernes";
        dies[5]="sabado";
        dies[6]="domingo";

       // System.out.println(noms[3]);
        //for (int i=0; i<noms.length; i++){System.out.println(noms[i]);}
        for (int i=0; i<5;i++){
            System.out.println("a currar " + dies[i]);
        }
        for (int i=5;
        i<dies.length;
        i++)
        {System.out.println("descansar " + dies[i]);}
        }
  }


