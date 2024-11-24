class Num {
    int number;

    Num(int number) {
        this.number = number;
    }
    void shownum() {
        System.out.println("Number in decimal: " + number);
    }
}
class HexNum extends Num {
    HexNum(int number) {
        super(number);
    }
    @Override
    void shownum() {
        super.shownum();
        System.out.println("Number in hexadecimal: " + Integer.toHexString(number).toUpperCase());
        System.out.println("Number in octal: " + Integer.toOctalString(number));
    }
}

public class Question11 {
    public static void main(String[] args) {
        Num numObj = new Num(42); 
        System.out.println("Output from base class Num:");
        numObj.shownum(); 
        System.out.println();

        HexNum hexNumObj = new HexNum(42); 
        System.out.println("Output from derived class HexNum:");
        hexNumObj.shownum();
    }
}
