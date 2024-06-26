package ua.lviv.marazyncheck.service.interfaces;

import ua.lviv.marazyncheck.entity.Category;

import java.util.List;
import java.util.Optional;

public interface CategoryService {
    Category save(Category category);
    Optional<Category> findById(Integer id);
    List<Category> findAll();
    void deleteById(Integer id);
}
