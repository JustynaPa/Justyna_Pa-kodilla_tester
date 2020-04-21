public class LeapYear {

    public static void main(String[] args) {
    }

    int rok;
    boolean isLeapYear;

    public LeapYear(int rok) {
        this.rok = rok;
    }

    public static boolean isLeapYear(int rok) {
        return ((rok % 4 == 0) && (rok % 100 != 0) || (rok % 400 == 0));
    }

    public void checkRok() {
        if (isLeapYear(rok)) {
            System.out.println("This year is leap.");
        } else {
            System.out.println("This year is not leap.");
        }
    }
}

    

