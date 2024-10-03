package com.footprints.footprints.mission;

import com.footprints.footprints.mission.dto.Order;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Day4 {
    public boolean validateOrder(Order order) {
        if (order.hasNotItems()) {
            log.info("주문 항목이 없습니다.");
            return false;
        }

        if (order.hasNotTotalPrice()) {
            log.info("올바르지 않은 총 가격입니다.");
            return false;
        }

        if (order.hasNotCustomerInfo()) {
            log.info("사용자 정보가 없습니다.");
            return false;
        }

        return true;
    }
}

