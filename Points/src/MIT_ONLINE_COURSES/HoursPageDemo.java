/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MIT_ONLINE_COURSES;

/**
 *
 * @author Mike
 */
public class HoursPageDemo {

    public static String Cal_Pay(double hours, double wage) {
        double pay = 0.0;
        double overtime = 1.5;
        if (hours < 40.0) {
            pay = hours * wage;
        } else if (hours > 40.0) {
            double extra_hours = 0.0;

            if (hours > 60.0) {
                extra_hours = 20.0;
                System.out.println("You have worked more than 60 hours. ");
                System.out.println("However, you will only be paid for 60 hours with 20 hours overtime");
                System.out.println("at 1.5 times your nominal wage of $" + wage + "/hr.");
                System.out.println("Which is equivelent to " + 1.5 * wage + "/hr for " + extra_hours + " hours");
                System.out.println("Your overtime pay is $" + 1.5 * wage * extra_hours);

            }else{extra_hours = 60.0 - hours;}
            pay = wage * (40.0 + extra_hours * overtime);
        }
        return "Your pay for this week is $" + pay;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double hours = 56.5;
        double wage = 10.00;
        System.out.println(Cal_Pay(hours, wage));
    }

}
