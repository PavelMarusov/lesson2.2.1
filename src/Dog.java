public class Dog extends Animal implements Drawable, SoundProducable {


    public Dog(String name) {
        super(name);
    }

    @Override
    public void draw() {
        System.out.println("\uD83D\uDC36");
    }


    @Override
    public void callSound(String sound) {
        System.out.println("Собака лает :" + sound);
    }
}
