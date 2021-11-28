package com.company.LambdaPractise;

public class SampleInterfaceLambda {
    public static void main(String[] args) {
        SampleInterfaceUsage sample = parameter -> {
            if(parameter.equals("success") || parameter.toLowerCase().equals("success"))
                return "response send successfully";
            else
                return "response failed!!";
        };
        System.out.println(sample.sendResponse("Success"));

        SampleInterfaceUsage temp = new SampleInterfaceUsage() {
            @Override
            public String sendResponse(String parameter) {
                if(parameter.equals("success") || parameter.toLowerCase().equals("success"))
                    return "response send successfully";
                else
                    return "response failed!!";
            }
        };
        System.out.println(temp.sendResponse("failed"));
    }
}
