
class NumberPrinter {
    public static <T extends Number> void printNumber(T value) {
        System.out.println("Value: " + value);
	System.out.println("Integer format: " + value.intValue());
        System.out.println("Double format: " + value.doubleValue());
	System.out.println("Float format: " + value.floatValue());
    }

    public static void main(String[] args) {
        Integer intVal = 42;
        Double doubleVal = 42.42;
        Float floatVal = 42.0f;

        printNumber(intVal);
        printNumber(doubleVal);
        printNumber(floatVal);
    }
}
