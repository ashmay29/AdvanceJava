class Rectangle {
    protected int width, height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getArea() {
        return width * height;
    }

    public String dimensions() {
        return width + " x " + height;
    }
}

class Square extends Rectangle {
    public Square(int side) {
        super(side, side);
    }
}

class LSPDemo {
    public static void printArea(Rectangle rect) {
        System.out.println("Area: " + rect.getArea());
        System.out.println("Dimensions: " + rect.dimensions());
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle(4, 5);
        Square s = new Square(4);
        printArea(r);
        printArea(s);
    }
}
