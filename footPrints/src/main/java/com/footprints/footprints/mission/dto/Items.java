package com.footprints.footprints.mission.dto;

import java.util.ArrayList;
import java.util.List;

public class Items {
    private List<Item> items = new ArrayList<>();

    private Items(final List<Item> items) {
        this.items = items;
    }

    public static Items of(final List<Item> items) {
        return new Items(items);
    }

    public List<Item> getItems() {
        return items;
    }
}

