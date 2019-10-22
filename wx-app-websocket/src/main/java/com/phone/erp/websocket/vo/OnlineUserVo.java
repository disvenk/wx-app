package com.phone.erp.websocket.vo;

/**
 * [在线用户信息]
 *
 * @author Chris li[黎超]
 * @version [版本, 2017-04-12]
 * @see
 */
public class OnlineUserVo {

    public OnlineUserVo() {
    }

    public OnlineUserVo(String userId, String clientName) {
        this.userId = userId;
        this.clientName = clientName;
    }

    /**
     * 用户id
     */
    private String userId;
    /**
     * WebSocket客户端名称
     */
    private String clientName;
    /**
     * 登录的电脑编号
     */
    private String computerCode;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getComputerCode() {
        return computerCode;
    }

    public void setComputerCode(String computerCode) {
        this.computerCode = computerCode;
    }

    @Override
    public boolean equals(Object obj) {
        OnlineUserVo other = (OnlineUserVo) obj;
        return clientName.equals(other.getClientName());
    }

    @Override
    public String toString() {
        return String.format("【用户[%s] 客户端用户%s】", userId, clientName);
    }
}