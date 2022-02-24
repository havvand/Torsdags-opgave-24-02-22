public class Datamatik
{
  public static Student[] studentList = new Student[10];


  public static void main (String[] args)
  {
    Teacher Tobias = new Teacher("Tobias", 40, false);
    Student Michael = new Student("Michael", 36, false, "Dat1");
    Student Pelle = new Student("Pelle", 21, false, "Dat1");


    System.out.println(Tobias.getName());
    System.out.println(Michael.getName());
    System.out.println(Pelle.getName());

    //4.b Write a function that takes in an array of strings as parameter and prints each string.
    String[] moreStrings = {"Hello","World","Goodbye"};
    arrayDispString(moreStrings);

    int[] whatEver = {1,2,3,4};
    int[] average = {10,5,40,20};
    arrayDisp(whatEver);
    arrayAver(average);
    sortLtH(average);

    /*Create a new class Datamatik or reuse the one you created earlier.
    Add an array of Students with 10 elements in it. This should be a class variable (static).
    From the main method, add 10 student instances to the array. Each student must have a unique reference.*/

    studentList[0] = new Student("Benny", 20, false, "Dat1");
    studentList[1] = new Student("George", 49, false, "Dat1");
    studentList[2] = new Student("Jimmy", 20, false, "Dat1");
    studentList[3] = new Student("Linda", 33, true, "Dat1");
    studentList[4] = new Student("Jenny", 20, true, "Dat1");
    studentList[5] = new Student("Hodor", 44, false, "Dat1");
    studentList[6] = new Student("Vladimir P.", 55, false, "Dat1");
    studentList[7] = new Student("Gandalf", 25, false, "Dat1");
    studentList[8] = new Student("Hannibal", 31, false, "Dat1");
    studentList[9] = new Student("Olga", 88, true, "Dat1");
    for(int i=0;i<studentList.length;i++)
    {
    System.out.print(studentList[i].getName() + " \n");
    }
    //studentId(studentList, 1);

  }
  //4.b Write a function that takes in an array of strings as parameter and prints each string.
  public static void arrayDispString(String[] names)
  {
      for(int i=0;i<names.length;i++)
    {
      System.out.print(names[i] + " \n");
    }
  }

  //4.c Write a function that receives an integer array as a parameter and returns the sum of all elements in the array.
  public static int arrayDisp(int[] integers)
  {
    // To print sum of array;
    int sum = integers[0] + integers[1] + integers[2] + integers[3];
    System.out.print("Sum of array = " + sum + "\n");
    return sum;
  }

  //4.d Write a function that receives an integer array as a parameter and returns the average value.
  public static int arrayAver(int[] integers)
  {
    // To print sum of array;
    int sum = integers[0] + integers[1] + integers[2] + integers[3];
    int average = sum/4;
    System.out.print("Average of array = " + average + "\n");
    return average;
  }

  //4.e Consider how you could write a function that takes in an integer array as a parameter and returns the array sorted from lowest to highest value.
  public static int[] sortLtH(int[] integers)
  {
    int temp = 0;

    for(int i=0;i<integers.length;i++)
  {
    for (int j = i ; j > 0; j--)
    {
      if (integers[j] < integers[j-1]) // Makes a temp array for sorting?
        {
          temp = integers[j];
          integers[j] = integers[j-1];
          integers[j-1] = temp;
        }
    }

  }
    System.out.print("Sorted array = " + integers[0] + " " + integers[1] + " " + integers[2] + " " + integers[3] + "\n");
    return integers;
  }

  /*5.b Create a function in Datamatik that takes in the array from 5.a as a parameter as well as an integer. The function should return the field "name" (the name of the student) and print it
  (the integer should be used as the index nuber of the student to be printed). Call this method with different parameters (only the integer - not the array) from the main() of Datamatik.*/

  /*public static String studentId (Object[] student, int numb)
  {
    int id = 0;
    int start = (int) student[0];



  }*/

}
