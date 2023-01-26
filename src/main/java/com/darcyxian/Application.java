package com.darcyxian;

import com.darcyxian.config.Config;
import com.darcyxian.service.OutPut;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) throws InterruptedException {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);
        OutPut outPut = applicationContext.getBean(OutPut.class);

        for(int i=0; i<5; i++){
            outPut.addOneToNums(2);
            outPut.showBadWhether();
            outPut.showGoodWhether();
            Thread.sleep(1000);
        }



    }
}
