package project.youngsinsa.order.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class OrderList {
    @Id
    private int orderNum;
    private String modelNum;
    private String modelName;
    private String modelBrand;
    private int price;
    private String userID;
    private int userLevel;
    private String state;
    private String delivery;

}
