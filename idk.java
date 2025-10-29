
import java.util.Scanner;


public class idk {
    public static void main(String[] args) {        
        Scanner ns = new Scanner(System.in);
        int lel;
        lel = ns.nextInt();
        int[] vots = new int[lel];
        for (int i=0; i<vots.length;i++ ){
            vots[i] = ns.nextInt();
        }
        System.out.println(mostFreqEle(vots)); 
       
  }}


