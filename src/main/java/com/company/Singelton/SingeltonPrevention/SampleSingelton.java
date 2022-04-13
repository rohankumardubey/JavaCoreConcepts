package com.company.Singelton.SingeltonPrevention;

public class SampleSingelton implements Cloneable{


    private static SampleSingelton INSTANCE;

    private SampleSingelton(){
        if(INSTANCE!=null){
            throw new IllegalStateException("object cannot be created");
        }
    }

    public static synchronized SampleSingelton getInstance(){
        if(INSTANCE==null){
            INSTANCE= new SampleSingelton();
        }
        return INSTANCE;
    }

    //preventing the cloning
    @Override
    public SampleSingelton clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
}
