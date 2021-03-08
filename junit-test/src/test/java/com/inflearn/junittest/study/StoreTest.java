package com.inflearn.junittest.study;

import com.inflearn.junittest.study.Store;
import com.inflearn.junittest.study.StoreStatus;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;
import static org.junit.jupiter.api.Assumptions.assumingThat;

class StoreTest {

    @Test
    @Disabled
    @DisplayName("매장 오픈 상태 테스트")
    void open_test() {
        Store store = new Store("대박사업장");

        StoreStatus status = store.open();

        assertEquals(status, StoreStatus.CLOSE, "매장 오픈 시 상태값은 OPEN 입니다!!");
        assertEquals(status, StoreStatus.CLOSE, () -> "매장 오픈 시 상태값은 OPEN 입니다!!");
    }

    @Test
    @Disabled
    @DisplayName("매장 클로즈 상태 테스트")
    void close_test() {
        Store store = new Store("대박사업장");

        StoreStatus status = store.close();

        assertAll(
                () -> assertNotNull(status),
                () -> assertEquals(status, StoreStatus.OPEN, () -> "매장 클로즈 시 상태값은 CLOSE 입니다!!"),
                () -> assertEquals(store.getName(), "대박사업장1", () -> "사업장 이름이 다르다!!!")
        );
    }

    @Test
    @Disabled
    @DisplayName("사업장 이름 없는 경우")
    void store_name_null() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> new Store(null));

        assertEquals(exception.getMessage(), "사업장 이름은 필수입니다!!");
    }

    @Test
    @Disabled
    @DisplayName("사업장 판매 타임아웃 발생 - 계속 기다린다.")
    void store_sell_timeout_wait() {
        Store store = new Store("사업");

        assertTimeout(Duration.ofMillis(3000L), () -> {
            store.sell();
        });
    }

    @Test
    @Disabled
    @DisplayName("사업장 판매 타임아웃 발생 - 안 기다린다.")
    void store_sell_timeout_right_now() {
        Store store = new Store("사업");

        assertTimeoutPreemptively(Duration.ofMillis(3000L), () -> {
            store.sell();
        });
    }

    @Test
    @Disabled
    @DisplayName("조건 적으로 테스트 실행하기")
    void store_assume_test() {
        Store store = new Store("사업");

//        assumeTrue(() ->
//            store.getName().equals("사업1")
//        );
//
//        assertEquals(store.open(), StoreStatus.CLOSE, () -> "사업장 오픈 시 상태값은 OPEN입니다!!");

        assumingThat(() -> store.getName().equals("사업1"), () -> {
            assertEquals(store.open(), StoreStatus.CLOSE, () -> "사업장 오픈 시 상태값은 OPEN입니다!!");
        });
    }

    @Test
    @DisplayName("케이스1에 대한 테스트")
    @Tag("case1")
    void store_case1_test1() {
        Store store = new Store("사업");

        assertEquals(store.getName(), "사업");
    }

    @Test
    @DisplayName("케이스1에 대한 테스트")
    @Tag("case1")
    void store_case1_test2() {
        Store store = new Store("사업");

        assertEquals(store.getName(), "사업");
    }

    @Test
    @DisplayName("케이스2에 대한 테스트")
    @Tag("case2")
    void store_case2_test1() {
        Store store = new Store("사업");

        assertEquals(store.getName(), "사업");
    }

    @Test
    @DisplayName("케이스2에 대한 테스트")
    @Tag("case2")
    void store_case2_test2() {
        Store store = new Store("사업");

        assertEquals(store.getName(), "사업");
    }

}