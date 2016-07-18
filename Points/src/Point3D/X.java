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

    float f;
    static int array[];

    static {
        array = new int[6];
        for (int i = 0; i < 6; i++) {
            array[i] = i * i;
        }

    }
}

class XI extends X {

    StringBuffer sb;
    
}

class XI_I extends XI {

    String s;
}

class XI_II extends XI_I {

    Integer i;
}

//class StaticInitializationBlock {
//
//    public static void main(String args[]) {
//        for (int i = 0; i < 6; i++) {
//            System.out.println(X.array[i]);
//        }
//    }
//}
class InheritanceHeirarchy {

    public static void main(String args[]) {
        //X x = new X();
        XI_II z = new XI_II();
        z.f = 4.35f;
        z.sb = new StringBuffer("Yo Mama, ");
        z.s = "is";
        z.i = new Integer(30);

        System.out.println("z.f " + z.f);
        System.out.println("z.sb " + z.sb);
        System.out.println("z. " + z.s);
        System.out.println("z.i " + z.i);

        
    }

}
