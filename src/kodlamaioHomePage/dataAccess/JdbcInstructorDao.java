package kodlamaioHomePage.dataAccess;

import kodlamaioHomePage.entities.Instructor;

public class JdbcInstructorDao implements InstructorDao{
    @Override
    public void add(Instructor instructor) {
        System.out.println("Jdbc ile veritabanına eklendi : " +instructor.getName()+" "+instructor.getLastName());
    }
}
