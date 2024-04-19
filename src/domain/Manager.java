package domain;

/**
 * Class that represent a manager
 * @author Sasha
 */
public class Manager extends Employee {

    /**
     * Constructor with parameters
     * @param employees an array of employees managed by manager
     * @param name of the manager
     * @param jobTitle of the manager
     * @param level of the manager
     * @param dept of the manager
     */
    public Manager(Employee[] employees, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.employees = employees;
    }

    /**
     * Returns a string representing the object as text
     * @return string with information about the manager and his employees
     */
    @Override
    public String toString() {
        return super.toString()+"\nEmployees: "+getEmployees(); 
    }

    /**
     * Constructor with an array of the employees
     * @param employees an array of employees managed by manager
     */
    public Manager(Employee[] employees) {
        super();
        this.employees = employees;
    }
    
    public Manager() {
        super();
        employees = new Employee[10];
    }

    private Employee[] employees;

    /**
     * Returns string with the names of the employees
     * @return string with the names of the employees
     */
    public String getEmployees() {
        String s = "";
        for (Employee e : employees) {
            s = s + e.getName() + ", ";
        }
        s=s.substring(0, s.length() - 2);
        return s;
    }

    /**
     * Set an array of employees managed by manager
     * @param employees an array of employees
     */
    public void setEmployees(Employee[] employees) {
        this.employees=employees;
    }

    /**
     * Returns an array of employees managed by manager
     * @return an array of employees
     */
    public Employee[] getEmployeesList() {
        return employees;
    }
}
