package project.lunch.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
    public String home(Model model){
        return "home";
    }

    @GetMapping("/index")
    public String index(Model model){
        return "index";
    }

    @GetMapping("/lunch")
    public String lunch(Model model){

        return "lunch";
    }


}
