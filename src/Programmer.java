
public class Programmer {

    private String name;
    private String company;
    private String position = "intern";
    private int i;

    public Programmer(String name, String company) {
        this.name = name;
        this.company = company;
    }

    public String getPosition() {
        return position;
    }

    public void work() {
        i++;
        switch (i) {

            case 1 -> position = "junior";

            case 2 -> position = "middle";

            case 3 -> position = "senior";

            default -> position = "lead";
        }
    }
}


