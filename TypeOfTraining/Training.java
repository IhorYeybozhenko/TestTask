package TypeOfTraining;

public abstract class Training {
    private int averageHeartRate;
    private int trainingDuration;
    private double athleteWeight;
    private double caloricExpenditure;

    public Training(int averageHeartRate, int trainingDuration, double athleteWeight){
        this.averageHeartRate = averageHeartRate;
        this.trainingDuration = trainingDuration;
        this.athleteWeight = athleteWeight;
    }

    public double calculateCaloricExpenditure(){
        caloricExpenditure = 0.014 * athleteWeight * trainingDuration * (0.12 * averageHeartRate - 7);
        return caloricExpenditure;
    }

    public abstract void printAllInfo();

    public int getTrainingDuration() {
        return trainingDuration;
    }
}
