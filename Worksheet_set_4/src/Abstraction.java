/*Shape class does not provide the implementation details to Circle, Square classes. Circle class simply knows what the methods are supposed to do but does not have
any idea about how, Therefore it will need to implement them*/

abstract class Shape {
    abstract void draw();

    abstract float area();
}

class Circle extends Shape {
    int radius;

    Circle(int val) {
        this.radius = val;
    }

    @Override
    void draw() {
        System.out.println("Drawing a Circle");
    }

    @Override
    float area() {
        return (22 * this.radius * this.radius) / 7;
    }
}

class Square extends Shape {
    int side;

    Square(int val) {
        this.side = val;
    }

    @Override
    void draw() {
        System.out.println("Drawing a Square");
    }

    @Override
    float area() {
        return (float) this.side * this.side;
    }
}
