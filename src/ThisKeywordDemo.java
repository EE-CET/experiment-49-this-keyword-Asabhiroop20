import java.util.Scanner;

class ThisDemo {
    int value;

    void setValue(int value) {
        this.value = value; // distinguish using this
    }

    void display() {
        System.out.print("Value: " + value);
    }
}

public class ThisKeywordDemo {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int val = Integer.parseInt(sc.nextLine());

        ThisDemo obj = new ThisDemo();
        obj.setValue(val);
        obj.display();
    }
}

