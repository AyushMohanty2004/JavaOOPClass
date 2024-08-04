class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double findArea() {
        return length * width;
    }
}

class Box extends Rectangle {
    private double height;

    public Box(double length, double width, double height) {
        super(length, width);
        this.height = height;
    }

    public double findVolume() {
        return super.findArea() * height;
    }
}

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("Rectangle area: " + rectangle.findArea());

        Box box = new Box(5, 10, 15);
        System.out.println("Box volume: " + box.findVolume());
    }
}
