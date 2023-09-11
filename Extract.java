import java.util.ArrayList;

public class Extract {
    public String value = "";
    public ArrayList<Integer> digits = new ArrayList<>();
    int current = 0;

    public Extract(String value) {
        this.value = value;
    }

    public boolean hasNext() {
        if (current < value.length()) {
            return true;
        }
        return false;
    }

    public int nextDigit() {
        try {
            String val = String.valueOf(value.charAt(current));
            int convert = Integer.parseInt(val);
            return convert;
        } catch (Exception e) {
            return -1;
        }
    }

    public int nextDigit1() {
        char val = value.charAt(current);
        if (Character.isDigit(val)) {
            int converted = Integer.parseInt(String.valueOf(val));
            return converted;
        }
        return -1;
    }

    public void addToList(int value) {
        digits.add(value);
    }

    public void incrementCurrent() {
        if (this.hasNext()) {
            current++;
        }
    }
}
