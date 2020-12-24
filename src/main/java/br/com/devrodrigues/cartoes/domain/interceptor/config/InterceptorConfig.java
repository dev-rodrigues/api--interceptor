package br.com.devrodrigues.cartoes.domain.interceptor.config;

import br.com.devrodrigues.cartoes.domain.interceptor.AcceleratorInterceptor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@RequiredArgsConstructor
@Component
public class InterceptorConfig extends WebMvcConfigurerAdapter {

    private final AcceleratorInterceptor accelerator;

    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(accelerator);
    }
}
