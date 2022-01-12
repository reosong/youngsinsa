package project.youngsinsa.category.domain;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@Entity
public class Comment {

    @Id
    private int num;
    private String userID;
    private int modelNum;
    private String content;
    private String date;
}
