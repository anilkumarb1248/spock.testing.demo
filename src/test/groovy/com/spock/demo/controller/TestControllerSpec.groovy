package com.spock.demo.controller

import com.spock.demo.service.TestService
import spock.lang.Shared
import spock.lang.Specification

class TestControllerSpec extends Specification{

//    @Shared
    //def testServiceMock = Mock(TestService.class)
    //def testServiceMock = Mock(TestService)
    TestService testServiceMock = Mock()

//    @Shared
    TestController testController = new TestController(testServiceMock)

    def "testcontroller getData success scenario"(){
        given:
            String data = "Anil"
        when:
            String response = testController.getData()
        then:
            1 * testServiceMock.getData() >> data
        and:
            response
            response == data
            notThrown(NullPointerException)
    }

    def "testcontroller getData exception scenario"(){
        when:
        String response = testController.getData()
        then:
        1 * testServiceMock.getData() >> null
        and:
//        def e = thrown(NullPointerException)
//        e.getMessage() == "Data not found"
        NullPointerException e = thrown()
        e.getMessage() == "Data not found"
    }

    def "testservice interaction test from testcontroller"(){
        given:
            String data = "Anil Kumar Bandari"
        when:
            String response = testController.getData()
        then:
            1 * testServiceMock.getData()  >> data
        and:
            response
            response == data

    }
}
