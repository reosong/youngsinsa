package project.youngsinsa.style.repository;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import project.youngsinsa.style.dao.Style;

import java.util.List;

@Repository
public interface StyleRepository {
    //스타일 가져오기
    @Transactional
    List<Style> getList();
}
