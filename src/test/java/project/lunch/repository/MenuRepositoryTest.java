package project.lunch.repository;

import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import project.lunch.vo.Category;
import project.lunch.vo.Menu;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
class MenuRepositoryTest {

    @Autowired
    MenuRepository menuRepository;

    @Autowired
    CategoryRepository categoryRepository;
    @Test
    public void findMenuByCategory(){

        Category category =  new Category("category1");
        categoryRepository.save(category);
        Menu menu = new Menu("menu1", "des1", category);
        menuRepository.save(menu);

        Menu findMenu = menuRepository.findMenuByName("menu1");
        Assertions.assertEquals(menu.getName(), findMenu.getName());

    }
}