package project.lunch.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import project.lunch.service.MenuService;
import project.lunch.vo.Menu;

import java.util.List;

@Slf4j
@Controller
public class LunchController {

    @Autowired
    private MenuService menuService;

    @GetMapping("/")
    public String home(){



        List<Menu> menuList = menuService.getMenusByCategoryName("한식");

        for( Menu m : menuList){
            log.info(m.toString());
        }

        return "";
    }
}
