
public class Main
{
  public static boolean happy = true;

  public static void main (String[] args)
  {
    empthyMethod();
    stringTxt("Boo");
    stringNameAge("Michael", 36);



    if (iAmHappy())
    {
    System.out.println("I clap my hands");
    }
      else
      {
        System.out.println("I don't clap my hands");
      }

    System.out.println(returnSum(5,5));

    System.out.println(upperCase("hej hej"));

    System.out.println(trueIfUpper("H"));

  }

    // METHODS ----------------METHODS-----------------METHODS--------------------METHODS--------------------METHODS-------------------METHODS------------------

  private static void empthyMethod()
  {
    System.out.println("");
  }

  private static void stringTxt(String txt)
  {
    System.out.println(txt);
  }

  private static void stringNameAge(String name, int age)
  {
    System.out.println("My name is " + name + ", I am " + age + " years old.");
  }

  //2.a Look at the file TaskTwoA and fill out the missing line, using the happy boolean.
  public static boolean iAmHappy()
  {
  // fill out what is missing here:
  if (happy == false)
  {
    return false;
  } else
  return true;
  }

  //2.b Write a function that receives to integers as parameters and returns the sum of them.
  public static int returnSum(int a, int b)
  {
    return a+b;
  }

  //2.c Write a function that receives a string and returns it as uppercase.

  public static String upperCase(String upperCase)
  {
    upperCase = upperCase.toUpperCase() ;
    return upperCase;
  }

  // 2.d Write a function that receives a string and returns true if the first letter of the string is uppercase.

  public static String trueIfUpper (String trueIfUpper)
  {

    if (Character.isUpperCase(trueIfUpper.charAt(0))){
      System.out.println("TRUE");

    }
    return trueIfUpper;
  }

}
