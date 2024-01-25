import TypeOfTraining.*;

public class Main {
    public static void main(String[] args) {
        Training[] trainings = {new RunningTraining(96, 45, 65, 10.5),
                                new RunningTraining(80, 32, 90, 3.3),
                                new BoxTraining(102, 90, 105),
                                new CrossfitTraining(120, 30, 40, 11.5)};
        for(Training training : trainings){
            training.printAllInfo();
        }
    }
}