package project.lunch.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;
import project.lunch.vo.Menu;

import java.util.List;

@Repository
@EnableJpaRepositories("project.lunch.repository")
public interface MenuRepository extends JpaRepository<Menu, Integer> {

    List<Menu> findMenusByCategoryId(String categoryId);
    Menu findMenuByName(String name);
    List<Menu> findMenusByCategoryName(String categoryName);
}
