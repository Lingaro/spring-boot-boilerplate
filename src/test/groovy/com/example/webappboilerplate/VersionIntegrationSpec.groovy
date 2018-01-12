package com.example.webappboilerplate

import com.example.webappboilerplate.base.IntegrationSpec
import org.springframework.beans.factory.annotation.Autowired

class VersionIntegrationSpec extends IntegrationSpec {
    @Autowired
    VersionController versionController

    def 'sample test'() {
        expect:
            versionController.version().length() > 0
    }
}
