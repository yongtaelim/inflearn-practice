package com.inflearn.junittest.study;

import com.inflearn.junittest.study.Staff;
import org.junit.jupiter.params.converter.ArgumentConversionException;
import org.junit.jupiter.params.converter.SimpleArgumentConverter;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StaffSimpleArgumentConverter extends SimpleArgumentConverter {
    @Override
    protected Object convert(Object source, Class<?> targetType) throws ArgumentConversionException {
        assertEquals(Staff.class, targetType, "Staff 클래스만 올 수 있습니다!!");
        return new Staff(source.toString(), null);
    }
}
