package fun.glyn.restful.repositories;

import fun.glyn.restful.bootstrap.Bootstrap;
import fun.glyn.restful.domain.Category;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@DataJpaTest
public class CategoryRepositoryIT {

    @Autowired
    CategoryRepository categoryRepository;

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void findByName() throws Exception {
        Category category = categoryRepository.findByName("Fruits");
        long count = categoryRepository.count();
        assertEquals("Fruits", category.getName());
    }

}