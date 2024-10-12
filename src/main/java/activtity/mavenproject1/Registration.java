/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activtity.mavenproject1;

import java.util.Scanner;

/**
 *
 * @author RC_Student_lab
 */
public class Registration {
    public static void main(String[] args){
    
String name,surname;
int age;
double salary,result;

Scanner sc = new Scanner(System.in);
//prompt the user
System.out.print("enter the name:");
name=sc.next();
System.out.print("enter the surname:");
surname=sc.next();
System.out.print("enter the age:");
age=sc.nextInt();
System.out.print("enter the salary:");
salary=sc.nextDouble();
result=salary*0.10;
//displayinfo
System.out.println("======================= ");
System.out.println("name: "  + name);
System.out.println("surname: "  + surname);
System.out.println("age: " + age);
System.out.println("10% of salary: " + result);
System.out.println("End Program222 ");
System.out.println("============================== ");

}
}
