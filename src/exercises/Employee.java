package exercises;

public class Employee {
    
    private String name;
    private String department;
    private int age;
    
    public Employee(String name, String department, int age) {
        setName(name);
        setAge(age);
        setDepartment(department);
    }

    // Name
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Age
    public void setAge(int age) {
        // Age
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    // Department
    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    
    public void displayInformation() {
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Department: "+ getDepartment());
    }

}   