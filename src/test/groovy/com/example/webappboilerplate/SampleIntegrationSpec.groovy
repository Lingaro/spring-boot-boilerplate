package com.example.webappboilerplate

import com.example.webappboilerplate.SampleController
import com.example.webappboilerplate.base.IntegrationSpec
import org.springframework.beans.factory.annotation.Autowired

class SampleIntegrationSpec extends IntegrationSpec {
    @Autowired
    SampleController sampleController

    def 'sample test'() {
        expect:
            sampleController.test() == "OK"
    }
}
