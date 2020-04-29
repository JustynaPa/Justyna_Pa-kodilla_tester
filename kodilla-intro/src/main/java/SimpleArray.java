public class SimpleArray {
    public static void main(String[] args) {
        String[] friends = new String[5];

        friends[0] = "Marzena";
        friends[1] = "Agata";
        friends[2] = "Ola";
        friends[3] = "Ania";
        friends[4] = "Iryna";

        String friend = friends[3];
        System.out.println(friend);

        int numberOfElements = friends.length;
        System.out.println(friends.length);
        System.out.println("Moja tablica zawiera" + " " + friends.length + " " + "elementów");

    }
}
