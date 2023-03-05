package project.lunch.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import project.lunch.service.MenuService;
import project.lunch.vo.Menu;

import java.util.List;

@Controller
public class LunchController {

    @Autowired
    private MenuService menuService;

    @GetMapping("/")
    public String home(){

        List<Menu> menuList = menuService.getMenusByCategoryName("1");
        for( Menu m : menuList){
            System.out.println(m.toString());
        }
        return "";
    }
}
