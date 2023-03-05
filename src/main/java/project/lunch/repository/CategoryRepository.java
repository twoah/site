package project.lunch.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;
import project.lunch.vo.Category;

import java.util.List;

@Repository
@EnableJpaRepositories("project.lunch.repository")
public interface CategoryRepository extends JpaRepository<Category, Integer> {

    List<Category> findAll();
}
