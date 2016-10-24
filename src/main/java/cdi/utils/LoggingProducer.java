package cdi.utils;

import javax.enterprise.inject.spi.InjectionPoint;
import javax.ws.rs.Produces;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingProducer {
    @Produces
    private Logger createLogger(InjectionPoint injectionPoint) {
        return LoggerFactory.getLogger(injectionPoint.getMember().getDeclaringClass().getName());
    }
}
