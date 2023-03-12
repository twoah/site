package project.lunch.service;

import org.springframework.stereotype.Service;
import project.lunch.repository.MenuRepository;
import project.lunch.vo.Menu;

import java.util.List;

@Service
public interface MenuService {

    List<Menu> getMenusByCategoryName(String categoryName);
    void save(Menu menu);
}
