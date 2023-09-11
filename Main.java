public class Main {
    public static void main(String[] args) {
        String val = "6432dhe23 6s7s";

        Extract extract = new Extract(val);

        // extract.nextDigit();
        while (extract.hasNext()) {
            int digit = extract.nextDigit1();
            if (digit > 0) {
                extract.addToList(digit);
            }
            extract.incrementCurrent();
        }
        System.out.println(extract.digits);
    }
}