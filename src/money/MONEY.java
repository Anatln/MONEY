/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package money;

/**
 *
 * @author Anastasiia
 */
public class MONEY {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] x;
        x = new int[12];
        x[0] = 1;
        x[1] = 1;
        x[2] = 1;
        x[3] = 1;
        x[4] = 1;
        x[5] = 1;
        x[6] = 1;
        x[7] = 1;
        x[8] = 1;
        x[9] = 0;
        x[10] = 1;
        x[11] = 1;
        int mon = 0;
        int xmin = 0;
        for (int j = 0; j < x.length; j++) {
            if (x[j] < xmin) {
                            mon = j+1;
            System.out.println("Nepravilnoy byla moneta nomer: " + mon);
            break;} else {
                xmin = x[j];
//                System.out.println("Nepravilnoy byla moneta nomer: " + mon);
//            break;
            }

            

        }

    }
}
