/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Point3D;

class AnotherObject {

    int i;
    String s;
    double d;

    AnotherObject(int i, String s, double d) {
        this.i = i;
        this.s = s;
        this.d = d;

    }

    void display() {
        System.out.println("i = " + i + "; s = " + s + "; d = " + d);
    }
}

/**
 *
 * @author Mike
 */
class TestAnotherObject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AnotherObject ao1 = new AnotherObject(5, "Hello World", 3.4E100);
        AnotherObject ao2 = ao1;
        ao1.i =3;
        ao1.s = "Universe Change";
        ao1.d = Math.PI;
        ao2.display();
    }

}
