/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Point3D;

class Planet {

    String name;
    int moons;

    Planet(String name, int moons) {
        this.name = name;
        this.moons = moons;
    }

    void display() {
        System.out.println(name + " has " + moons + " moons");
    }

}

class DwarfPlanet {

    String name;
    int moons;

    DwarfPlanet(String name, int moons) {
        this.name = name;
        this.moons = moons;
    }

    void display() {
        System.out.println(name + " has " + moons + " moons");
    }

}

class SolarSystem {

    Planet planets[];
    DwarfPlanet dwarfplanets[];

    SolarSystem() {
        //Create Planets
        planets = new Planet[8];
        dwarfplanets = new DwarfPlanet[5];

        planets[0] = new Planet("Mercury", 0);
        planets[1] = new Planet("Venus", 0);
        planets[2] = new Planet("Earth", 1);
        planets[3] = new Planet("Mars", 2);
        planets[4] = new Planet("Jupiter", 67);
        planets[5] = new Planet("Saturn", 62);
        planets[6] = new Planet("Uranus", 27);
        planets[7] = new Planet("Neptune", 14);
        dwarfplanets[0] = new DwarfPlanet("Pluto", 1);
        dwarfplanets[1] = new DwarfPlanet("Eris", 1);
        dwarfplanets[2] = new DwarfPlanet("Haumea", 2);
        dwarfplanets[3] = new DwarfPlanet("Makemake", 0);
        dwarfplanets[4] = new DwarfPlanet("Ceres", 0);
    }

    void display() {
        System.out.println("================= Planets in our solar system =================");

        for (int i = 0; i < planets.length; i++) {
            planets[i].display();

        }
        System.out.println("================= Dwarf Planets in our solar system =================");
        for (int i = 0; i < dwarfplanets.length; i++) {
            dwarfplanets[i].display();

        }
    }
}

/**
 *
 * @author Mike
 */
public class OurSolarSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SolarSystem solarSystem = new SolarSystem();
        solarSystem.display();
    }

}
