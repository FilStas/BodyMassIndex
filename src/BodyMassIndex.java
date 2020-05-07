public class BodyMassIndex {
    public double parameters(double weight, double height){
        double bodyMass = weight / (height * height);
        return bodyMass;
    }
}
