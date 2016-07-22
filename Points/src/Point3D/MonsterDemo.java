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
 *
 *
 */
abstract class Monster {

    public String toString() {
        return getClass().getName();

    }
}

class Vampire extends Monster {

}

class Werewolf extends Monster {

}

class Zombie extends Monster {

}

public class MonsterDemo {

    static int NUMMONSTERS = 6;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Monster monsters[] = new Monster[NUMMONSTERS];
        
        int min = 1;
        int max = 3;

        for (int i = 0; i < NUMMONSTERS; i++) {
            int randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);
            //System.out.println(randomNum);
            if(randomNum == 1){
                monsters[i] = new Vampire();
            }else if(randomNum == 2){
                monsters[i] = new Werewolf();
            }else if(randomNum ==3){
                monsters[i] = new Zombie();
            }else{System.out.println(" Not a valid monster...are monsters valid?");}
            System.out.println(monsters[i]);
        }

    }

}
