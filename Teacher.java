// 3.f in the Teacher class, declare the class "Teacher" and add 3 fields: "name", "age", "isFemale", using appropriate data types for each.

public class Teacher
{
  //1. fields (variabler)
  private String name;
  private int age;
  private boolean isFemale;

  //3.g in the Teacher class, add a constructor that takes in 3 parameters with the names "tmpName", "tmpAge", "tmpIsFemale" with the same datatypes used in 3.f

  public Teacher (String tmpName, int tmpAge, boolean tmpIsFemale)
  {
  this.name = tmpName;
  this.age = tmpAge;
  this.isFemale = tmpIsFemale;
  }

  public String getName()
  {
    return this.name;
  }

}
