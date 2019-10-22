package com.phone.erp.boss.vo.contact;

import com.phone.erp.base.vo.BaseResultVo;
import net.sf.ehcache.search.impl.BaseResult;

/**
 * 我的往来vo类
 * @author hmj
 * @create 2018-08-15 11:55
 */
public class MyContactUnitVo extends BaseResultVo{
    /**
     * 预收款
     */
    private String preReceivableAmount;
    /**
     * 预付款
     */
    private String prePaymentAmount;
    /**
     * 应付
     */
    private String payableAmount;
    /**
     * 应收
     */
    private String receivableAmount;
    /**
     * 应收余额合计
     */
    private String sumReceivableAmount;

    public String getPreReceivableAmount() {
        return preReceivableAmount;
    }

    public void setPreReceivableAmount(String preReceivableAmount) {
        this.preReceivableAmount = preReceivableAmount;
    }

    public String getPrePaymentAmount() {
        return prePaymentAmount;
    }

    public void setPrePaymentAmount(String prePaymentAmount) {
        this.prePaymentAmount = prePaymentAmount;
    }

    public String getPayableAmount() {
        return payableAmount;
    }

    public void setPayableAmount(String payableAmount) {
        this.payableAmount = payableAmount;
    }

    public String getReceivableAmount() {
        return receivableAmount;
    }

    public void setReceivableAmount(String receivableAmount) {
        this.receivableAmount = receivableAmount;
    }

    public String getSumReceivableAmount() {
        return sumReceivableAmount;
    }

    public void setSumReceivableAmount(String sumReceivableAmount) {
        this.sumReceivableAmount = sumReceivableAmount;
    }
}
