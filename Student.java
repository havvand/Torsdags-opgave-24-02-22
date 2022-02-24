//3.c in the Student class, declare the class "Student" and add 4 fields: "name", "age", "isFemale", "datamatikerTeam" using appropriate data types for each.

public class Student
{
  //1. fields (variabler)
  private String name, datamatikerTeam;
  private int age;
  private boolean isFemale;

  //3.d in the Student class, add a constructor that takes in 4 parameters with the names "tmpName", "tmpAge", "tmpIsFemale", "tmpDatamatikerTeam" with the same data types used in 3.c

  public Student (String tmpName, int tmpAge, boolean tmpIsFemale, String tmpDatamatikerTeam)
  {
      //3.e populate the fields created in 3.c with the parameters of the constructor added in 3.d (you may use shaddowing with the keyword this)
      this.name = tmpName;
      this.age = tmpAge;
      this.isFemale = tmpIsFemale;
      this.datamatikerTeam = tmpDatamatikerTeam;
  }

  public String getName()
  {
    return this.name;
  }

}
