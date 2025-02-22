public class Employee {
    public Integer Id;
    public String Name;

    public Double salary;

    public Employee(){

    }
    public Employee(Integer id, String name, Double salary) {
        Id = id;
        Name = name;
        this.salary = salary;
    }

    public void increaseSalary(Double percentage){
        salary += salary * percentage / 100.00;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Id=" + Id +
                ", Name='" + Name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
