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
abstract class Fruit {

    String color;

    public String toString() {
        return getClass().getName() + ":" + color;

    }
}

class Apple extends Fruit {

    Apple() {
        color = "Red";
    }
}

class Banana extends Fruit {

    Banana() {
        color = "yellow";
    }
}

class Orange extends Fruit {

    Orange() {
        color = "orange";
    }

}

class Strawberry extends Fruit {

    Strawberry() {
        color = "red";
    }
}

public class FruitDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Fruit fruit = new Apple();
        System.out.println(fruit);
        fruit = new Banana();
        System.out.println(fruit);
        fruit = new Orange();
        System.out.println(fruit);
        fruit = new Strawberry();
        System.out.println(fruit);

    }

}
