package oops;


class Pen{
        String color;
        String type;

        public static void write(){
            System.out.println("Pen is used for Writing Something");
        }
        public void printColor(){
            System.out.println(this.color);
        }
    }

class Student{
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    // Student(){
    //     System.out.println("Here this is an non parameterised constructor this is called.");
    // }
    Student(String name, int age){
        this.name = name;
        this.age = age;
        System.out.println("This is an parameterised constructor called.");
    }
}
public class oop {
    
    
    public static void main(String args[]){
        // Pen pen1 = new Pen();
        // pen1.color = "blue";
        // pen1.type = "Gel";

        // Pen pen2 = new Pen();
        // pen2.color = "black";
        // pen2.type = "BallPen";

        // pen1.write();
        // pen1.printColor();

        // Student std = new Student();
        // std.name = "Pushpender";
        // std.age = 22;

        Student std = new Student("Pushpender", 21);

        std.printInfo();
    }
    
}
