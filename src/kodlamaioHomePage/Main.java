package kodlamaioHomePage;

import kodlamaioHomePage.business.CategoryManager;
import kodlamaioHomePage.business.CourseManager;
import kodlamaioHomePage.business.InstructorManager;
import kodlamaioHomePage.core.logging.DatabaseLogger;
import kodlamaioHomePage.core.logging.FileLogger;
import kodlamaioHomePage.core.logging.Logger;
import kodlamaioHomePage.core.logging.MailLogger;
import kodlamaioHomePage.dataAccess.HibernateCourseDao;
import kodlamaioHomePage.dataAccess.JdbcCategoryDao;
import kodlamaioHomePage.dataAccess.JdbcInstructorDao;
import kodlamaioHomePage.entities.Category;
import kodlamaioHomePage.entities.Course;
import kodlamaioHomePage.entities.Instructor;

public class Main {
    public static void main(String[] args) throws Exception {
        Logger[] loggers = {new MailLogger(), new DatabaseLogger(), new FileLogger()};

        Category category1 = new Category(4, "Bulut");
        CategoryManager categoryManager = new CategoryManager(new JdbcCategoryDao(), loggers);
        categoryManager.add(category1);

        Course course1 = new Course(3, "Kotlin", "Mobil Programlama", 0);
        CourseManager courseManager = new CourseManager(new HibernateCourseDao(), loggers);
        courseManager.add(course1);

        Instructor instructor = new Instructor(1, "Engin", "Demiroğ");
        InstructorManager instructorManager = new InstructorManager(new JdbcInstructorDao(), loggers);
        instructorManager.add(instructor);
    }
}
