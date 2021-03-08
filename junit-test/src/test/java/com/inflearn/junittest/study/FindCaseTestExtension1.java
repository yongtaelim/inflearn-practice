package com.inflearn.junittest.study;

import org.junit.jupiter.api.extension.AfterTestExecutionCallback;
import org.junit.jupiter.api.extension.BeforeTestExecutionCallback;
import org.junit.jupiter.api.extension.ExtensionContext;

import java.lang.reflect.Method;

public class FindCaseTestExtension1 implements BeforeTestExecutionCallback, AfterTestExecutionCallback {

    @Override
    public void afterTestExecution(ExtensionContext context) throws Exception {
        Method requiredTestMethod = context.getRequiredTestMethod();
        Case1 case1 = requiredTestMethod.getAnnotation(Case1.class);

        String methodName = requiredTestMethod.getName();
        if (methodName.startsWith("case1") && case1 == null) {
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
