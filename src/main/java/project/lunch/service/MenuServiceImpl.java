package project.lunch.service;

import org.springframework.stereotype.Service;
import project.lunch.repository.MenuRepository;
import project.lunch.vo.Menu;

import java.util.List;

@Service
public class MenuServiceImpl implements MenuService{

    private MenuRepository menuRepository;

    MenuServiceImpl(MenuRepository menuRepository){
        this.menuRepository = menuRepository;
    }
    @Override
    public List<Menu> getMenusByCategoryName(String categoryName) {
        return menuRepository.findMenusByCategoryName(categoryName);
    }
}
