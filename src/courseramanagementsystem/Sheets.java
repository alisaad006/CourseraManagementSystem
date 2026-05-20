package CourseraManagementSystem;


public class Sheets {
    
    private int number;
    private String description;
    private String filename;

    public Sheets() {
    }

    public Sheets(int number, String description, String filename) {
        this.number = number;
        this.description = description;
        this.filename = filename;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    
    
}
