/********************************************
*	AUTHORS:	Dante Pineda
* COLLABORATORS: <name of peer, tutor, instructor, anyone else who helped>
*	LAST MODIFIED:	<date of last change>
********************************************/

/********************************************
*	Excersice Tracker>
*********************************************
*	PROGRAM DESCRIPTION:
*	<This program tracks your excercise routine and tracks your progress>
*********************************************
*	ALGORITHM:
*	<Pseudocode here>
*********************************************
*	STATIC METHODS:
* <list of static methods and which teammate made each>
*********************************************/


public class Main 
{
  /***** CONSTANT SECTION *****/
  static String userName = "Bob";
    static int age = 30;
    static double runningDistance = 5.0; // in kilometers
    static double cyclingDistance = 10.0; // in kilometers
    static double totalExerciseTime = 90.0; // in minutes
    static boolean goalAchieved;

  public static void main(String[] args)
  {
    /***** DECLARATION SECTION *****/

    /***** INITIALIZATION SECTION *****/

    /***** INTRO SECTION *****/

    /***** PROCESSING SECTION *****/
    goalAchieved = checkExerciseGoal(runningDistance, cyclingDistance, 10.0);
        displayExerciseStatus(goalAchieved);
        double averageSpeed = calculateAverageSpeed(totalExerciseTime, runningDistance + cyclingDistance);
        displayAverageSpeed(averageSpeed);
    }
    /***** OUTPUT SECTION *****/
    System.out.println("Welcome, " + userName + "!");
        System.out.println("Your age: " + age);
        System.out.printf("You've run %.1f km and cycled %.1f km today.%n", runningDistance, cyclingDistance);
        System.out.printf("Total exercise time: %.1f minutes%n", totalExerciseTime);
  
  /***** STATIC METHODS *****/
  public static boolean checkExerciseGoal(double run, double cycle, double goal) {
    return (run + cycle) >= goal;
}

public static void displayExerciseStatus(boolean goalMet) {
  if (goalMet) {
      System.out.println("Great job! You've met your exercise goal for the day.");
  } else {
      System.out.println("Keep going! You need more exercise to reach your goal.");
  }
}

public static double calculateAverageSpeed(double time, double distance) {
  return distance / (time / 60); // convert minutes to hours
}


public static void displayAverageSpeed(double speed) {
  System.out.printf("Your average speed was %.2f km/h.%n", speed);

}

}
