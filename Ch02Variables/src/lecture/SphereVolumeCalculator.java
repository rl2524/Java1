package lecture;

/**
 * <purpose>
 *    CA 2.5.1
 * 1/22/2018
 * @author rl2524
 */
public class SphereVolumeCalculator {
   public static void main (String [] args) {
      double piVal =  Math.PI;
      double sphereVolume;
      double sphereRadius;

      sphereRadius = 1.0;

      sphereVolume = (4.0 / 3.0) * piVal * sphereRadius * sphereRadius * sphereRadius;/* Your solution goes here  */

      System.out.println("Sphere volume: " + sphereVolume);

   }
}
