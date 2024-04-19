package domain;

/**
 * Class that represent an artist
 * @author Sasha
 */
public class Artist extends Employee {

    /**
     * Constructor with parameters
     * @param skiils an artist
     * @param name an artist
     * @param jobTitle an artist
     * @param level an artist
     * @param dept an artist
     */
    public Artist(String[] skiils, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.skiils = skiils;
    }

    /**
     * Constructor with skills
     * @param skiils an artist
     */
    public Artist(String[] skiils) {
        super();
        this.skiils = skiils;
    }
    
    public Artist() {
        super();
        this.skiils = new String[10];
    }

    /**
     * Returns a string representing the object as text
     * @return string with information about the artist and his skills
     */
    @Override
    public String toString() {
        return super.toString()+"\nSkills: "+getSkills();
    }

    private String[] skiils;

    /**
     * Returns a string with the artist's skills
     * @return string with skills
     */
    public String getSkills() {
        String s = "";
        for (String e : skiils) {
            s = s + e + ", ";
        }
       s=s.substring(0, s.length() - 2);
        return s;
    }

    /**
     * Set the artsit skills
     * @param skills array of skills
     */
    public void setSkills(String[] skills) {
        this.skiils=skills;
    }

    /**
     * Returns an array of artist skills
     * @return array of skills
     */
    public String[] getSkillsLSist() {
        return skiils;
    }
}
