/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package activtity.mavenproject1;
import java.util.Scanner;

public class Mavenproject1{
public static void main(String[] args){
    
String name,surname;
int age;
double salary,result;

Scanner sc = new Scanner(System.in);
System.out.println("======================= ");
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
System.out.println("============Output=========== ");
System.out.println("name: "  + name);
System.out.println("surname: "  + surname);
System.out.println("age: " + age);
System.out.println("10% of salary: " + result);
System.out.println("End Program ");
System.out.println("============================== ");

}

}

