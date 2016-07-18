/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Point3D;

class E {

    int x;
    int g = 100;
}

class F extends E {

    String x;
    int g = 200;

    void display() {
        System.out.println("g = " + g);
        System.out.println("super g = " + super.g);

    }

}

/**
 *
 * @author Mike
 */
public class V_Hiding {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        F f = new F();
        f.x = "This is my string";
        System.out.println("f.x = " + f.x);
        f.display();
        E e = new E();
        e.x = 45;
        System.out.println("e.x = " + e.x);
    }

}
