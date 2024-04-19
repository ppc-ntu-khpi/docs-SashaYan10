package domain;

/**
 * Class that represent an editor
 * @author Sasha
 */
public class Editor extends Artist {

    /**
     * Constructor with parameters
     * @param electronicEditing an editor
     * @param skiils an editor
     * @param name an editor
     * @param jobTitle an editor
     * @param level an editor
     * @param dept an editor
     */
    public Editor(boolean electronicEditing, String[] skiils, String name, String jobTitle, int level, String dept) {
        super(skiils, name, jobTitle, level, dept);
        this.electronicEditing = electronicEditing;
    }

    /**
     * Constructor with skills
     * @param electronicEditing bool of the electronic editing
     * @param skiils an editor
     */
    public Editor(boolean electronicEditing, String[] skiils) {
        super(skiils);
        this.electronicEditing = electronicEditing;
    }

    /**
     * Default constructor
     * @param electronicEditing sets bool value as true
     */
    public Editor(boolean electronicEditing) {
        super();
        this.electronicEditing = electronicEditing;
    }
    
    public Editor() {
        super();
        this.electronicEditing = true;
    }

    /**
     * Returns a string representing the object as text
     * @return string with information about the editor and his preferences
     */
    @Override
    public String toString() {
        String s=super.toString()+"\nEditing preferences= "; 
        if (electronicEditing)
            s=s+"electronic";
        else
            s=s+"paper";
        return s;
            
    }

    private boolean electronicEditing;

    /**
     * Returns the bool value of the electronic editing
     * @return true or false of the electronic editing
     */
    public boolean getPreferences() {
        return electronicEditing;
    }

    /**
     * Set the preferences of the electronic editing
     * @param electronic bool value of the electronic editing
     */
    public void setPreferences(boolean electronic) {
        this.electronicEditing=electronic;
    }
}
