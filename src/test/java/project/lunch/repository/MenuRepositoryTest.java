package project.lunch.repository;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import project.lunch.vo.Menu;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MenuRepositoryTest {

    @Autowired
    MenuRepository menuRepository;

    @Test
    public void selectMenu(){
        Menu menu = new Menu(1, "menu1","1");
        menuRepository.save(menu);

        Menu findMenu = menuRepository.findMenuByName("menu1");
        Assertions.assertEquals(menu.getName(), findMenu.getName());

        //System.out.println(menu.toString());
        //System.out.println(findMenu.toString());
    }
}