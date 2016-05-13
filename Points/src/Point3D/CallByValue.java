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
public class CallByValue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i = 5;
        int j[] = {1, 2, 3, 4};
        StringBuffer sb = new StringBuffer("abcde");

        //Display variables
        display(i, j, sb);

        //call method
        a(i, j, sb);

        //Display variables again
        display(i, j, sb);

        StringBuffer saaa = new StringBuffer("hhhhh");
        b(sb, saaa);
        System.out.println(sb);
        System.out.println(saaa);

    }

    static void a(int i, int j[], StringBuffer sb) {
        i = 7;
        j[0] = 11;
        sb.append("fghij");
    }

    static void b(StringBuffer sb1, StringBuffer sb2) {
        sb1 = new StringBuffer("ccccc");
        sb2.append("fffffuckfffff");
    }

    static void display(int i, int j[], StringBuffer sb) {
        System.out.println(i);
        for (int index = 0; index < j.length; index++) {
            System.out.print(j[index] + " ");
        }
        System.out.println("");
        System.out.println(sb);

    }

}
