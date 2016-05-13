/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Point3D;

/**
 *
 * @author Mike
 */
class Rock {

    double mass;

    Rock(double mass) {
        this.mass = mass;
    }
}

class myRock {

    static int NUMROCKS = 10;

    public static void main(String[] args) {
        Rock rocks[] = new Rock[NUMROCKS];
        for (int i = 0; i < NUMROCKS; i++) {
            double mass = (double) (10 * Math.random());
            rocks[i] = new Rock(mass);
        }
        double total_mass = 0;
        for (int i = 0; i < NUMROCKS; i++) {
            System.out.println(rocks[i].mass + "  " + total_mass);
            total_mass += rocks[i].mass;

        }
        System.out.println(total_mass);

    }

}
