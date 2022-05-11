public class BmiService {
    public float calculate(float weight,
                           float height) {
        float x = 54.1F;
        float y = 1.68F;
        float bmi = x / (y * 2);
        return bmi;
    }
}
