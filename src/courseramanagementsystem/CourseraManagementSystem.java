package courseramanagementsystem;

public class CourseraManagementSystem {

    public static void main(String[] args) {
        
        Coursera c = new Coursera();
        c.register("ali", "alisaad@gmail.com", "123");
        c.login("ali", "alisaad@gmail.com");
        
        Teachers t = c.teacher.get(0);
        
        Courses c1 = new Courses();
        c1.setName("Java Programming");
        t.addCourse(c1);
        
        Lectures l = new Lectures("Intro", "Basics", "Lecture1.pdf");
        c1.addLecture(l);
        
        c1.removeLecute("Intro");
        
        Sheets s = new Sheets(1, "Exercise 1", "sheet1.pdf");
        c1.addSheet(s);
        
        t.removeCourse("Java Programming");
        
    }
    
}
