package superKeywordExample;

class Shape {
    void draw() {
        System.out.println("Drawing a shape");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a circle");
        super.draw();
    }
}

public class SuperKeywordExample {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.draw();
    }
}
