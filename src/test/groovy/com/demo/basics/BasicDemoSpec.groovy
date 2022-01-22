package com.demo.basics

import spock.lang.Specification

class BasicDemoSpec extends Specification{

    def "First spock testing example"(){ // feature method
        expect:
        1+1 == 2
    }

}


