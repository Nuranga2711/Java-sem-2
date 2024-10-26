public class TestTime {
    public static void main(String[] args) {
        Time T1 = new Time();
        System.out.println(T1);

        Time T2 = new Time(59, 59, 0);
        // System.out.println(T2.nextSecond());
        
        T2.setSecond(60);
        System.out.println(T2);

        System.out.println(T2.toString());
       
        System.out.println(T1);

        Time T3 = new Time(59, 59, 23);
        System.out.println(T3.nextSecond());
    }
}
