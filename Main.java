//  ENCAPSULATION 
class Teacher {

    public String name;
    public int id;

    private int salary;
    private String dept;

    Teacher() {
        System.out.println("I am constructor");
    }

    public void setSalary(int s) {
        salary = s;
    }

    public int getSalary() {
        return salary;
    }

    public void setDept(String d) {
        dept = d;
    }

    public String getDept() {
        return dept;
    }
}

// INHERITANCE
class Person {
    public String name;
    public int age;
}

class Student extends Person {
    public int roll;

    public void getInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll: " + roll);
    }
}

//  ABSTRACTION
abstract class Animal {
    abstract void sound();

    void eat() {
        System.out.println("Animal eats food");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

// POLYMORPHISM 

// Overloading
class Calculator {
    void add(int a, int b) {
        System.out.println("Sum of 2 numbers: " + (a + b));
    }

    void add(int a, int b, int c) {
        System.out.println("Sum of 3 numbers: " + (a + b + c));
    }
}

// Overriding
class Cat extends Animal {
    void sound() {
        System.out.println("Cat meows");
    }
}


public class Main {
    public static void main(String[] args) {

        System.out.println("Encapsulation");
        Teacher t1 = new Teacher();
        t1.name = "Prachi";
        t1.id = 19;
        t1.setSalary(8000);
        t1.setDept("CS");
        System.out.println("Salary: " + t1.getSalary());
        System.out.println("Department: " + t1.getDept());

        System.out.println("\n Inheritance");
        Student s1 = new Student();
        s1.name = "Prachi";
        s1.age = 19;
        s1.roll = 101;
        s1.getInfo();

        System.out.println("\n Abstraction");
        Animal a = new Dog();
        a.sound();
        a.eat();

        System.out.println("\n Polymorphism");

        Calculator c = new Calculator();
        c.add(2, 3);
        c.add(2, 3, 4);

        Animal b = new Cat();
        b.sound();
    }
}