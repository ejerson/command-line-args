package edu.cnm.deepdive.intro;
// the package line must be the first non-comment, non-whitespace line in Java.

/**
 * This class demonstrate iteration over command line arguments.
 *
 * @author Ejerson Balabas
 */
public class CommandLineArgs {

  public static final String ARGUMENT_FORMAT = "Argument %d: %s%n";

  /**
   * Iterates through the arguments, printing each one.
   * <p>
   * Some more description...
   *
   * @param args command line arguments
   */
  public static void main(String[] args) {
    // enhanced for
    for (String argument : args) {
      System.out.println(argument);
    }

    // traditional for loop
    for (int i = 0; i < args.length; i++) {
      String argument = args[i];
//      System.out.println(i + ": " + argument);
      System.out.printf("%d: %s%n", i, argument);
    }

    for (int i = args.length - 1; i >= 0; i--) {
      String argument = args[i];
      System.out.printf(ARGUMENT_FORMAT, i, argument);
    }

    // while loop
    int i = args.length - 1;
    while (i >= 0) {
      String argument = args[i];
      System.out.printf(ARGUMENT_FORMAT, i, argument);
      i--;
    }

  }
}
