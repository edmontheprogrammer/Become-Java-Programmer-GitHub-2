public class Main {

    public static void main(String[] args) {

        String s = null;
        try {
            var sub = s.substring(1);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println("I'm not dead yet!");
    }
}
