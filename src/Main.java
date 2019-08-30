
public class Main {
    public static void main(String[] args) {
        IDefining box = new Box();
        box.add(new Candy("Грильяж", 300, 100, "Красный Октябрь"));
        box.add(new JellyBean("Вкусный мармелад", 800, 150, 1200));
        box.add(new Gingerbread("Пряник", 400, 200, "шоколадный"));

        System.out.println("Вес коробки = " + box.getWeight());
        System.out.println("Цена коробки = " + box.getPrice());


        System.out.println( box.getAllInfoAboutBox());

        box.removeTheLastSweet();
        box.removeTheLastSweet();
        box.removeTheLastSweet();


        box.removeTheSweetByIndex(43);
        System.out.println( box.getAllInfoAboutBox());


    }
}
