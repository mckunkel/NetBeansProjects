/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MIT_ONLINE_COURSES;

import java.util.concurrent.ThreadLocalRandom;

class Runner {

    double time;
    double distance;

    Runner(double time, double distance) {
        this.time = time;
        this.distance = distance;
    }

    double speed(double time, double distance) {

        return distance / time;
    }
}

class Running_Friends{

    int N_friends;
    Runner friends[];

    Running_Friends(int N_friends) {
        this.N_friends = N_friends;
        friends = new Runner[N_friends];
        for (int i = 0; i < N_friends; i++) {
            double time = ThreadLocalRandom.current().nextInt(0, 10 + 1);
            //System.out.println(randomNum);

            friends[i].speed(time, DISTANCE);

            System.out.println(friends[i].time);
        }
    }

}

/**
 *
 * @author Mike
 */
public class MarathonDemo {

    static int NUMRUNNERS = 6;
    static double DISTANCE = 20; //km

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

    }

}
