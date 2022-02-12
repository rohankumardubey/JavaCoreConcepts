package com.company.CheckStatus;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StatusUsage {
    private static final Logger LOGGER = LoggerFactory.getLogger(StatusUsage.class);

    public static void main(String[] args) {
        System.out.println(checkStatus(6000));
    }
    public static CMnNifiProcessGroupStatus checkStatus(long timeBound) {
        String response;
        int input=1;
        int queue=0;
        int output=0;
        CMnNifiProcessGroupStatus isCompleted= CMnNifiProcessGroupStatus.TIMED_OUT;
        long millis = System.currentTimeMillis();
        timeBound=timeBound+millis;
        while(millis<=timeBound){
            millis=System.currentTimeMillis();
            System.out.println(millis);
            response= "sample";
            LOGGER.debug(response);
            if (response != null && queue==0 && input==0 && output==0) {
                LOGGER.info("Flow completed within time bound!");
                isCompleted= CMnNifiProcessGroupStatus.COMPLETED;
            }
        }
        if(isCompleted.equals(CMnNifiProcessGroupStatus.TIMED_OUT)){
            LOGGER.error("Flow is incomplete after the time bound : PROCESS FAILED!");
        }
        return isCompleted;
    }

    public enum CMnNifiProcessGroupStatus{
        COMPLETED,TIMED_OUT
    }
}
