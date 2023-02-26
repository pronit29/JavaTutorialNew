package methodOverloading;

public class PlayingCat {

    public static boolean isCatPlaying(boolean summer, int temperature) {
        if((summer == true) && ((temperature < 25) || (temperature > 45))) {
            System.out.println(false);
            return false;
        } else if ((summer == false) && ((temperature < 25) || (temperature > 35))) {
            System.out.println(false);
            return false;
        }  else {
            System.out.println(true);
        }
        return true;

    }

    public static void main(String[] args) {

        isCatPlaying(false,35);
    }
}
