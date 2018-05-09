package fun.glyn.restful.services;

import fun.glyn.restful.api.v1.mapper.CategoryMapper;
import fun.glyn.restful.api.v1.model.CategoryDTO;
import fun.glyn.restful.repositories.CategoryRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class CategoryServiceImplTest {
    CategoryServiceImpl categoryService;

    @Mock
    CategoryRepository categoryRepository;

    @Mock
    CategoryMapper categoryMapper;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
        categoryService = new CategoryServiceImpl(categoryMapper, categoryRepository);
    }

    @Test
    public void getAllCategories() throws Exception {
        List<CategoryDTO> recipeData = new ArrayList<>();

        when(categoryService.getAllCategories()).thenReturn(recipeData);
        assertEquals(categoryService.getAllCategories().size(), 0);

        verify(categoryRepository, times(1)).findAll();
    }

    @Test
    public void getCategoryByName() throws Exception {
    }

}