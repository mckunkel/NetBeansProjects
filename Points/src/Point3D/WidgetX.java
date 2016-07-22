/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Point3D;

import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author michaelkunkel
 */
abstract class WidgetY {

    String color;

    abstract int getMass();

    public String toString() {
        return getClass().getName() + " : " + color + " , " + getMass();
    }

}

class WidgetA extends WidgetY {

    final static int MASS = 4;

    WidgetA(String color) {
        this.color = color;
    }

    int getMass() {
        return MASS;
    }
}

class WidgetB extends WidgetY {

    final static int MASS = 1;

    WidgetB(String color) {
        this.color = color;
    }

    int getMass() {
        return MASS;
    }
}

class WidgetC extends WidgetY {

    final static int MASS = 5;

    WidgetC(String color) {
        this.color = color;
    }

    int getMass() {
        return MASS;
    }
}

class WidgetD extends WidgetY {

    final static int MASS = 17;

    WidgetD(String color) {
        this.color = color;
    }

    int getMass() {
        return MASS;
    }
}

public class WidgetX {

    static int NUMWIDGETS = 6;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        WidgetY widgets[] = new WidgetY[NUMWIDGETS];

        int min_widget = 1;
        int max_widget = 4;
        int min_color = 1;
        int max_color = 7;

        for (int i = 0; i < NUMWIDGETS; i++) {
            int randomNum_widget = ThreadLocalRandom.current().nextInt(min_widget, max_widget + 1);
            int randomNum_color = ThreadLocalRandom.current().nextInt(min_color, max_color + 1);
            String random_color = new String();

            if (randomNum_color == 1) {
                random_color = "Blue";
            } else if (randomNum_color == 2) {
                random_color = "Green";
            } else if (randomNum_color == 3) {
                random_color = "Yellow";
            } else if (randomNum_color == 4) {
                random_color = "Red";
            } else if (randomNum_color == 5) {
                random_color = "Purple";
            } else if (randomNum_color == 6) {
                random_color = "Black";
            } else if (randomNum_color == 7) {
                random_color = "White";
            }
            //System.out.println(random_color);

            if (randomNum_widget == 1) {
                widgets[i] = new WidgetA(random_color);
            } else if (randomNum_widget == 2) {
                widgets[i] = new WidgetB(random_color);
            } else if (randomNum_widget == 3) {
                widgets[i] = new WidgetC(random_color);
            } else if (randomNum_widget == 4) {
                widgets[i] = new WidgetD(random_color);
            } else {
                System.out.println(" Not a valid monster...are monsters valid?");
            }
            //System.out.println(widgets[i]);
        }
        int total_mass = 0;
        for (int i = 0; i < NUMWIDGETS; i++) {
            System.out.println(widgets[i]);
            total_mass += widgets[i].getMass();
        }
        System.out.println("Toatl mass is " + total_mass);

    }

}
