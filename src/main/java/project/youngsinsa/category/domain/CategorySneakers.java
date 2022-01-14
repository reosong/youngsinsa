package project.youngsinsa.category.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class CategorySneakers extends Category{
    //
    private String form;
    @Id
    private String modelNum;
    private String modelName;
    private String modelBrand;
    private int price;
    private String season;
    private String sex;
    private int countNum;
    private int likeNum;
    private String photo1;
    private String photo2;
    private String photo3;
    private String photo4;
    private String photo5;
    private String photo6;

    public CategorySneakers() {
    }

    public CategorySneakers(String form, String modelNum, String modelName, String modelBrand, int price, String season, String sex, int countNum, int likeNum) {
        this.form = form;
        this.modelNum = modelNum;
        this.modelName = modelName;
        this.modelBrand = modelBrand;
        this.price = price;
        this.season = season;
        this.sex = sex;
        this.countNum = countNum;
        this.likeNum = likeNum;
    }
}
