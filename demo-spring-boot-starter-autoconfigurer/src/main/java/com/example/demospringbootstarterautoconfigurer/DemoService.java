package com.example.demospringbootstarterautoconfigurer;

public class DemoService {

    private DemoProperties demoProperties;

    public DemoProperties getDemoProperties() {
        return demoProperties;
    }

    public void setDemoProperties(DemoProperties demoProperties) {
        this.demoProperties = demoProperties;
    }

    public String sayHello(String name) {
        return  "\n## " + name + " say hello to :"+
                "\nName: " + demoProperties.getName()+
                "\nAge:" + demoProperties.getAge()+
                "\nAddress: " + demoProperties.getAddress();
    }
}
