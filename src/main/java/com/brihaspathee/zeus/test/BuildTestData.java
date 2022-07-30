package com.brihaspathee.zeus.test;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 30, July 2022
 * Time: 5:39 AM
 * Project: Zeus
 * Package Name: com.brihaspathee.zeus.test
 * To change this template use File | Settings | File and Code Template
 */
@Slf4j
@Component
public class BuildTestData<T> {

    public List<T> buildData(String methodName, TestClass<T> testClass){
        log.info("Test Class:{}", testClass);

        // Get the test method that is matching the method name passed in as input
        TestMethod<T> testMethod =
                testClass.getTestMethods().stream()
                        .filter(userTestMethod -> userTestMethod.getTestMethodName().equals(methodName))
                        .findFirst()
                        .get();
        log.info("Test Method:{}", testMethod);

        // Get the test data for the method
        List<TestData<T>> userTestData = testMethod.getTestData();


        // Create a list for all the requests and return the list populated with the
        // requests for the method
        List<T> requests = new ArrayList<>();
        requests.addAll(userTestData.stream().map(testData -> testData.getTestData()).collect(Collectors.toList()));
        return requests;
    }
}
