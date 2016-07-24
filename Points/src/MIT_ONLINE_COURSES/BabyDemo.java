/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MIT_ONLINE_COURSES;

class Baby {

    static int numBabiesMade = 0;
}

/**
 *
 * @author Mike
 */
public class BabyDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Baby.numBabiesMade = 100;
        Baby b1 = new Baby();
        Baby b2 = new Baby();
        Baby.numBabiesMade = 2;

        System.out.println(b1.numBabiesMade);
        System.out.println(b2.numBabiesMade);

    }

}
