package TypeOfTraining;

public class CrossfitTraining extends Training {
    private double averageProjectileWeight;

    public CrossfitTraining(int averageHeartRate, int trainingDuration, double athleteWeight, double averageProjectileWeight) {
        super(averageHeartRate, trainingDuration, athleteWeight);
        this.averageProjectileWeight = averageProjectileWeight;
    }

    @Override
    public void printAllInfo() {
        System.out.printf("Кроссфит тренировка! Длительность : %d минут. Средний вес снаряда : %.2f км. Килокалорий : %.2f\n", getTrainingDuration(), averageProjectileWeight, calculateCaloricExpenditure());
    }
}
