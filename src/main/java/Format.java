public class Format {
    public static String format(double formater) { // formatter возвращет рубль в правильной форме
        String rub;
        int roundedNumber = (int) Math.floor(formater);
        if (roundedNumber == 1) {
            rub = "рубль";
        } else if (roundedNumber > 1 && roundedNumber < 5) {
            rub = "рубля";
        } else {
            rub = "рублей";
        }
        return rub;
    }
}
