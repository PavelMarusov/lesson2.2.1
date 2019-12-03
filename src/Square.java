public class Square extends Figure {
    private int a;
    private  int b;


    public Square(String name, int a, int b) {
        super(name);
        this.a = a;
        this.b = b;
    }

    @Override
    double calculatePerimetr() {
        return a*b;
    }


    @Override
    public void draw() {
        System.out.println("⬛");
    }
}
