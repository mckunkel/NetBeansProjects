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
class Point3D {
    
    double x;
    double y;
    double z;
    
    Point3D() {
        
    }
    
    Point3D(double x) {
        this(x, 0, 0);
    }
    
    Point3D(double x, double y) {
        this(x, y, 0);
        
    }
    
    Point3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
    void move(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
}

class Point3DExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Point3D p = new Point3D(1.1, 3.4, -2.8);
        Point3D p2 = p;
        Point3D p3 = new Point3D(3.6, 5.6);
        p2.move(10, 10, 10);
        System.out.println("p.x = " + p.x + "  while p2.x = " + p2.x);
        System.out.println("p.y = " + p.y + "  while p2.y = " + p2.y);
        System.out.println("p.z = " + p.z + " while p2.z = " + p2.z);
        
    }
    
}
