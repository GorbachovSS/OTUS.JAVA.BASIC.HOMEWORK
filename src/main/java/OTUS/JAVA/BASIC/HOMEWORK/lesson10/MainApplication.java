package otus.java.basic.homework.lesson10;

public class MainApplication {
    public static void main(String[] args) {


        //        User[] users = {
//                new User("Sergey", "Gorbachev", "Sergeevich", "abc@mail.ru", 1994),
//                new User("Ivan", "Gorbachev", "Sergeevich", "abc@mail.ru", 1974),
//                new User("Igor", "Gorbachev", "Sergeevich", "abc@mail.ru", 1954)
//        };
//        for (int i = 0; i < users.length; i++) {
//            if (2023 - users[i].getBirthday() > 40 ){
//                System.out.println(users[i].toString() + "\n");
//            }
//        }

        Box box = new Box(5.5, "Blaсk");
        box.setOpen(true);
        System.out.println(box);
        box.setItem("Кирпич");
        System.out.println();
        System.out.println(box);
        box.dropItem();
        System.out.println();
        System.out.println(box);
        box.setItem("Мяч");
        System.out.println();
        System.out.println(box);

    }
}

