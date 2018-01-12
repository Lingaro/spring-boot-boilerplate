package com.example.webappboilerplate

import org.junit.Test
import spock.lang.Specification

class SampleUnitSpec extends Specification {

    def 'sample data driven test case'() {
        expect:
            a * b == c
        where:
            a  |  b  |  c
            2  |  3  |  6
            3  |  3  |  9
    }

    def 'sample unit test case'() {
        given: 'test input data'
            def a = 3
            def b = 2
        when: 'result is calculated'
            def result = a % b
        then: 'it should be equal 1'
            result == 1
    }
}
