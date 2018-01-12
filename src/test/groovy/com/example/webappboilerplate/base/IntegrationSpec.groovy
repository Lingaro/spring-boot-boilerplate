package com.example.webappboilerplate.base

import com.example.webappboilerplate.Application
import org.springframework.test.context.ContextConfiguration
import spock.lang.Ignore
import spock.lang.Specification

@ContextConfiguration(classes = Application)
@Ignore
class IntegrationSpec extends Specification {

}
