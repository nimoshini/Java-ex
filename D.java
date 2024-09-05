class Employee implements Cloneable {
    private String name;
    private int id;
    private double salary;


    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', id=" + id + ", salary=" + salary + "}";
    }
}

public class D {
    public static void main(String[] args) {
        try {
            Employee original = new Employee("John Doe", 12345, 55000.00);
            Employee clone = (Employee) original.clone();
            
            original.setName("Jane Doe");
            original.setSalary(60000.00);

            System.out.println("Original Employee: " + original);
            System.out.println("Cloned Employee: " + clone);

        } catch (CloneNotSupportedException e) {
            System.out.println("Cloning not supported: " + e.getMessage());
        }
    }
}
