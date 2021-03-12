package io.tpd.dadjokes.requestcontext;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Component
public class RequestContextMvcConfigurer implements WebMvcConfigurer {

    private final RequestContextInterceptor requestContextInterceptor;

    public RequestContextMvcConfigurer(final RequestContextInterceptor requestContextInterceptor) {
        this.requestContextInterceptor = requestContextInterceptor;
    }

    @Override
    public void addInterceptors(final InterceptorRegistry registry) {
        registry.addInterceptor(requestContextInterceptor);
    }
}
