public class App {
    public static void main(String[] args) {
        User websiteUser = new User.Builder("Ryan", "rjseymour@yahoo.com")
                .firstName("Ryan")
                .lastName("Seymour")
                .build();

        System.out.println(websiteUser);
    }
}
