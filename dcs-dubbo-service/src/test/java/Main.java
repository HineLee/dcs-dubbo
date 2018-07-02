public class Main {
    public static void main(String[] args) {
        for (Status status: Status.values()
             ) {
            System.out.println(status.ordinal());
            System.out.println(status.name());
        }
    }
}
