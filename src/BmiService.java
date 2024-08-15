public class BmiService {
    public int calculate (double height, int mass) {
        return (int) (mass / (height *  height));
    }
}
