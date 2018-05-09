package fun.glyn.restful.api.v1.mapper;

import fun.glyn.restful.api.v1.model.CategoryDTO;
import fun.glyn.restful.domain.Category;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CategoryMapper {

    CategoryMapper INSTANCE = Mappers.getMapper(CategoryMapper.class);

    CategoryDTO categoryToCategoryDTO(Category category);
}
