package com.example.demo;

public class Orders {
    private String orderId;
    private String orderDesc;
    private String CustomerId;
    private String productId;

    public String getOrderId() {
        return orderId;
    }
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
    public String getOrderDesc() {
        return orderDesc;
    }
    public void setOrderDesc(String orderDesc) {
        this.orderDesc = orderDesc;
    }
    public String getCustomerId() {
        return CustomerId;
    }
    public void setCustomerId(String customerId) {
        CustomerId = customerId;
    }
    public String getProductId() {
        return productId;
    }
    public void setProductId(String productId) {
        this.productId = productId;
    }
}
