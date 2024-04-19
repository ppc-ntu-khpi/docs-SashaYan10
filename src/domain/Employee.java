package domain;

/**
 * Class that represent an employee
 * @author Sasha
 */
public class Employee {

    /**
     * Returns a string representing the object as text
     * @return string with information about the employee
     */
    @Override
    public String toString() {
        return "\nEmployee ID= " + ID + "\nName= " + name + "\nJobTitle= " + jobTitle + "\nLevel= " + level + "\nDept= " + dept;
    }

    private String name;
    private String jobTitle;
    private int ID;
    private int level;
    private String dept;

   // private static int employeesCount = 0;

    /**
     * Constructor with parameters
     * @param name of the employee
     * @param jobTitle of the employee
     * @param level of the employee
     * @param dept of the employee
     */
    public Employee(String name, String jobTitle, int level, String dept) {
        this();
        setName(name);
        this.jobTitle = jobTitle;
        switch (level) {
            case 1:
            case 2:
            case 3:
                this.level = level;
                break;
            default:
                this.level = 1;
        }
        this.dept = dept;
    }

    public Employee() {
        ID = (int)(Math.random()*1000);
//        if (ID > 10000) {
//            throw new NumberFormatException("ERROR! Employee's ID cannot be greater than 10000. Employee is not created!");
//        }
    }

    /**
     * Set job title of the employee
     * @param job of the employee
     */
    public void setJobTitle(String job) {
        jobTitle = job;
    }

    /**
     * Returns job title of the employee
     * @return job title of the employee
     */
    public String getJobTitle() {
        return jobTitle;
    }

    /**
     * Returns the name of the employee
     * @return name of the employee
     */
    public String getName() {
        return name;
    }

    /**
     * Set the level of the employee
     * @param level of the employee
     */
    public void setLevel(int level) {
        switch (level) {
            case 1:
            case 2:
            case 3:
                this.level = level;
                break;
            default:
                this.level = 1;
        }
    }

    /**
     * Returns the level of the employee
     * @return level of the employee
     */
    public int getLevel() {
        return level;
    }

    /**
     * Returns the dept of the employee
     * @return dept of the employee
     */
    public String getDept() {
        return dept;
    }

    /**
     * Set the dept of the employee
     * @param dept of the employee
     */
    public void setDept(String dept) {
        this.dept = dept;
    }

    /**
     * Set the name of the employee
     * @param name of the employee
     */
    public void setName(String name) {
//        boolean correctName = true;
//        for (int i = 0; i < name.length(); i++) {
//            char s = name.charAt(i);
//            if (Character.isDigit(s)) {
//                correctName = false;
//            }
//        }
//        if (correctName) {
//            this.name = name;
//        } else {
//            this.name = "John Doe";
//        }
        if (name.matches("^([a-zA-Z]+[\\'\\,\\.\\-]?[a-zA-Z ]*)+[ ]([a-zA-Z]+[\\'\\,\\.\\-]?[a-zA-Z ]+)+$")) {
            this.name = name;
        } else {
            this.name = "John Doe";
        }
    }
}
