package OOP;

public class Student {

    private String name;
    public int age;

    // no argument constructor
    Student(){
        name = "Bishal";
    }

    // parameterized constructor
    Student(String lang){
        name = lang;
    }

    // default constructor
    // a default constructor is a constructor that takes no arguments and is automatically provided by the compiler 
    // if no other constructors are dfined in the class. It initializes the object with default values.

    Student(int newAge){
        age = newAge;

    }



    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println(s1.name);
        Student s2 = new Student("Java");
        System.out.println("the language name is " + s2.name);
        Student s3 = new Student(23);
        System.out.println("age is " + s3.age);
    }
    
}
