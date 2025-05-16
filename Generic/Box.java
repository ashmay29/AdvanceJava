
class Box<T> {
    private T content;

    public void setContent(T content) {
        this.content = content;
    }

    public T getContent() {
        return content;
    }

    public void printContent() {
        System.out.println("Box contains: " + content);
    }

    public static void main(String[] args) {
        Box<String> stringBox = new Box<>();
        stringBox.setContent("Java Generics");
        stringBox.printContent();

        Box<Integer> intBox = new Box<>();
        intBox.setContent(100);
        intBox.printContent();

        Box<Double> doubleBox = new Box<>();
        doubleBox.setContent(99.99);
        doubleBox.printContent();
    }
}
