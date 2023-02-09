package com.sparrow.cms.test;

import com.sparrow.protocol.MethodOrder;
import java.lang.reflect.Method;

public class User {
    public static void main(String[] args) throws NoSuchMethodException {
        User user = new User();
        Method method = user.getClass().getDeclaredMethod("getTest");
        MethodOrder methodOrder = method.getAnnotation(MethodOrder.class);
        System.out.println(methodOrder.order());
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    @MethodOrder(order = 2)
    private void getTest() {
        System.out.println("test");
    }
}
