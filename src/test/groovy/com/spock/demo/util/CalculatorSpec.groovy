package com.spock.demo.util

import spock.lang.Shared
import spock.lang.Specification

class CalculatorSpec extends Specification {

    @Shared
    def calculator = new Calculator()

    def setupSpec() {
        System.out.println("setupSpec method")
    }

    def setup() {
        System.out.println("setup method")
    }

def "first feature method"() {
    setup:
    System.out.println("feature method")
    // blocks go here
}

    def cleanup() {
        System.out.println("cleanup method")
    }

    def cleanupSpec() {
        System.out.println("cleanupSpec method")
    }

}
