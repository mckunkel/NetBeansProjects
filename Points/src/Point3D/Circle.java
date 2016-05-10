/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Point3D;

class Circle {

    double x;
    double y;
    double radius;

    Circle() {
    }

    Circle(double radius) {
        this(0, 0, radius);
    }

    Circle(double x, double y) {
        this(x, y, 0);
    }

    Circle(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    void move(double x, double y){
        this.x = x;
        this.y = y;
    }
    void scale(double a){
        radius *=a;
    }

}

/**
 *
 * @author michaelkunkel
 */
class CircleExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Circle c = new Circle(10);
        c.move(2,2);
        c.scale(0.5);

        System.out.println("c.x = " + c.x);
        System.out.println("c.y = " + c.y);
        System.out.println("c.radius = " + c.radius);

    }

}
