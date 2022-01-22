package com.demo.basics

import spock.lang.Rollup
import spock.lang.Specification
import spock.lang.Unroll

class MathSpec extends Specification {
//    def "maximum of two numbers"() {
//        expect:
//        // exercise math method for a few different inputs
//        Math.max(1, 3) == 3
//        Math.max(7, 4) == 7
//        Math.max(0, 0) == 0
//    }

//    @Rollup
    @Unroll
    def "maximum of two numbers with params"() {
        expect:
        Math.max(a, b) == c

        where:
        a | b | c
        1 | 3 | 3
        7 | 4 | 7
        0 | 0 | 0

    }

    def "maximum of #a and #b is #c"() {
        expect:
        Math.max(a, b) == c

        where:
        a | b | c
        1 | 3 | 3
        7 | 4 | 7
        0 | 0 | 0
    }

    def "data pipe - maximum of #a and #b is #c"() {
        expect:
        Math.max(a, b) == c

        where:
        a << [1, 7, 0]
        b << [3, 4, 0]
        c << [3, 7, 0]
    }

//    def "maximum of two numbers with params- sepearate response with two || "() {
//        expect:
//        Math.max(a, b) == c
//
//        where:
//        a | b || c
//        1 | 3 || 3
//        7 | 4 || 7
//        0 | 0 || 0
//    }

    //this feature method is failing due to semicolon
//    def "maximum of two numbers with params - semicolons"() {
//        expect:
//        Math.max(a, b) == c
//
//        where:
//        a ; b ;; c
//        1 ; 3 ;; 3
//        7 ; 4 ;; 7
//        0 ; 0 ;; 0
//    }
}
