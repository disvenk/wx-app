package com.phone.erp.base.vo.employee;

/**
 * [登录的员工信息]
 *
 * @author Chris li
 * @version [版本, 2017-4-12]
 * @see
 */
public class LoginEmployeeVo extends EmployeeVo {
    /**
     * 登录密码(加密后的)
     */
    private String password;
    /**
     * 操作员标记(1:操作员;0:非操作员)
     */
    private Integer operatorFlag;
    /**
     * 集团状态
     */
    private Integer groupStatus;
    /**
     * 公司状态
     */
    private Integer companyStatus;
    /**
     * 员工电话
     */
    private String telephone;
    /**
     * 当前登录的小程序
     */
    private String loginMiniAppCode;
    /**
     * 令牌过期时长(单位:秒)
     */
    private Long loginTimeout;
    /**
     * 缓存登录时长(单位:秒)
     */
    private Long cacheTimeout;
    /**
     * 令牌生成时时间格式
     */
    private String tokenTimeFormat;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getOperatorFlag() {
        return operatorFlag;
    }

    public void setOperatorFlag(Integer operatorFlag) {
        this.operatorFlag = operatorFlag;
    }

    public Integer getGroupStatus() {
        return groupStatus;
    }

    public void setGroupStatus(Integer groupStatus) {
        this.groupStatus = groupStatus;
    }

    public Integer getCompanyStatus() {
        return companyStatus;
    }

    public void setCompanyStatus(Integer companyStatus) {
        this.companyStatus = companyStatus;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public void setLoginMiniAppCode(String loginMiniAppCode) {
        this.loginMiniAppCode = loginMiniAppCode;
    }

    public String getLoginMiniAppCode() {
        return loginMiniAppCode;
    }

    public Long getLoginTimeout() {
        return loginTimeout;
    }

    public void setLoginTimeout(Long loginTimeout) {
        this.loginTimeout = loginTimeout;
    }

    public Long getCacheTimeout() {
        return cacheTimeout;
    }

    public void setCacheTimeout(Long cacheTimeout) {
        this.cacheTimeout = cacheTimeout;
    }

    public String getTokenTimeFormat() {
        return tokenTimeFormat;
    }

    public void setTokenTimeFormat(String tokenTimeFormat) {
        this.tokenTimeFormat = tokenTimeFormat;
    }
}
