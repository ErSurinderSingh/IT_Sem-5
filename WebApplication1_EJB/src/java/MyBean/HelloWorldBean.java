package MyBean;

import javax.ejb.Stateless;

@Stateless
public class HelloWorldBean {

    private String name;

    public void setName(String name) {
        this.name = name;
    }
    static String msg;

    public HelloWorldBean() {
        msg = "Hello World";
    }

    public String sayHello() {
        return msg;
    }
    
    public String getUName(){
        return name;
    }
}
