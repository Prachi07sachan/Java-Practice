//encapsulationS
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

public class Main {
    public static void main(String[] args) {

        Teacher t1 = new Teacher();
        t1.name = "Prachi";
        t1.id = 19;

        t1.setSalary(8000);
        t1.setDept("CS");

        System.out.println("Salary: " + t1.getSalary());
        System.out.println("Department: " + t1.getDept());
    }
}
