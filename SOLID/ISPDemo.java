interface Printable {
    void print();
}

interface Scannable {
    void scan();
}

interface Faxable {
    void fax();
}

class Printer implements Printable {
    public void print() {
        System.out.println("Printing...");
    }
}

class Scanner implements Scannable {
    public void scan() {
        System.out.println("Scanning...");
    }
}

class MultiFunctionPrinter implements Printable, Scannable, Faxable {
    public void print() {
        System.out.println("Printing...");
    }

    public void scan() {
        System.out.println("Scanning...");
    }

    public void fax() {
        System.out.println("Faxing...");
    }
}

public class ISPDemo {
    public static void main(String[] args) {
        Printable printer = new Printer();
        printer.print();

        Scannable scanner = new Scanner();
        scanner.scan();

        MultiFunctionPrinter mfp = new MultiFunctionPrinter();
        mfp.print();
        mfp.scan();
        mfp.fax();
    }
}
