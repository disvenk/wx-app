package com.phone.erp.boss.vo.contact;

import com.phone.erp.base.vo.BaseResultVo;

/**
 * [营业款Vo类]
 * @author hmj
 * @create 2018-08-27 11:52
 */
public class RetailPayVo extends BaseResultVo {
    /**
     * 本日收入
     */
    private String todayIncome;

    /**
     * 本日支出
     */
    private String todayPay;
    /**
     * 本日结余
     */
    private String todayBalance;

    public String getTodayIncome() {
        return todayIncome;
    }

    public void setTodayIncome(String todayIncome) {
        this.todayIncome = todayIncome;
    }

    public String getTodayPay() {
        return todayPay;
    }

    public void setTodayPay(String todayPay) {
        this.todayPay = todayPay;
    }

    public String getTodayBalance() {
        return todayBalance;
    }

    public void setTodayBalance(String todayBalance) {
        this.todayBalance = todayBalance;
    }
}
