public class ArgExample {
    public static void main (String[] s){
        Runnable r = () -> System.out.println("HI");
        new Thread(r).start();

    }

}
