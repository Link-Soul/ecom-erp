package cn.qihangerp.model.bo;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class DouGoodsBo implements Serializable {

    private String productId;
    private String outerProductId;
    private String title;
    private Long shopId;

}
