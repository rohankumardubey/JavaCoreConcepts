package com.company.Static;

class StaticSample{
    int eid;
    int number;
    String name;
    static String tag_number;

    static{
        tag_number="999";
        System.out.println("this is static block");
    }

    public StaticSample(){
        eid=1;
        number=1;
        name="default";
        System.out.println("this is constructor block");
    }

    public void show(){
        System.out.println("eid :"+eid +" number :"+number+" name :"+name +" tag number :"+tag_number);
    }
}
public class StaticUsage {
    public static void main(String[] args) {
        StaticSample one = new StaticSample();
        one.name="ron";
        one.number=1;
        one.eid=123;
        one.tag_number="888";
        one.show();


        StaticSample two = new StaticSample();
        two.name="ron";
        two.number=1;
        two.eid=123;
        two.tag_number="777";
        two.show();

        StaticSample defaultValues = new StaticSample();
        defaultValues.show();

//        if(one.tag_number==two.tag_number){
//            System.out.println("equal");
//        }
//        else{
//            System.out.println("unequal");
//        }

    }
}
