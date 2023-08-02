package otus.java.basic.homework.lesson10;

public class User {
    private String name, lastName, middleName, email;
    private int birthday;

    public User(String name, String lastName, String middleName, String email, int birthday) {
        this.name = name;
        this.lastName = lastName;
        this.middleName = middleName;
        this.email = email;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getBirthday() {
        return birthday;
    }

    public void setBirthday(int birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "ФИО: " + lastName + " " + name + " " + middleName + "\n"
                + "Год рождения: " + birthday + "\n"
                + "e-mail: " + email;
    }
}
