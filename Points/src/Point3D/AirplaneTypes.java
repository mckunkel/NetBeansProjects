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
abstract class Airplane {

    abstract int getPassengers();
    String serial_number;

    public Airplane(String serial) {
        this.serial_number = serial;
    }

    public String toString() {
        return getClass().getName() + " : " + serial_number + " " + getPassengers();
    }

}

class B747 extends Airplane {

    final static int PASSENGERS = 500;

    public B747(String serial) {
        super(serial);
    }

    public int getPassengers() {
        return PASSENGERS;
    }
}

class B757 extends Airplane {

    final static int PASSENGERS = 300;

    public B757(String serial) {
        super(serial);
    }

    public int getPassengers() {
        return PASSENGERS;
    }
}

class B767 extends Airplane {

    final static int PASSENGERS = 400;

    public B767(String serial) {
        super(serial);
    }

    public int getPassengers() {
        return PASSENGERS;
    }
}

public class AirplaneTypes {

    /**
     * @param args the command line arguments
     */
    static int NUMAIRPLANES = 6;

    public static void main(String[] args) {

        //Declare and allocate space
        Airplane airplanes[] = new Airplane[NUMAIRPLANES];
        airplanes[0] = new B757("UA1233");
        airplanes[1] = new B747("UA1234");
        airplanes[2] = new B747("UA1235");
        airplanes[3] = new B767("UA1236");
        airplanes[4] = new B757("UA1237");
        airplanes[5] = new B767("UA1238");

        //Display airplanes
        for (int i = 0; i < NUMAIRPLANES; i++) {
            Airplane a = airplanes[i];
            System.out.println(a);

        }

    }

}
