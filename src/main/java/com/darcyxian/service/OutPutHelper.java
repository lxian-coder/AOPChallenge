package com.darcyxian.service;

import com.darcyxian.aspect.Loggable;
import org.springframework.stereotype.Component;

@Component
public class OutPutHelper {
    public OutPutHelper(){};

    @Loggable
    public String greeting() {
        return "HAHAHAH ";
    }
}
