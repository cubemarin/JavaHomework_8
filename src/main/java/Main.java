public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.birthday = new FormDate();
        post.birthday.day = 13;
        post.birthday.month = 6;
        post.birthday.year = 1999;

        post.name = "Иван";
        post.passport = "4444 № 44444444";
        post.patronymic = "Иванович";
        post.phone = "+7 (999)-999-99-99";
        post.surname = "Иванов";
        post.subscription = true;

        System.out.println("birthday:");
        System.out.println("day: " + post.birthday.day);
        System.out.println("month: " + post.birthday.month);
        System.out.println("year: " + post.birthday.year);

        System.out.println();
        System.out.println("name: " + post.name);
        System.out.println("passport: " + post.passport);
        System.out.println("patronymic: " + post.patronymic);
        System.out.println("phone: " + post.phone);
        System.out.println("surname: " + post.surname);
        System.out.println("subscription: " + post.subscription);
    }
}