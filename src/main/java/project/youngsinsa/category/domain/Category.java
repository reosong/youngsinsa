package project.youngsinsa.category.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
@Entity
@Getter
@Setter
public class Category {


        //
        private String form;
        private int modelNum;
        private String modelName;
        private String modelBrand;
        private int price;
        private String season;
        private String sex;
        private int countNum;
        private int like;
        private String photo1;
        private String photo2;
        private String photo3;
        private String photo4;
        private String photo5;
        private String photo6;



}
