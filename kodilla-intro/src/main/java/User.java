public class User {

    String name;
    int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public static void main(String[] args) {

        User beata = new User("Beata", 17);
        User krzysztof = new User("Krzysztof", 26);
        User milena = new User("Milena", 31);
        User bartek = new User("Bartek", 27);
        User milosz = new User("Miłosz", 21);
        User adam = new User("Adam", 33);

        User[] users = {beata, krzysztof, milena, bartek, milosz, adam};

        int [] ages = {17, 26, 31, 27, 21, 33};
        float sum = 0;
        for (int i = 0; i < users.length; i++) {
            sum += ages[i];
        }
        sum /= users.length;
        System.out.println(sum);

        for (int i = 1; i < users.length; i++) {
            if ( > sum) {
                System.out.println();
            } else {
                System.out.println();
            }
        }



    }
}