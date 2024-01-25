package TypeOfTraining;

public class BoxTraining extends Training {
    public BoxTraining(int averageHeartRate, int trainingDuration, double athleteWeight) {
        super(averageHeartRate, trainingDuration, athleteWeight);
    }

    @Override
    public void printAllInfo() {
        System.out.printf("Тренировка по кикбоксингу! Длительность : %d минут. Килокалорий : %.2f\n", getTrainingDuration(), calculateCaloricExpenditure());
    }
}
