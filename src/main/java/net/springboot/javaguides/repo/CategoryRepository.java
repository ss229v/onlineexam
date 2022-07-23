package net.springboot.javaguides.repo;

import net.springboot.javaguides.model.exam.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
