package cn.qihangerp.model.bo;

import lombok.Data;

import java.io.Serializable;

@Data
public class DouGoodsSkuBo implements Serializable {
    /**
     * 商品数字id
     */
    private Long productId;
    private Long id;
    private String title;
    private String code;
    private Long shopId;
    private Long erpSkuId;
}
