
package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {
  }

  /**

  @return Greeting String
  @param someone that should be known
  **/
  public final String greet(final String someone) {
    return String.format("Hello, %s!", someone);
  }
}
