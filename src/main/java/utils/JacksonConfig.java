package utils;

import org.n52.jackson.datatype.jts.JtsModule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
public class JacksonConfig {
    public JtsModule jtsModule() {
        return new JtsModule();
    }
}
