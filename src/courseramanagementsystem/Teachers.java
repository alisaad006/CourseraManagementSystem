package CourseraManagementSystem;

import java.util.ArrayList;

public class Teachers {

    private String name;
    private String email;
    private String password;
    ArrayList<Courses> courses;

    public Teachers() {
    }

    public Teachers(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
        courses = new ArrayList<>();

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void addCourse(Courses c) {
        boolean added = courses.add(c);
        if (added) {
            System.out.println("Added successful!");
        } else {
            System.out.println("Oops try again!");
        }
    }

    public void removeCourse(String name) {
        for (Courses c : courses) {
            if (c.getName().equals(name)) {
                courses.remove(c);
                System.out.println("Done delete : " + c.getName());
                break;
            } else {
                System.out.println("Invalid name");
            }
        }

    }
}
