class Sample {
    public void show() {
        System.out.println("First instance method called.");
    }

    public void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }
}

class ReflectionCreate {
    public static void main(String[] args) {
        try {
            Class<?> clazz = Class.forName("Sample");

            Object obj1 = clazz.getDeclaredConstructor().newInstance();
            clazz.getMethod("show").invoke(obj1);

            Object obj2 = clazz.getDeclaredConstructor().newInstance();
            clazz.getMethod("greet", String.class).invoke(obj2, "Aanshuvi");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
