package com.inflearn.junittest;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.aggregator.AggregateWith;
import org.junit.jupiter.params.aggregator.ArgumentsAccessor;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class StaffTest {

    @DisplayName("repeated를 이용해서 loop만큼 테스트")
    @RepeatedTest(value = 10, name = "{displayName}, {currentRepetition}, {totalRepetition}")
    void repeated_test(RepetitionInfo repetitionInfo) {
        System.out.println("current : " + repetitionInfo.getCurrentRepetition() + ", total : " + repetitionInfo.getTotalRepetitions());
    }

    @DisplayName("parameterized를 이용해서 loop만큼 테스트 - valueSource")
    @ParameterizedTest(name = "{displayName}, {index}, message={0}")
    @ValueSource(strings = {"TDD를", "향한", "첫걸음", "가자"})
    @NullAndEmptySource
    void parameterized_test(String param) {
        System.out.println(param);
    }

    @DisplayName("parameterized를 이용해서 loop만큼 테스트 - SimpleArgumentConvert")
    @ParameterizedTest(name = "{displayName}, {index}, message={0}")
    @ValueSource(strings = {"TDD를", "향한", "첫걸음", "가자"})
    void parameterized_simple_argument_convert_test(@ConvertWith(StaffSimpleArgumentConverter.class) Staff staff) {
        System.out.println(staff.getName());
    }

    @DisplayName("parameterized를 이용해서 loop만큼 테스트 - ArgumentsAccessor")
    @ParameterizedTest(name = "{displayName}, {index}, message={0}")
    @CsvSource({"'TDD를', 1", "'향한', 2", "'첫걸음', 3", "'가자' ,4"})
    void parameterized_arguments_accessor_convert_test(ArgumentsAccessor argumentsAccessor) {
        Staff staff = new Staff(argumentsAccessor.getString(0), argumentsAccessor.getInteger(1));
        System.out.println("staff name: " + staff.getName() + ", staff age : " + staff.getAge());
    }

    @DisplayName("parameterized를 이용해서 loop만큼 테스트 - ArgumentsAggregator")
    @ParameterizedTest(name = "{displayName}, {index}, message={0}")
    @CsvSource({"'TDD를', 1", "'향한', 2", "'첫걸음', 3", "'가자' ,4"})
    void parameterized_arguments_aggregator_convert_test(@AggregateWith(StaffArgumentsAggregator.class) Staff staff) {
        System.out.println("staff name: " + staff.getName() + ", staff age : " + staff.getAge());
    }
}