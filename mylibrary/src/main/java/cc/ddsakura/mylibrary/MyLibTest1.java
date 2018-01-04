package cc.ddsakura.mylibrary;

/*-
 * Created by ddsakura 
 * Date: 04/01/2018.
 */

import com.fasterxml.jackson.databind.ObjectMapper;

public class MyLibTest1 {

    private String helloStr;

    public MyLibTest1() {
        helloStr = "Hello";
    }

    public String sayHello() {
        ObjectMapper mapper = new ObjectMapper();
        return helloStr;
    }
}
