package project.youngsinsa.style.service;

import org.springframework.stereotype.Service;
import project.youngsinsa.style.dao.Style;
import project.youngsinsa.style.repository.StyleRepository;
import project.youngsinsa.style.repository.StyleRepositoryImp;

import java.util.List;

@Service
public class StyleServiceImp implements StyleService{

    private StyleRepository styleRepository;

    public StyleServiceImp(StyleRepositoryImp styleRepository) {
        this.styleRepository = styleRepository;
    }

    @Override
    public List<Style> showList(){
        return styleRepository.getList();
    }






}
