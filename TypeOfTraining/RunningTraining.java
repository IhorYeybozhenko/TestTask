package TypeOfTraining;

public class RunningTraining extends Training {
    private double distance;

    public RunningTraining(int averageHeartRate, int trainingDuration, double athleteWeight, double distance){
        super(averageHeartRate, trainingDuration, athleteWeight);
        this.distance = distance;
    }

    @Override
    public void printAllInfo(){
        System.out.printf("Беговая тренировка! Длительность : %d минут. Дистанция : %.1f км. Килокалорий : %.2f\n", getTrainingDuration(), distance, calculateCaloricExpenditure());
    }
}
