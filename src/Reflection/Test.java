package Reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Dummy dummy = new Dummy(1,"new");
        Field[] declaredFields = dummy.getClass().getDeclaredFields();
        Method[] methods = dummy.getClass().getDeclaredMethods();

        for(Method method : methods){
            System.out.println(method.getName());
//            method.invoke(dummy);
        }
    }
}
