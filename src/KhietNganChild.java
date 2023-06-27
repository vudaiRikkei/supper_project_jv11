public class KhietNganChild {
    private int id;
    private String name;
    private String birthDay;
    private boolean gender;

    public KhietNganChild(int id, String name, String birthDay, boolean gender) {
        this.id = id;
        this.name = name;
        this.birthDay = birthDay;
        this.gender = gender;
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

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }
}