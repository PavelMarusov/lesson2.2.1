import java.util.Random;

public class Main {

    private static Object Circle;

    public static void main(String[] args) {
        Circle circle = new Circle(3,"Circle");
        Triangle triangle = new Triangle(2,2,2,"Triangle");
        Square square = new Square("Square",5,5);
        Rectangle rectangle =  new Rectangle("Rectangle", 6,3);



        Figure[] figures = {circle,triangle,square, rectangle};
        for (int i = 0; i <figures.length; i++) {
            figures[i].draw();
            System.out.println(figures[i].getName());
            System.out.println("Периметр "+ figures[i].getName()+" = " + figures[i].calculatePerimetr());

        }
        Dog dog = new Dog("Bobik");
        dog.draw();
        System.out.println(dog.getName()  );
        dog.callSound("Gav - gav");




    }
}
