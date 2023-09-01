package com.javapandeng.po;

import java.io.Serializable;

/**
 * 购物车
 */
public class Car implements Serializable {

    private Integer id;
    /**
     * 商品id
     */
    private Integer itemId;
    /**
     * 商品对象
     */
    private Item item;

    /**
     * 用户id
     */
    private Integer userId;

    /**
     * 商品数量
     */
    private Integer num;

    /**
     * 商品单价
     */
    private double price;

    private double zk;

    /**
     * 商品总价
     */
    private String total;

    public Car(Integer id, Integer itemId, Integer userId, Integer num, double price, double zk, String total) {
        this.id = id;
        this.itemId = itemId;
        this.userId = userId;
        this.num = num;
        this.price = price;
        this.zk = zk;
        this.total = total;

    }

    public Car() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public double getPrice() {
        return price;
    }
    public void setZk(double zk) {
        this.zk = zk;
    }
    public double getZk() {
        return zk;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", itemId=" + itemId +
                ", item=" + item +
                ", userId=" + userId +
                ", num=" + num +
                ", price=" + price +
                ", zk=" + zk +
                ", total='" + total + '\'' +
                '}';
    }
}
