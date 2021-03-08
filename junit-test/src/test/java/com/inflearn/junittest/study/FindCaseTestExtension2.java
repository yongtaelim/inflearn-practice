package com.inflearn.junittest.study;

import org.junit.jupiter.api.extension.AfterTestExecutionCallback;
import org.junit.jupiter.api.extension.BeforeTestExecutionCallback;
import org.junit.jupiter.api.extension.ExtensionContext;

import java.lang.reflect.Method;

public class FindCaseTestExtension2 implements BeforeTestExecutionCallback, AfterTestExecutionCallback {

    private final String FIND_CASE_NAME;

    public FindCaseTestExtension2(String FIND_CASE_NAME) {
        this.FIND_CASE_NAME = FIND_CASE_NAME;
    }

    @Override
    public void afterTestExecution(ExtensionContext context) throws Exception {
        Method requiredTestMethod = context.getRequiredTestMethod();
        Case1 case1 = requiredTestMethod.getAnnotation(Case1.class);

        String methodName = requiredTestMethod.getName();
        if (methodName.startsWith(FIND_CASE_NAME) && case1 == null) {
            System.out.printf("Method [%s] 에 @Case1을 선언해주세요.\n", methodName);
        }

    }

    @Override
    public void beforeTestExecution(ExtensionContext context) throws Exception {
        System.out.println("find case1 test method");
//        String className = context.getRequiredTestClass().getName();
//        String methodName = context.getRequiredTestMethod().getName();
//        ExtensionContext.Store store = context.getStore(ExtensionContext.Namespace.create(className + methodName));

    }
}
