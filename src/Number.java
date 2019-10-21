import java.util.ArrayList;

public abstract class Number {
    private int number;

    public Number(int number) {
        this.number = number;
    }

    public Integer smallNumber() {
        return number;

    }

    public Integer smallNumber (ArrayList < Integer > number) {
        ArrayList<Integer> newArraylist = new ArrayList<>();
        for (int i = number.size() - 1; i >= 0; i--) {
            newArraylist.add(number.get(i));
        }
        return smallNumber();
    }
}
