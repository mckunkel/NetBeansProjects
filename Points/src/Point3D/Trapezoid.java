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
class Trapezoid {

    double base_1, base_2, height;

    public Trapezoid() {
    }

    public Trapezoid(double base_1) {
        this(base_1, 0, 0);
    }

    public Trapezoid(double base_1, double base_2) {
        this(base_1, base_2, 0);
    }

    public Trapezoid(double base_1, double base_2, double height) {
        this.base_1 = base_1;
        this.base_2 = base_2;
        this.height = height;
    }

    public double getArea() {
        return 0.5 * (base_1 + base_2) * height;

    }

}

class RunTrap{

    public static void main(String[] args) {
        Trapezoid trap1 = new Trapezoid(3, 5, 7);
        System.out.println(trap1.getArea() + " is the area");
    }

}
