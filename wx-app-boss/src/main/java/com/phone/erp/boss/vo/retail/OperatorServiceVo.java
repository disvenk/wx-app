package com.phone.erp.boss.vo.retail;

import com.phone.erp.base.vo.BaseResultVo;

import java.util.List;

/**
 SELECT <include refid="commonFields"/>,GOODSQUANTITY,ACTUALRECEIVABLES,COMMISSIONESTIMATE
 FROM ( * [运营商业务战报]
 * @author hmj
 * @create 2018-08-18 15:18
 */
public class OperatorServiceVo extends BaseResultVo{

    /**
    *运营商业务id
    */
    private Long operatorUnitId;

    /**
    *运营商业务名称
    */
    private String operatorUnitName;

    /**
    *佣金预估
    */
    private String commissionEstimate;

    /**
    *实际收款
    */
    private String actualReceivables;

    /**
     *佣金均价
     */
    private String commissionAvg;

    /**
     *数量
     */
    private Long goodsQuantity;

    /*
    * 部门id
    * */
    private Long sectionId;

    private List<OperatorServiceVo> operators;

    public Long getOperatorUnitId() {
        return operatorUnitId;
    }

    public void setOperatorUnitId(Long operatorUnitId) {
        this.operatorUnitId = operatorUnitId;
    }

    public String getOperatorUnitName() {
        return operatorUnitName;
    }

    public void setOperatorUnitName(String operatorUnitName) {
        this.operatorUnitName = operatorUnitName;
    }

    public String getCommissionEstimate() {
        return commissionEstimate;
    }

    public void setCommissionEstimate(String commissionEstimate) {
        this.commissionEstimate = commissionEstimate;
    }

    public String getActualReceivables() {
        return actualReceivables;
    }

    public void setActualReceivables(String actualReceivables) {
        this.actualReceivables = actualReceivables;
    }

    public String getCommissionAvg() {
        return commissionAvg;
    }

    public void setCommissionAvg(String commissionAvg) {
        this.commissionAvg = commissionAvg;
    }

    public Long getGoodsQuantity() {
        return goodsQuantity;
    }

    public void setGoodsQuantity(Long goodsQuantity) {
        this.goodsQuantity = goodsQuantity;
    }

    public Long getSectionId() {
        return sectionId;
    }

    public void setSectionId(Long sectionId) {
        this.sectionId = sectionId;
    }

    public List<OperatorServiceVo> getOperators() {
        return operators;
    }

    public void setOperators(List<OperatorServiceVo> operators) {
        this.operators = operators;
    }
}
