package org.example;

import java.util.Scanner;

public class Student {

  private String firstname;
  private String lastname;
  private int gradeyear;
  private String studentID;
  private String courses;
  private int tuitionBalance;
  private static int costOfCourse =600;
  private static int id= 100;
  //constructor: prompt user to enter Student's name and year

  public Student (){
    Scanner in =new Scanner(System.in);
    System.out.print("Enter firstname:");
    this.firstname =in.nextLine();

    System.out.print("Enter lastname :");
    this.lastname = in.nextLine();

    System.out.print("1 - Freshmen\n2 - Sophmore\n3 - Junior\n4 -Senior\nEnter student Class level:");


    this.gradeyear = in.nextInt();
    setStudentID();
    System.out.println(firstname + " " + lastname + " " + gradeyear+ " "+ studentID);


  }
  // Generate Id

  private void setStudentID(){
    //Grade level + levelId
    id++;
    this.studentID = gradeyear + "" + id;

  }

  //Enroll in course
  public void enroll (){

    do {

      System.out.println("Enter course the enroll (q to quit)");
      Scanner in = new Scanner(System.in);
      String course = in.nextLine();

      if (!course.equals("q")) {
        courses = courses + "\n" + course;
        tuitionBalance = tuitionBalance+ costOfCourse;
      }else {
        break;
      }

    }while (1 !=0);
    System.out.println("Enrollment :" + courses);
    System.out.println("TUITION BALANCE : " + tuitionBalance);
  }

 //View Balance
  public void viewBalance () {
    System.out.println("your Balance is :  $ " + tuitionBalance );

  }

  public void payTuition(){
    System.out.println("Enter your payment $ :");
    Scanner in = new Scanner(System.in);
    int payment = in.nextInt();
    tuitionBalance = tuitionBalance -payment;
    System.out.println(" Thank you for your payment : " + payment);
    viewBalance();

  }
  //pay

  // show status

  public String toString (){
    return "Name: "+ firstname + " " + lastname +
           "\nCourses Enrolled" + courses +
            "\nBalance: $" + tuitionBalance;
  }
}
