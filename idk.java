
import java.util.Scanner;


public class idk {
    public static void main(String[] args) {        
        Scanner ns = new Scanner(System.in);
        int num;
       num = ns.nextInt();
        while (num>0) {
        int lel;
        lel = ns.nextInt();
         int lol;
        lol = ns.nextInt();
        float[][] mem = new float[lel][lol];
        float max=0;
  //      for (int i=0; i<mem.length;i++){
//int score = ns.nextInt();
//mem[i] = score;
       for (int i=0 ; i<mem.length;i++) {
        max=mem[i][0];
   for (int j=0 ; j<mem[i].length ; j++) {
     float score = ns.nextFloat();
mem[i][j] = score;
 
 
 if(max<mem[i][j]){
            max= mem[i][j];
                }
    }
  }
System.out.println(max);
  
}
}
}


