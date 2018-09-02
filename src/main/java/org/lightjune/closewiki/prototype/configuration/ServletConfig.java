package org.lightjune.closewiki.prototype.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@ComponentScan("org.lightjune.closewiki.prototype.helloworld.controller")
public class ServletConfig {

}
