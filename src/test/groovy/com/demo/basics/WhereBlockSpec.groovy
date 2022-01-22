package com.demo.basics

import spock.lang.Specification

class WhereBlockSpec extends Specification {

    def "where block testing single data"() {
        given:
        def a = 10
        def b = 20

        expect:
        Math.addExact(a, b) == 30
    }

    def "where block testing with data driven feature"() {
        expect:
        Math.addExact(a, b) == response

        where:
        a   | b  | response
        10  | 20 | 30
        5   | 10 | 15
        -10 | 20 | 10
        -5  | -5 | -10
    }

    def "numbers to the power of two"(int a, int b, int c) {
        expect:
        Math.pow(a, b) == c

        where:
        a | b | c
        1 | 2 | 1
        2 | 2 | 4
        3 | 2 | 9
    }

}
