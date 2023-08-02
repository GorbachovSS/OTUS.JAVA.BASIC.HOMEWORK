package otus.java.basic.homework.lesson10;

public class Box {
    private double size;
    private String color;
    private boolean isOpen;
    private String item;

    public Box(double size, String color) {
        this.size = size;
        this.color = color;
    }


    //    public Box(double size, String color, boolean isOpen, String item) {
//        this.size = size;
//        this.color = color;
//        this.isOpen = isOpen;
//        this.item = item;
//    }
//
//    public Box(double size, String color, boolean isOpen) {
//        this.size = size;
//        this.color = color;
//        this.isOpen = isOpen;
//    }

    public double getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        System.out.println(color);
        this.color = color;
    }

    public boolean isOpen() {

        return isOpen;
    }

    public void setOpen(boolean open) {
        System.out.println(isOpenString(open));
        isOpen = open;
    }

    private String isOpenString(boolean isOpen) {
        if (isOpen) {
            return "Коробка открыта!";
        } else {
            return "Коробка закрыта!";
        }
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        if (isOpen()) {
            if (this.item == null || this.item.isBlank()) {
                this.item = item;
                System.out.println("Коробка пуста! Положил " + item);
            } else {
                System.out.println("Коробка заполнена!");
            }
        } else {
            System.out.println("Коробка закрыта!");
        }
    }

    public void dropItem() {
        System.out.println("Убрал из коробки " + this.item);
        this.item = null;
    }

    @Override
    public String toString() {
        return "Размер коробки: " + size + "\n"
                + "Цвет коробки: " + color + "\n"
                + "Состояние коробки: " + isOpenString(this.isOpen) + "\n"
                + "Предмет: " + item;
    }

}
