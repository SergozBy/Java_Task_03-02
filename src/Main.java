public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height = 1.87; // рост в метрах
        int mass = 98;
        int bmi = service.calculate(height, mass); // должно получиться 28
        System.out.println("bmi = " + bmi);
    }
}