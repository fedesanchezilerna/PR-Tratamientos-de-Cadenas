import excercises.*;
import utils.Menu;
import utils.ScannerUtils;

public class Main {

    static int exercise;
    static boolean resume;

    public static void main(String[] args) {
        exerciseSelector();
        ScannerUtils.closeScanner();
    }

    private static void exerciseSelector() {
        do {
            Menu.mainMenu();

            exercise = ScannerUtils.readInt();
            if (exercise == 0) {
                System.out.println("Closing application.");
                resume = false;
                break;
            } else {
                runExercise(exercise);
                runEndMenu();
            }
        } while (resume);
    }

    private static void runExercise(int exerciseNum) {
        switch (exerciseNum) {
            case 1:
                runExerciseMsg(exerciseNum);
                Exercise1.textLength();
                break;
            case 2:
                runExerciseMsg(exerciseNum);
                Exercise2.crumbleText();
                break;
            case 3:
                runExerciseMsg(exerciseNum);
                Exercise3.textInverter();
                break;
            case 4:
                runExerciseMsg(exerciseNum);
                Exercise4.removeSpaces();
                break;
            case 5:
                runExerciseMsg(exerciseNum);
                Exercise5.vocalsCounter();
                break;
            case 6:
                runExerciseMsg(exerciseNum);
                Exercise6.textDividing();
                break;
            case 7:
                runExerciseMsg(exerciseNum);
                break;
            case 8:
                runExerciseMsg(exerciseNum);
                break;
            case 9:
                runExerciseMsg(exerciseNum);
                break;
            case 10:
                runExerciseMsg(exerciseNum);
                break;
            case 11:
                runExerciseMsg(exerciseNum);
                break;
            case 12:
                runExerciseMsg(exerciseNum);
                break;
            case 13:
                runExerciseMsg(exerciseNum);
                break;
            case 14:
                runExerciseMsg(exerciseNum);
                break;
            case 15:
                runExerciseMsg(exerciseNum);
                break;
            default:
                System.out.println("Undefined exercise.");
                break;
        }
    }

    private static void runExerciseMsg(int exercise) {
        System.out.println("Running exercise " + exercise + "...");
    }

    private static void runEndMenu() {
        Menu.endExerciseMenu();
        int option = ScannerUtils.readInt();
        switch (option) {
            case 0:
                System.out.println("Closing application...");
                resume = false;
                break;
            case 1:
                resume = true;
                break;
            default:
                System.out.println("Returning to the main menu");
        }
    }
}