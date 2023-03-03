import java.util.Random;

public class Main {
    public static void main(String[] args) {
        goOut(15, 15);
        goOut(9, 12);
        goOut(21, 25);
        goOut(46, -21);
        goOut(45, -10);
        goOut(23,10);// заданный возраст.
        goOut(generateRandomAge(),10);
    }

    public static void goOut(int age, int temperature) {
        if (age >= 20 && age <= 45 && temperature >= -20 && temperature <= 30) {
            System.out.println("Можно идти гулять");
        } else if (age < 20 && temperature >= 0 && temperature <= 28) {
            System.out.println("Можно идти гулять");
        } else if (age > 45 && temperature >= -10 && temperature <= 25) {
            System.out.println("Можно идти гулять");
        } else {
            System.out.println("Оcтавайтесь дома");
        }
    }
    public static int generateRandomAge() {
        int minAge = 1;
        int maxAge = 100;
        Random random = new Random();
        return random.nextInt(maxAge - minAge + 1) + minAge;
    }

}