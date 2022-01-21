package project.youngsinsa.style.service;

import org.springframework.stereotype.Service;
import project.youngsinsa.style.dao.Style;

import java.util.List;

@Service
public interface StyleService {
    List<Style> showList();
}
