package br.com.devrodrigues.cartoes.domain.interceptor;


import br.com.devrodrigues.cartoes.domain.annotation.AllowAccelerator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class AcceleratorInterceptor implements HandlerInterceptor {

    private final Logger LOGGER = LoggerFactory.getLogger(AcceleratorInterceptor.class);

    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {


        final AllowAccelerator accelerator = ((HandlerMethod)handler).getMethod().getAnnotation((AllowAccelerator.class));

        if (accelerator != null) {
            System.out.println("cuco");
            return false;
        }

        return true;
    }
}
