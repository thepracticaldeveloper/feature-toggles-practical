package io.tpd.dadjokes.unleash;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import no.finn.unleash.DefaultUnleash;
import no.finn.unleash.Unleash;
import no.finn.unleash.UnleashContextProvider;
import no.finn.unleash.util.UnleashConfig;

@Configuration
public class UnleashConfiguration {

    @Bean
    public UnleashConfig unleashConfig(
            @Value("${unleash.appName}") String appName,
            @Value("${unleash.instanceId}") String instanceId,
            @Value("${unleash.apiUrl}") String apiUrl,
            @Value("${unleash.clientSecret}") String clientSecret,
            UnleashContextProvider unleashContextProvider) {
        return UnleashConfig.builder()
                .appName(appName)
                .instanceId(instanceId)
                .unleashAPI(apiUrl)
                .unleashContextProvider(unleashContextProvider)
                .customHttpHeader("Authorization", clientSecret)
                .build();
    }

    @Bean
    public Unleash unleash(UnleashConfig unleashConfig) {
        return new DefaultUnleash(unleashConfig);
    }
}
