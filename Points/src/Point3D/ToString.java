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
class fooey{
    static int i = 7;
    int j;
    fooey(int j){
        this.j = j;
    }
    public String toString(){
        return "fooey: i = " + i + "; j =  " +j;
    }
}
public class ToString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        fooey Foo = new fooey(7);
        System.out.println(Foo);
    }
    
}
