public class SubClass extends SuperClass {

    SubClass(int d) {
        super(d+35);
    }

    public static void main(String args[]) {
        SubClass s = new SubClass(5);
        s.getD();
    }
}
