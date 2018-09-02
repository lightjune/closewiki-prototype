package org.lightjune.closewiki.prototype.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(value={DataSourceConfig.class})
public class RootContextConfig {

}
