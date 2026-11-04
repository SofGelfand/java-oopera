import java.util.ArrayList;

public class Show {
    protected String title;
    protected int duration;
    protected Director director;
    protected ArrayList<Actor> listOfActors;

    public Show(String title, int duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public void printDirector() {
        System.out.println("Режиссёр спектакля «" + title + "»: " + director);
    }

    public void printActors() {
        System.out.println("Актёры спектакля «" + title + "»:");
        if (listOfActors.isEmpty()) {
            System.out.println("Список актёров пуст.");
            return;
        }
        for (Actor actor : listOfActors) {
            System.out.println(actor);
        }
    }

    public void addActor(Actor actor) {
        if (listOfActors.contains(actor)) {
            System.out.println("Актёр " + actor + " уже участвует в спектакле «" + title + "».");
            return;
        }
        listOfActors.add(actor);
    }

    public void replaceActor(Actor newActor, String surnameToReplace) {
        for (int i = 0; i < listOfActors.size(); i++) {
            if (listOfActors.get(i).getSurname().equals(surnameToReplace)) {
                listOfActors.set(i, newActor);
                return;
            }
        }
        System.out.println("Актёр с фамилией " + surnameToReplace
                + " не найден в спектакле «" + title + "». Замена не выполнена.");
    }
}
