package lessonOne;

public class Main {
    static Hero hero = new Hero("John", "right",100, 3, 5);
    public static void main(String[] args) {
        hero.move("up");
        hero.move("down");
        hero.move("left");
        hero.move("right");
    }
}
