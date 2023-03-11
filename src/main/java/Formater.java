public class Formater {
    public static String formater(double formaterring) { // formatter возвращет рубль в правильной форме
        String rub;
        if (Math.floor(formaterring) == 1) {
            rub = "рубль";
        } else if (Math.floor(formaterring) > 1 && Math.floor(formaterring) < 5) {
            rub = "рубля";
        } else {
            rub = "рублей";
        }
        return rub;
    }
}
