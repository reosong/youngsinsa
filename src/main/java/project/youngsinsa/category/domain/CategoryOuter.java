package project.youngsinsa.category.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Entity
@Getter
@Setter
public class CategoryOuter {
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

    public CategoryOuter() {
    }

    public CategoryOuter(String form, int modelNum, String modelName, String modelBrand, int price, String season, String sex, int countNum, int like) {
        this.form = form;
        this.modelNum = modelNum;
        this.modelName = modelName;
        this.modelBrand = modelBrand;
        this.price = price;
        this.season = season;
        this.sex = sex;
        this.countNum = countNum;
        this.like = like;
    }
}
