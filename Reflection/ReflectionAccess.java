import java.lang.reflect.Field;

class Secret {
    private String message = "Top Secret";

    public String reveal() {
        return message;
    }
}

class ReflectionAccess {
    public static void main(String[] args) {
        try {
            Secret secret = new Secret();
            Class<?> clazz = secret.getClass();

            Field field = clazz.getDeclaredField("message");
	    System.out.println("Old message: " + secret.reveal());
            field.setAccessible(true); 
            field.set(secret, "Classified Info"); 

            System.out.println("Modified message: " + secret.reveal());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
