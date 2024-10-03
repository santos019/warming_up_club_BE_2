package com.footprints.footprints.mission.dto;

public class Item {
    private Long id;
    private Long price;

    private Item(final Long id, final Long price) {
        this.id = id;
        this.price = price;
    }

    public static Item of(final Long id, final Long price) {
        return new Item(id, price);
    }

    public Long getId() {
        return id;
    }

    public Long getPrice() {
        return price;
    }
}

