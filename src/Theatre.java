public class Theatre {
    public static void main(String[] args) {
        // актёры
        Actor ivanov = new Actor("Иван", "Иванов", Gender.MALE, 180);
        Actor petrova = new Actor("Анна", "Петрова", Gender.FEMALE, 165);
        Actor sidorov = new Actor("Пётр", "Сидоров", Gender.MALE, 175);

        // режиссёры
        Director smirnov = new Director("Сергей", "Смирнов", Gender.MALE, 12);
        Director kuznetsova = new Director("Ольга", "Кузнецова", Gender.FEMALE, 7);

        // автор музыки и хореограф
        Person musicAuthor = new Person("Михаил", "Глинкин", Gender.MALE);
        Person choreographer = new Person("Елена", "Лебедева", Gender.FEMALE);

        // спектакли
        Show drama = new Show("Вишнёвый сад", 150, smirnov);
        Opera opera = new Opera("Зимняя сказка", 180, kuznetsova, musicAuthor,
                "Опера о путешествии героя через заснеженный лес.", 40);
        Ballet ballet = new Ballet("Белые ночи", 120, smirnov, musicAuthor,
                "Балет о встрече двух влюблённых летней ночью.", choreographer);

        // распределяем актёров
        drama.addActor(ivanov);
        drama.addActor(petrova);
        drama.addActor(ivanov); // повторное добавление — должно вывестись предупреждение

        opera.addActor(petrova);
        opera.addActor(sidorov);

        ballet.addActor(sidorov);
        ballet.addActor(ivanov);

        // режиссёры спектаклей
        drama.printDirector();
        opera.printDirector();
        ballet.printDirector();
        System.out.println();

        // списки актёров
        drama.printActors();
        System.out.println();
        opera.printActors();
        System.out.println();
        ballet.printActors();
        System.out.println();

        // заменяем актёра в спектакле на актёра из другого спектакля
        drama.replaceActor(sidorov, "Петрова");
        drama.printActors();
        System.out.println();

        // пробуем заменить несуществующего актёра
        opera.replaceActor(ivanov, "Несуществующий");
        System.out.println();

        // либретто
        opera.printLibretto();
        System.out.println();
        ballet.printLibretto();
    }
}
