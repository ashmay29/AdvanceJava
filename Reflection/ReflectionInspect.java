// 31. Inspect Class using Reflection
import java.lang.reflect.Field;
import java.lang.reflect.Method;

class Person {
    public String name;
    private int age;

    public void greet() {
        System.out.println("Hello!");
    }

    private void secret() {
        System.out.println("Secret method");
    }
}

class ReflectionInspect {
    public static void main(String[] args) {
        Class<?> clazz = Person.class;

        System.out.println("Class Name: " + clazz.getName());

        System.out.println("Fields:");
        for (Field field : clazz.getDeclaredFields()) {
            System.out.println(" - " + field.getName());
        }

        System.out.println("Methods:");
        for (Method method : clazz.getDeclaredMethods()) {
            System.out.println(" - " + method.getName());
        }
    }
}
