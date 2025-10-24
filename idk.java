
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class idk {
    public static void main(String[] args) {


        String j1;
        
        Scanner ns = new Scanner(System.in);
    
        j1 = ns.nextLine();
        
        switch (j1) {
            case "Q":
               System.out.println("Skill 1");
                break;
         case "w":
               System.out.println("Skill 2");
                break;
        case "E":
               System.out.println("Skill 3");
                break;
         case "R":
               System.out.println("Ultimate");
                break;
         case "B":
               System.out.println("Recall");
                break;
         case "D":
               System.out.println("Bronzes never use summoners");
                break;
                case "F":
               System.out.println("Bronzes never use summoners");
                break;
               
       

            default:
            System.out.println("Error");
                break;
        }
  }
}

