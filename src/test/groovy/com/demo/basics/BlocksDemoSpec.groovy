package com.demo.basics

import spock.lang.Shared
import spock.lang.Specification

class BlocksDemoSpec extends Specification{

    @Shared
    def stack = new Stack<String>()

    def setup(){
        stack = new Stack<String>()
        assert !stack.isEmpty()
    }

    def "when-then blocks example"(){
        given:
            def ele = "Anil"
        when:
            stack.push(ele)
        then:
            !stack.empty()
            stack.size() == 1
            stack.peek() == ele
    }
}
