package com.yuan.aware.applicationContext;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

@SuppressWarnings("rawtypes")
public class PropertyGettedListener implements ApplicationListener {
    public void onApplicationEvent(ApplicationEvent event) {
        System.out.println(event.getSource().toString());  
    }
}