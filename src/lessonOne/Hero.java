package lessonOne;

public class Hero {
    private String name = "User";
    private String position = "00";
    private int health = 100;
    private int damage = 5;
    private int experience;

    public Hero(String name, String position, int health, int damage, int experience) {
        this.name = name;
        this.position = position;
        this.health = health;
        this.damage = damage;
    }

    public  void move(String direction) {
        int x = Character.getNumericValue(position.charAt(0));
        int y = Character.getNumericValue(position.charAt(1));
        String net = "| 00 | 01 | 02 | 03 | 04 |\n" +
                "| -- | -- | -- | -- | -- |\n" +
                "| 10 | 11 | 12 | 13 | 14 |\n" +
                "| 20 | 21 | 22 | 23 | 24 |\n" +
                "| 30 | 31 | 32 | 33 | 34 |\n" +
                "| 40 | 41 | 42 | 43 | 44 |";

        if (direction.equals("up")&& x > 0) {
            x--;
        } else if (direction.equals("down")&& x < 4) {
            x++;
        } else if (direction.equals("left")&& y > 0) {
            y--;
        } else if (direction.equals("right")&& y < 4) {
            y++;
        } else {
            System.out.println("Invalid direction, player not found in net");
        }

        position = "" + x + y;
        System.out.println("Hero moved to " + position);


    }


}
