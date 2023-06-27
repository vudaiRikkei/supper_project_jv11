public class HungClass {
    private int id;
    private String name;
    private String veryPrivate;

    public HungClass(int id, String name, String veryPrivate) {
        this.id = id;
        this.name = name;
        this.veryPrivate = veryPrivate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVeryPrivate() {
        return veryPrivate;
    }

    public void setVeryPrivate(String veryPrivate) {
        this.veryPrivate = veryPrivate;
    }
}
