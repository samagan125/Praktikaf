import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Box<Integer> integerBox = Box.array(12);
        System.out.println(integerBox.getBox());
        Box<String> stringBox = Box.array("Bilal");
        System.out.println(stringBox.getBox());
    }
}

