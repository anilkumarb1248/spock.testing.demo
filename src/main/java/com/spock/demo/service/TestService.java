package com.spock.demo.service;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class TestService {
    private static Map<Integer, String> oracleDBRecords = new HashMap<>();
    private static Map<String, String> mongoDBRecords = new HashMap<>();

    public TestService(){
        oracleDBRecords.put(1, "Anil");
        oracleDBRecords.put(2, "Kumar");
        oracleDBRecords.put(3, "Bandari");

        mongoDBRecords.put("Anil", "Events for Anil");
        mongoDBRecords.put("Kumar", "Events for Kumar");
        mongoDBRecords.put("Bandari", "Events for Bandari");


    }

    public String getData(){
        return "Anil Kumar Bandari";
    }

    public String getEmployeeNameFromOracleDB(int empId){
        return oracleDBRecords.get(empId);
    }
    public String getEmployeeEventsFromMongoDB(String name){
        return mongoDBRecords.get(name);
    }
}
