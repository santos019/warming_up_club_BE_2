package com.footprints.footprints.mission.dto;

public class Order {
    private Long id;
    private Items items;
    private Long totalPrice;
    private CustomerInfo customerInfo;

    public boolean hasNotCustomerInfo() {
        if (customerInfo == null) {
            return true;
        }
        return false;
    }

    public boolean hasNotItems() {
        if (items.getItems().isEmpty() || items.getItems().size() == 0) {
            return true;
        }
        return false;
    }

    public boolean hasNotTotalPrice() {
        if (totalPrice <= 0) {
            return true;
        }
        return false;
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

