public class MatchesTest {
    public static void main(String[] args) {
        System.out.print("1223,121".matches("([0-9]{1,20},)*([0-9]{1,20}){1}"));
    }
}
