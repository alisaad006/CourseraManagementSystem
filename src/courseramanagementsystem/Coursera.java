package CourseraManagementSystem;

import java.util.ArrayList;

public class Coursera {

    ArrayList<Teachers> teacher = new ArrayList<>();

    public void register(String name, String email, String password) {
        Teachers t = new Teachers(name, email, password);
        boolean added = teacher.add(t);
        if (added) {
            System.out.println("Welcome MR/MRS " + t.getName() + " in Coursera.");
        } else {
            System.out.println("Oops try again!");
        }
    }
    
    

    public void login(String name, String password) {
        for (Teachers t : teacher) {
            if (t.getName().equals(name) && t.getEmail().equals(password)) {
                System.out.println("Hello MR/MRS " + t.getName());
            } else {
                System.out.println("Invalid name!");
            }
        }
    }

}
