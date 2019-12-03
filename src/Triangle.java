public class Triangle extends Figure{
    private int a;
    private int b;
    private int c;

    public Triangle(int a, int b, int c,String name) {
        super(name);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
    int perimetr(Triangle triangle){
        int p = a+b+c;
        return p;
    }



    @Override
    double calculatePerimetr() {
        return a+b+c;
    }


    @Override
    public void draw() {
        System.out.println("\uD83D\uDD3A");
    }
}
