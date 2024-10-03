package com.footprints.footprints.Day4.unit;

import com.footprints.footprints.mission.dto.CustomerInfo;
import com.footprints.footprints.mission.dto.Item;
import com.footprints.footprints.mission.dto.Items;
import com.footprints.footprints.mission.dto.Order;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class OrderTest {

    @Test
    @DisplayName("[hasNotCustomerInfo] customerInfo가 null일 때, true를 반환한다.")
    void hasNotCustomerInfo_null_true () {
        // given
        var items = Items.of(List.of(Item.of(1L, 200L)));
        var order = Order.of(1L, items, 200L, null);

        //when && then
        assertThat(order.hasNotCustomerInfo()).isTrue();
    }

    @Test
    @DisplayName("[hasNotCustomerInfo] customerInfo가 null이 아닐 때, false를 반환한다.")
    void hasNotCustomerInfo_null_false () {
        // given
        var items = Items.of(List.of(Item.of(1L, 200L)));
        var customer = CustomerInfo.of(1L, "name");
        var order = Order.of(1L, items, 200L, customer);

        //when && then
        assertThat(order.hasNotCustomerInfo()).isFalse();
    }

    @Test
    @DisplayName("[hasNotItems] items가 null일 때, true를 반환한다.")
    void hasNotItems_null_true () {
        // given
        var order = Order.of(1L, null, 200L, null);

        //when && then
        assertThat(order.hasNotItems()).isTrue();
    }

    @Test
    @DisplayName("[hasNotItems] items의 내부가 null일 때, true를 반환한다.")
    void hasNotItems_null_null_true () {
        // given
        var items = Items.of(null);
        var order = Order.of(1L, items, 200L, null);

        //when && then
        assertThat(order.hasNotItems()).isTrue();
    }

    @Test
    @DisplayName("[hasNotItems] items가 empty일 때, true를 반환한다.")
    void hasNotItems_empty_true () {
        // given
        var items = Items.of(List.of());
        var order = Order.of(1L, items, 200L, null);

        //when && then
        assertThat(order.hasNotItems()).isTrue();
    }

    @Test
    @DisplayName("[hasNotItems] items의 값이 존재할 때, false를 반환한다.")
    void hasNotItems_false () {
        // given
        var items = Items.of(List.of(Item.of(1L, 200L)));
        var order = Order.of(1L, items, 200L, null);

        //when && then
        assertThat(order.hasNotItems()).isFalse();
    }

    @Test
    @DisplayName("[hasNotTotalPrice] totalPrice가 0보다 작거나 동일할 때, true를 반환한다.")
    void hasNotTotalPrice_0 () {
        // given
        var items = Items.of(List.of(Item.of(1L, 200L)));
        var customer = CustomerInfo.of(1L, "name");
        var order = Order.of(1L, items, 0L, customer);

        //when && then
        assertThat(order.hasNotTotalPrice()).isTrue();
    }

    @Test
    @DisplayName("[hasNotTotalPrice] totalPrice가 0클 때, false를 반환한다.")
    void hasNotTotalPrice_1 () {
        // given
        var items = Items.of(List.of(Item.of(1L, 200L)));
        var customer = CustomerInfo.of(1L, "name");
        var order = Order.of(1L, items, 1L, customer);

        //when && then
        assertThat(order.hasNotTotalPrice()).isFalse();
    }
}
