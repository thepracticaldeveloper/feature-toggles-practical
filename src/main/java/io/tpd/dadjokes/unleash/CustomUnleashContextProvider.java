package io.tpd.dadjokes.unleash;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

import io.tpd.dadjokes.requestcontext.RequestContext;

import no.finn.unleash.UnleashContext;
import no.finn.unleash.UnleashContextProvider;

@Component
@RequestScope
public class CustomUnleashContextProvider implements UnleashContextProvider {

    private final RequestContext requestContext;

    public CustomUnleashContextProvider(final RequestContext requestContext) {
        this.requestContext = requestContext;
    }

    @Override
    public UnleashContext getContext() {
        System.out.println("Unleash context with userid " + requestContext.getUserId());
        return UnleashContext.builder()
                .userId(requestContext.getUserId())
                .build();
    }
}
