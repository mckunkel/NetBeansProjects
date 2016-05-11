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
class LinearEquation {
  static double solve(double a, double b){
      return -b/a;
  }
    
}
class StaticMethod{
    public static void main(String args[]){
        System.out.println(LinearEquation.solve(2,2));
    }
    
}