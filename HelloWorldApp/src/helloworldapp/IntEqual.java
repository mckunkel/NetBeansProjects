/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldapp;

/**
 *
 * @author michaelkunkel
 */
public class IntEqual {

    public static void main(String args[]) {
        Integer obj = new Integer(5);
        System.out.println(obj);
        obj = new Integer(6);
        System.out.println(obj);

        obj = new Integer(7);
        System.out.println(obj);
        Integer obj2 = new Integer(10);
        Integer obj3 = new Integer(7);

        boolean no = obj2.equals(obj);
        boolean compare2 = obj3.equals(obj);
        if(!no){
            System.out.println("I did not match " + Integer.valueOf(obj) + " to " +  Integer.valueOf(obj2))  ;
        }
        System.out.println(no);

    }

}
