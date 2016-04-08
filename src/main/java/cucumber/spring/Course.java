package cucumber.spring;

public class Course {

  private int courseLength;

  private int milesRan;

  boolean completeCourse;

  public Course(int miles) {
    this.courseLength = miles;
  }

  public void run(int miles) {
    this.milesRan = miles;
  }

  public boolean isCourseComplete() {
    if (milesRan >= courseLength) {
      completeCourse = true;
    } else {
      completeCourse = false;
    }
    return completeCourse;
  }

}
