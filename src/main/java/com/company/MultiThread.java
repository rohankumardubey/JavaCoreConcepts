package com.company;

class input extends Thread{
    String name;
    Sample sample;
    input(String name, Sample sample) {
        this.name=name;
        this.sample=sample;
    }

    public void run() {
         this.sample.printing(name);
    }

}

class Sample{
    public synchronized void printing(String name){
        for (int i = 0; i <=10; i++) {
            System.out.println(name+" : "+i);
            try{
                Thread.sleep(500);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

public class MultiThread {
    public static void main(String[] args) {
        Sample sam1 = new Sample();
        Sample sam2 = new Sample();
        Sample sam3 = new Sample();
        new input("thread1",sam1);
        new input("thread2",sam2);
        new input("thread3",sam3);

    }
}


