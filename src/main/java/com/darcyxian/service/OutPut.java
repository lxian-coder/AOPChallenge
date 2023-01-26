package com.darcyxian.service;

import com.darcyxian.aspect.Loggable;
import org.springframework.stereotype.Service;

@Service
public class OutPut {
    private OutPutHelper outPutHelper;
    public OutPut(OutPutHelper outPutHelper){
     this.outPutHelper = outPutHelper;
    }

    @Loggable
    public void showGoodWhether(){
        System.out.println(outPutHelper.greeting()+ "Today's whether is good.");
    }
    public void showBadWhether(){
        System.out.println(outPutHelper.greeting() + "Today's whether is bad.");
    }
    public int addOneToNums(int num){
        return num++;
    }
}
