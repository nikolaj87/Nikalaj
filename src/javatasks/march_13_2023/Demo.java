package javatasks.march_13_2023;

public class Demo {
    public static void main(String[] args) {

        User user1 = User.userCreate("Nikalay","rus", "Poland");
        user1.addVideoToUserList("more about cats");

        User user2 = User.userCreate("Victor","esp", "Spain");
        user2.addVideoToUserList("funny");
        user2.addVideoToUserList("scary");
        user2.removeVideoFromUserList("scary");

        System.out.println(user1);
        System.out.println(user2);

    }
}
