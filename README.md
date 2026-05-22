# Coursera Management System

A Java-based course management application that simulates core functionality of an e-learning platform — enabling teachers to register, manage courses, and organize lectures and exercise sheets.

---

## Project Structure

```
CourseraManagementSystem/
│
├── Coursera.java                  # Core platform: teacher registration & login
├── CourseraManagementSystem.java  # Main entry point
├── Teachers.java                  # Teacher entity with course management
├── Courses.java                   # Course entity with lectures & sheets
├── Lectures.java                  # Lecture entity (name, description, file)
└── Sheets.java                    # Sheet/exercise entity (number, description, file)
```

---

## Features

- **Teacher Registration & Login** — Register new teachers and authenticate with name and email
- **Course Management** — Teachers can add and remove courses
- **Lecture Management** — Add and remove lectures within a course (with PDF file support)
- **Sheet Management** — Add and remove exercise sheets within a course

---

## Class Overview

### `Coursera`
The main platform class. Holds a list of all registered teachers.

| Method | Description |
|--------|-------------|
| `register(name, email, password)` | Registers a new teacher and adds them to the platform |
| `login(name, password)` | Authenticates a teacher by name and email |

---

### `Teachers`
Represents a teacher on the platform.

| Method | Description |
|--------|-------------|
| `addCourse(Courses c)` | Adds a course to the teacher's course list |
| `removeCourse(String name)` | Removes a course by name |

---

### `Courses`
Represents a course containing lectures and sheets.

| Method | Description |
|--------|-------------|
| `addLecture(Lectures l)` | Adds a lecture to the course |
| `removeLecute(String name)` | Removes a lecture by name |
| `addSheet(Sheets s)` | Adds an exercise sheet to the course |
| `removeSheet(String filename)` | Removes a sheet by filename |

---

### `Lectures`
Represents a single lecture.

| Field | Type | Description |
|-------|------|-------------|
| `name` | `String` | Lecture title |
| `description` | `String` | Short description |
| `filename` | `String` | Associated PDF file |

---

### `Sheets`
Represents an exercise sheet.

| Field | Type | Description |
|-------|------|-------------|
| `number` | `int` | Sheet number |
| `description` | `String` | Short description |
| `filename` | `String` | Associated PDF file |

---

## Getting Started

### Prerequisites

- Any Java IDE (IntelliJ IDEA, Eclipse, NetBeans) or the command line

### Running the Project

1. **Clone or download** the project files into a folder named `CourseraManagementSystem`.

2. **Compile** all Java files:
   ```bash
   javac CourseraManagementSystem/*.java
   ```

3. **Run** the main class:
   ```bash
   java CourseraManagementSystem.CourseraManagementSystem
   ```

---

## Usage Example

```java
// Create the platform
Coursera c = new Coursera();

// Register and log in a teacher
c.register("ali", "alisaad@gmail.com", "123");
c.login("ali", "alisaad@gmail.com");

// Get the teacher and create a course
Teachers t = c.teacher.get(0);
Courses c1 = new Courses();
c1.setName("Java Programming");
t.addCourse(c1);

// Add a lecture to the course
Lectures l = new Lectures("Intro", "Basics", "Lecture1.pdf");
c1.addLecture(l);

// Add an exercise sheet
Sheets s = new Sheets(1, "Exercise 1", "sheet1.pdf");
c1.addSheet(s);

// Remove a lecture and a course
c1.removeLecute("Intro");
t.removeCourse("Java Programming");
```

---

## Known Issues & Suggestions

| Issue | Description | Suggestion |
|-------|-------------|------------|
| Login bug | `login()` compares password against email field | Change `t.getEmail().equals(password)` to `t.getPassword().equals(password)` |
| Typo in method | `removeLecute` should be `removeLecture` | Rename for clarity |
| Package name mismatch | `Coursera.java` uses `CourseraManagementSystem` while the main file uses `courseramanagementsystem` | Standardize to one casing |
| Field visibility | `teacher` and `courses` lists are package-accessible instead of private | Add proper getters/setters |
| No duplicate check | Users/courses with the same name can be registered multiple times | Add existence check before adding |

---

## Future Improvements

- Add student registration and enrollment system
- Implement persistent storage (file I/O or database)
- Add course search and filtering
- Introduce a grading and feedback system
- Build a simple CLI or GUI interface

---

## Author

Developed as a Java OOP practice project modeling a simplified e-learning platform.