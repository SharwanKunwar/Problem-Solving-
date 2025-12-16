package Practice;

public class Code06 {
    static void main(String[] args) {
        Time t1 = new Time(4,55,4);
        Time t2 = new Time(4,55,4);

        Time hold = t1.addTime(t2);
        hold.displayTime();
    }
}
