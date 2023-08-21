package lessons.lesson10;

public class Box {
    int a;
    int b;
    int c;

    public Box() {

    }
    // Если есть конструктор с параметрами,
    // конструктор без параметров не создасть.
    public Box(int a) {
        // this - ссылка на самого себя
        this.a = a;
    }

    public Box(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public Box(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Box(Box box, int a, int b, int c) {
        box.a = a;
        box.b = b;
        box.c = c;
    }

    @Override
    public String toString() {
        return "Box{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }

    double volume() {
        return a * b * c;
    }
}
