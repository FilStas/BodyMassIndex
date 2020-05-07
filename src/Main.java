

public class Main {
    public static void main(String[] args) {
        BodyMassIndex bodyMassIndex = new BodyMassIndex();

        double heightInMeters = 1.76;

        double weightInKilograms = 80.5;


        double indexMass = bodyMassIndex.parameters(weightInKilograms,heightInMeters);
        System.out.println("Ваша ИМТ: " + indexMass);



    }
}
