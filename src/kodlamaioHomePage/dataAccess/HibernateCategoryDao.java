package kodlamaioHomePage.dataAccess;

import kodlamaioHomePage.entities.Category;

public class HibernateCategoryDao implements CategoryDao{
    @Override
    public void add(Category category) {
        System.out.println("Hibernate ile veritabanına eklendi : " +category.getName());
    }
}
