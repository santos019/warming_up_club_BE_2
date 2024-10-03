package com.footprints.footprints.mission.dto;

public class CustomerInfo {
    private Long id;
    private String name;

    private CustomerInfo(final Long id, final String name) {
        this.id = id;
        this.name = name;
    }

    public static CustomerInfo of(final Long id, final String name) {
        return new CustomerInfo(id, name);
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

