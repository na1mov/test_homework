import java.util.ArrayList;

public class LostAndFoundOffice {
    // создайте список things
    ArrayList<Object> things = new ArrayList<>();

    // реализуйте метод put()
    public void put(Object thing) {
        things.add(thing);
    }

    // реализуйте метод check()
    public boolean check(Object thing) {
        if(thing == null) {
            return false;
        }
        for (Object object : things) { // логика проверки вещи в списке
            if(object.equals(thing)) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
}
