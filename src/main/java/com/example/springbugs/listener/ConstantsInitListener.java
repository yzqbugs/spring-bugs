
package com.example.springbugs.listener;


import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.context.event.ApplicationContextInitializedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.core.Ordered;


/**
 * <p>waiting</p>
 * <p>
 *     <a href="https://docs.spring.io/spring-boot/docs/2.7.0/reference/htmlsingle/#features.spring-application.application-events-and-listeners">doc link</a>
 * </p>

 */
@AutoConfiguration
@Slf4j
public class ConstantsInitListener implements ApplicationListener<ApplicationContextInitializedEvent>, Ordered {



    @Override
    public int getOrder() {
        return Ordered.HIGHEST_PRECEDENCE;
    }

    @Override
    public void onApplicationEvent(ApplicationContextInitializedEvent applicationContextInitializedEvent) {
        log.info("listener start");
        System.out.println(ConstantsInitListener.class.getName());
    }
}
