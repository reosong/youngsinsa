package project.youngsinsa.style.dao;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;


@Getter
@Setter
@Entity
public class Style {

        @Id
        private int num;
        private String modelBrand;
        private String name;
        private String date;
        private int tall;
        private int weigh;
        private int countNum;
        private String photo1;
        private String photo2;
        private String text;








}
