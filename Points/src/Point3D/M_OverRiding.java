/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Point3D;

class A {

    void hello() {
        System.out.println("Hello from A");
    }

    void hello(int i) {
        System.out.println("Hello from A  hello(int) " + i);
    }
}

class B extends A {

    void hello() {
        System.out.println("Hello from B hello()");
    }
}
class C extends B{

    void hello(String s) {
        System.out.println("Hello from C hello(String) " + s);
    }

//    void hello(int i) {
//        System.out.println("Hello from C hello(int)" + i );
//    }
//    void hello() {
//       System.out.println("Hello from C hello()" );
//    }
}
/**
 *
 * @author Mike
 */
public class M_OverRiding {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        A obj = new C();
        obj.hello(12);

    }

}
