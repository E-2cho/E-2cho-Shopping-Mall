package org.e2cho.e2cho_shopping_mall.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

/**
 * JPA auditor enable
 */

@Configuration
@EnableJpaAuditing // JpaAuditing을 Enable
public class JpaAuditorConfig {
}
