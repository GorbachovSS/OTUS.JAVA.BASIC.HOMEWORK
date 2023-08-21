package otus.java.basic.homework.lesson14;

public class MyArrayDataException extends RuntimeException {
    private String i;
    private String j;

    public String getI() {
        return i;
    }

    public void setI(String i) {
        this.i = i;
    }

    public String getJ() {
        return j;
    }

    public void setJ(String j) {
        this.j = j;
    }

    public MyArrayDataException(int i, int j) {
    }
}
