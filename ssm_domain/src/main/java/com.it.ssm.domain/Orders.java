package com.it.ssm.domain;

import com.it.ssm.utils.DateUtils;

import java.util.Date;
import java.util.List;

//订单
public class Orders {
    private String id;
    private String orderNum;
    private Date orderTime;
    private String orderTimeStr;
    private int orderStatus;
    private String orderStatusStr;
    private int peopleCount;
    private product product;
    private List<Traveller> travellers;
    private Member member;
    private Integer payType;
    private String payTypeStr;
    private String orderDesc;

    public String getOrderStatusStr() {

        //订单状态 （0未支付 1已支付）、
        if(orderStatus==0){
            orderStatusStr="未支付";

        }else if (orderStatus==1){
            orderStatusStr="已支付";

        }
        return orderStatusStr;
    }

    public void setOrderStatusStr(String orderStatusStr) {
        this.orderStatusStr = orderStatusStr;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum;
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    public String getOrderTimeStr() {
        if(orderTime!=null) {
            DateUtils.data2String(orderTime, "yyyy-MM-dd HH:mm");
        }
        return orderTimeStr;
    }

    public void setOrderTimeStr(String orderTimeStr) {
        this.orderTimeStr = orderTimeStr;
    }

    public int getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(int orderStatus) {
        this.orderStatus = orderStatus;
    }

    public int getPeopleCount() {
        return peopleCount;
    }

    public void setPeopleCount(int peopleCount) {
        this.peopleCount = peopleCount;
    }

    public com.it.ssm.domain.product getProduct() {
        return product;
    }

    public void setProduct(com.it.ssm.domain.product product) {
        this.product = product;
    }

    public List<Traveller> getTravellers() {
        return travellers;
    }

    public void setTravellers(List<Traveller> travellers) {
        this.travellers = travellers;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public Integer getPayType() {

        return payType;
    }

    public void setPayType(Integer payType) {
        this.payType = payType;
    }

    public String getPayTypeStr() {

        if (payType==0){
            payTypeStr="支付宝";

        }else if (payType==1){
            payTypeStr="微信";

        }else if (payType==2){
            payTypeStr="其他";

        }
        return payTypeStr;
    }

    public void setPayTypeStr(String payTypeStr) {
        this.payTypeStr = payTypeStr;
    }

    public String getOrderDesc() {
        return orderDesc;
    }

    public void setOrderDesc(String orderDesc) {
        this.orderDesc = orderDesc;
    }
}
