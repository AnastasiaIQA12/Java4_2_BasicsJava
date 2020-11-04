public class BmiService {
    public float calculate(int WeightInKg, int HeightInSm) {
        float height = (float) HeightInSm / 100;
        float BodyMassIndex = (float) WeightInKg / (height * height);
        return BodyMassIndex;
    }
}
