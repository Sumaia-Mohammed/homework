package lesson13;

public class Robot {

    public int id;

    public String name;

    public String color;

    public int weigh;

    public Robot(){

    }

    public Robot(int id, String name, String color, int weigh) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.weigh = weigh;
    }

    @Override
    public boolean equals(Object o) {
        Robot anotherRobot = (Robot) o;
        return id == anotherRobot.id &&
                name.equals(anotherRobot.name) &&
                color.equals(anotherRobot.color) &&
                weigh == anotherRobot.weigh;
    }

    @Override
    public int hashCode() {
        return id * 17;
    }
}
