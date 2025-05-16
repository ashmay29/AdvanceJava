
class Swapper {
    public static <T> void swap(T[] array, int i, int j) {
        System.out.println("Before swap: " + array[i] + " and " + array[j]);
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        System.out.println("After swap: " + array[i] + " and " + array[j]);
    }

    public static void main(String[] args) {
        String[] names = {"Alice", "Bob"};
        swap(names, 0, 1);

        Integer[] numbers = {10, 20};
        swap(numbers, 0, 1);

        Character[] chars = {'X', 'Y'};
        swap(chars, 0, 1);
    }
}
