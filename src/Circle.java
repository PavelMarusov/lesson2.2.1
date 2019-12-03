import javax.xml.namespace.QName;

public class Circle extends Figure {
    private int radius;

    public Circle(int radius, String name) {
        super( name);
        this.radius = radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }
    double perimetr (Circle circle){
        double p = 2*3.14 +(double) radius;
        return p;

    }



    @Override
    double calculatePerimetr() {
        return 2*3.14 + radius;
    }


    @Override
    public void draw() {
        System.out.println("⭕");
    }
}
