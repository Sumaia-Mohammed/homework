package project.Text;

public class Text {

    private String name;

    public Text(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    void introduce() {
        System.out.println("Original words : " + this.name);
    }

    void introduceSentences() {
        System.out.println("Original sentences : " + this.name);
    }

}

