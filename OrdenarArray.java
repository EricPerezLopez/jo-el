//package lasalle;



/**
 * Depura el codi d'aquest algoritme que hauria d'ordenar l'array a de forma ascendent.
 * Resultat esperat de l'execussió: 1 2 3 4 5 6 7 8 9 10
 */
public class OrdenarArray {
    public static void main(String[] args) {
        int [] a  = {7,2,4,8,3,9,1,5,10,6};

        for (int i = 0; i < a.length; i++) {

            for (int j = 1; j < (a.length - i); j++) {
                if (a[j - 1] > a[j]) {
                    int temporal = a[j - 1];
                    a[j - 1] = a[j];
                    a[j] = temporal;
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }
}