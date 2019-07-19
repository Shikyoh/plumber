package com.hebaibai.admin.common.properties;

import lombok.Data;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;

/**
 * @author MrBird
 */
@Data
@SpringBootConfiguration
@PropertySource(value = {"classpath:admin.properties"})
@ConfigurationProperties(prefix = "admin")
public class FebsProperties {

    private ShiroProperties shiro = new ShiroProperties();
    private boolean openAopLog = true;
}