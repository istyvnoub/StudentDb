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

  //Email in course

  //pay

  // show status
}
