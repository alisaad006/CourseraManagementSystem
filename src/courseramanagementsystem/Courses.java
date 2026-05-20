package CourseraManagementSystem;

import java.util.ArrayList;

public class Courses {

    private String name;
    private String description;
    ArrayList<Lectures> lecture;
    ArrayList<Sheets> sheet;

    public Courses() {
        this.lecture = new ArrayList<>();
        this.sheet = new ArrayList<>();
    }

    public Courses(String name, String description, ArrayList<Lectures> lecture, ArrayList<Sheets> sheet) {
        this.name = name;
        this.description = description;
        this.lecture = lecture;
        this.sheet = sheet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    public void addLecture(Lectures l) {
        boolean added = lecture.add(l);
        if (added) {
            System.out.println("Added successful!");
        } else {
            System.out.println("Oops try again!");
        }
    }
    
    public void removeLecute(String name) {
        for(Lectures l : lecture) {
            if(l.getName().equals(name)) {
                lecture.remove(l);
                System.out.println("Done Remvoe: "+ l.getName());
                break;
            } else {
                System.out.println("Invalid name!");
            }
        }
    }
    
    public void addSheet(Sheets l) {
        boolean added = sheet.add(l);
        if (added) {
            System.out.println("Added successful!");
        } else {
            System.out.println("Oops try again!");
        }
    }
    
    public void removeSheet(String filename) {
        for(Sheets s : sheet) {
            if(s.getFilename().equals(filename)) {
                sheet.remove(s);
                System.out.println("Done Remvoe: "+ s.getFilename());
                break;
            } else {
                System.out.println("Invalid name!");
            }
        }
    }

}
