import java.util.Random;




interface Average {

    float average();

}




interface Scholarship {

    float rate();

}




class Person {

    String P_name;




    public Person(String P_name) {

        this.P_name = P_name;

    }

}




class Employee extends Person implements Average {

    int no_salaries;

    int[] salary = new int[12];



   

    public Employee(String name, int n) {

        super(name);

        this.no_salaries = n;


        Random rand = new Random();

        for (int i = 0; i < no_salaries; i++) {

            salary[i] = rand.nextInt(30001); 

        }

    }




    public float average() {

        if (no_salaries == 0) return 0;

        float sum = 0;

        for (int sal : salary) {

            sum += sal;

        }

        return sum / no_salaries;

    }

}




class Student extends Person implements Average, Scholarship {

    int no_grades;

    Employee parent1;

    Employee parent2;

    int[] grade = new int[6];




    public Student(String name, int n, Employee r1, Employee r2) {

        super(name);

        this.no_grades = n;

        this.parent1 = r1;

        this.parent2 = r2;




        Random rand = new Random();

        for (int i = 0; i < 6; i++) {

            grade[i] = rand.nextInt(6) + 5; // 5 to 10

        }

    }




    public float average() {

        float sum = 0;

        for (int grd : grade) {

            sum += grd;

        }

        return sum / 6;

    }




    public float rate() {

        float points = average() * 6 + (60000 - (parent1.average() + parent2.average())) * 4;

        return points;

    }

}



public class Main {

    public static void main(String[] args) {


        Employee[] employees = new Employee[6];

        employees[0] = new Employee("Emp1", 12);

        employees[1] = new Employee("Emp2", 12);

        employees[2] = new Employee("Emp3", 6);

        employees[3] = new Employee("Emp4", 0);

        employees[4] = new Employee("Emp5", 0);

        employees[5] = new Employee("Emp6", 12);




        Student[] students = new Student[3];

        students[0] = new Student("Stud1", 6, employees[0], employees[1]);

        students[1] = new Student("Stud2", 6, employees[2], employees[3]);

        students[2] = new Student("Stud3", 6, employees[4], employees[5]);




        for (Student student : students) {

            System.out.println("Name: " + student.P_name);

            System.out.println("GPA: " + student.average());

            System.out.println("First Parent: " + student.parent1.P_name + ", Avg Salary: " + student.parent1.average());

            System.out.println("Second Parent: " + student.parent2.P_name + ", Avg Salary: " + student.parent2.average());

            System.out.println("Scholarship Points: " + student.rate());

            System.out.println("-------------------------");

        }




        Student scholarshipRecipient = students[0];

        for (Student student : students) {

            if (student.rate() > scholarshipRecipient.rate()) {

                scholarshipRecipient = student;

            }

        }

        System.out.println("The student who will get the scholarship is: " + scholarshipRecipient.P_name);

    }

}
