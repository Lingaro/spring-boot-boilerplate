package com.example.webappboilerplate

import com.example.webappboilerplate.base.MvcIntegrationSpec
import org.springframework.test.web.servlet.result.MockMvcResultMatchers

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get

class SampleMvcIntegrationSpec extends MvcIntegrationSpec {

    def 'sample test'() {
        expect:
            mockMvc.perform(get("/test"))
                    .andExpect(MockMvcResultMatchers.content().string("OK"))
    }
}
