package com.spock.demo.controller;

import com.spock.demo.service.TestService;
import org.springframework.stereotype.Component;

@Component
public class TestController {

    TestService testService;

    public TestController(TestService testService){
        this.testService = testService;
    }

    public String getData(){
        String data = testService.getData();
        if(data != null){
            return data;
        }else{
            throw new NullPointerException("Data not found");
        }
    }

    public String getEmployeeData(int empId){
        String name = null;
        String events = null;
        name = testService.getEmployeeNameFromOracleDB(empId);
        if(name != null){
            events = testService.getEmployeeEventsFromMongoDB(name);
        }
        if(name != null & events != null){
            return name + "-" + events;
        }else{
            throw new RuntimeException("Employee data not found");
        }

    }
}
