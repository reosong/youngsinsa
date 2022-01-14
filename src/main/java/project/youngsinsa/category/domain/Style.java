package project.youngsinsa.category.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;


@Getter
@Setter

public class Style {


        //

        private String StyleNum;
        private String modelName;
        private String modelBrand;
        private String season;
        private String sex;
        private int countNum;
        private int likeNum;
        //메인에 나오는 작은사진
        private String photo1;
        //상세페이지 큰 사진
        private String photo2;

        //상세페이지 세부 사진
        private String photo3;
        private String photo4;
        private String photo5;
        private String photo6;



}
