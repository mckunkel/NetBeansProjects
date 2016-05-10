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
class Widget {

    double w;

    Widget(String s) {
        w = Double.valueOf(s);

    }

    Widget(StringBuffer sb) {
        String s = sb.toString();
        w = Double.valueOf(s);
    }

    Widget(double d) {
        w = d;
    }

}

class WidgetConstructors {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("-20.3");
        Widget w1 = new Widget("5.5");
        Widget w2 = new Widget(sb);
        Widget w3 = new Widget(Math.PI);

        System.out.println(w1.w);
        System.out.println(w2.w);
        System.out.println(w3.w);

    }

}
