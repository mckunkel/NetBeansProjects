/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Point3D;

/**
 *
 * @author michaelkunkel
 */
public class ClassDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Integer obj = new Integer(8);
        Class cls = obj.getClass();
        String scls = obj.toString();
        Class supercls = cls.getSuperclass();
        System.out.println(cls);
        System.out.println(scls);
        System.out.println(supercls);

    }

}
