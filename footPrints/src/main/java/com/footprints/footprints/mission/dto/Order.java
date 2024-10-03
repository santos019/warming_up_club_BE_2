package com.footprints.footprints.mission.dto;

public class Order {
    private Long id;
    private Items items;
    private Long totalPrice;
    private CustomerInfo customerInfo;

    private Order(final Long id, final Items items, final Long totalPrice, final CustomerInfo customerInfo) {
        this.id = id;
        this.items = items;
        this.totalPrice = totalPrice;
        this.customerInfo = customerInfo;
    }

    public static Order of(final Long id, final Items items, final Long totalPrice, final CustomerInfo customerInfo) {
        return new Order(id, items, totalPrice, customerInfo);
    }

    public boolean hasNotCustomerInfo() {
        return customerInfo == null;
    }

    public boolean hasNotItems() {
        return items == null || items.getItems() == null || items.getItems().isEmpty();
    }

    public boolean hasNotTotalPrice() {
        return totalPrice <= 0;
    }

    public Long getId() {
        return id;
    }

    public Items getItems() {
        return items;
    }

    public Long getTotalPrice() {
        return totalPrice;
    }

    public CustomerInfo getCustomerInfo() {
        return customerInfo;
    }
}

