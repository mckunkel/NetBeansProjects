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
class X {

    static int array[];

    static {
        array = new int[6];
        for (int i = 0; i < 6; i++) {
            array[i] = i * i;
        }

    }
}

class StaticInitializationBlock {

    public static void main(String args[]) {
        for (int i = 0; i < 6; i++) {
            System.out.println(X.array[i]);
        }
    }
}
