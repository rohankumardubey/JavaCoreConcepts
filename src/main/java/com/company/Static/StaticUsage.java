package com.company.Static;

class StaticSample{
    int eid;
    int number;
    String name;
    static String tag_number;

    static{
        tag_number="999";
    }

    public StaticSample(){
        eid=1;
        number=1;
        name="default";
        System.out.println("this is constructor block");
    }

    public void show(){
        System.out.println("eid : "+eid +"\n"
                +"number : "+number+"\n"
                +"name : "+name +"\n"+
                "tag number : "+tag_number);
    }

    public  static void changeit(){
        tag_number="changed";
    }
}
public class StaticUsage {
    public static void main(String[] args) {

        System.out.println("===========================");

        StaticSample defaultValues = new StaticSample();
        defaultValues.show();


        System.out.println("===========================");
        StaticSample one = new StaticSample();
        one.name="ron";
        one.number=1;
        one.eid=123;
        one.tag_number="888";
        one.show();
        System.out.println("===========================");


        StaticSample two = new StaticSample();
        two.name="ron";
        two.number=1;
        two.eid=123;
        two.tag_number="777";
        two.show();

        System.out.println("===========================");

        StaticSample.changeit();
        StaticSample three = new StaticSample();
        three.name="ron";
        three.number=1;
        three.eid=123;
        three.show();

        System.out.println("===========================");
    }
}
