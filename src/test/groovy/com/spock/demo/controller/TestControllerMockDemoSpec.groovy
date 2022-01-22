package com.spock.demo.controller

import com.spock.demo.service.TestService
import spock.lang.Specification

class TestControllerMockDemoSpec extends Specification{

    def "without mocking the TestService"(){
        given:
        TestService testService = new TestService()
        TestController testController = new TestController(testService)

        when:
        String response = testController.getEmployeeData(1)

        then:
        response
        notThrown(RuntimeException)
//        1 * testService.getEmployeeNameFromOracleDB(1)
//        1 * testService.getEmployeeEventsFromMongoDB("Anil")

    }

    def "with mocking the TestService"(){
        given:
        String name = "Dummy"
        String events = "DummyEvents"
//        TestService testService = Mock()
        def testService = Mock(TestService)
//                {
//            getEmployeeNameFromOracleDB(_) {
//                return  name
//            }
//            getEmployeeEventsFromMongoDB(_){
//                return events
//            }
//        }

        TestController testController = new TestController(testService)

//        testService.getEmployeeNameFromOracleDB(1) >> name
//        testService.getEmployeeEventsFromMongoDB(name) >> events

        when:
        testController.getEmployeeData(1)

        then:
        1 * testService.getEmployeeNameFromOracleDB(1) >> name
        1 * testService.getEmployeeEventsFromMongoDB(name)  >> events

    }


}
