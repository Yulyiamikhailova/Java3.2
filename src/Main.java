public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float bmi = service.calculate(54, 2);
        System.out.println("Ваш Bmi= " + bmi);
    }
}