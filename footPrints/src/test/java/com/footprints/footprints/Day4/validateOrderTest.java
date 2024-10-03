package com.footprints.footprints.Day4;

import com.footprints.footprints.mission.Day4;
import com.footprints.footprints.mission.dto.CustomerInfo;
import com.footprints.footprints.mission.dto.Item;
import com.footprints.footprints.mission.dto.Items;
import com.footprints.footprints.mission.dto.Order;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class validateOrderTest {
    Day4 day4 = new Day4();

    @Test
    void hasNotItems() {
        var customer = CustomerInfo.of(1L, "name");
        var order = Order.of(1L, null, 200L, customer);

        assertThat(day4.validateOrder(order)).isFalse();
    }

    @Test
    void hasNotTotalPrice() {
        var items = Items.of(List.of(Item.of(1L, 200L)));
        var customer = CustomerInfo.of(1L, "name");
        var order = Order.of(1L, items, 0L, customer);

        assertThat(day4.validateOrder(order)).isFalse();
    }

    @Test
    void hasNotCustomerInfo() {
        var items = Items.of(List.of(Item.of(1L, 200L)));
        var order = Order.of(1L, items, 200L, null);

        assertThat(day4.validateOrder(order)).isFalse();
    }
}

