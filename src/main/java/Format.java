public class Format {
    public static String format(double formater) { // formatter возвращет рубль в правильной форме
        String rub;
        int roundedNumber = (int) Math.floor(formater);
        int preLastDigit = roundedNumber % 100 / 10;
        if (preLastDigit == 1)
        {
            return "рублей";
        }

        switch (roundedNumber % 10)
        {
            case 1:
                return "рубль";
            case 2:
            case 3:
            case 4:
                return "рубля";
            default:
                return "рублей";
        }
    }

}
