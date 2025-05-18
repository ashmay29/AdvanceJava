class InputHandler {
    public String getInput() {
        return "Aanshuvi Shah";
    }
}

class DataProcessor {
    public void process(String data) {
        System.out.println("Processing: " + data);
    }
}

class SRPDemo {
    public static void main(String[] args) {
        InputHandler input = new InputHandler();
        DataProcessor processor = new DataProcessor();
        processor.process(input.getInput());
    }
}
