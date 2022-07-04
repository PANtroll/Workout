package Workout;

import java.time.LocalDate;
import java.util.Scanner;

public class BasicAplication {

    public void main() {
        Scanner s = new Scanner(System.in);
        LocalDate date = LocalDate.now();
        System.out.println("Nazwa ćwiczenia");
        String name = s.nextLine();
        System.out.println("Liczba serii");
        Integer series = s.nextInt();
        Integer[] repeats = new Integer[series];
        for (int i = 0; i < series; i++) {
            System.out.print("Seria " + (i + 1) + ":");
            repeats[i] = s.nextInt();
        }
        System.out.println("Opis");
        String desc = s.nextLine();//todo opis przed toStringiem
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        DoneExercise exe = new DoneExercise(date, name, series, repeats, desc);
        System.out.println(exe);//todo zapis do pliku
    }


    private void addExercises() {
        MainExercises m1 = new MainExercises("Pompki");
        m1.addExercise(new Exercise("Pompki przy ścianie", 3, 50), 0);
        m1.addExercise(new Exercise("Pompki pochylone", 3, 40), 1);
        m1.addExercise(new Exercise("Pompki na kolanach", 3, 30), 2);
        m1.addExercise(new Exercise("Polpompki", 2, 25), 3);
        m1.addExercise(new Exercise("Pompki pelne", 2, 20), 4);
        m1.addExercise(new Exercise("Pompki wazkie", 2, 20), 5);
        m1.addExercise(new Exercise("Pompki nierowne", 2, 20), 6);
        m1.addExercise(new Exercise("Pompki na jednej rece", 2, 20), 7);
        m1.addExercise(new Exercise("Pompki pz dzwignia", 2, 20), 8);
        m1.addExercise(new Exercise("Pompki na jednej rece", 1, 100), 9);

        MainExercises m2 = new MainExercises("Mostki");
        m2.addExercise(new Exercise("Mostek krótki", 3, 50), 0);
        m2.addExercise(new Exercise("Mostek prosty", 3, 40), 1);
        m2.addExercise(new Exercise("Mostek zgiety", 3, 30), 2);
        m2.addExercise(new Exercise("Mostek na glowie", 2, 25), 3);
        m2.addExercise(new Exercise("Polmostek", 2, 20), 4);
        m2.addExercise(new Exercise("Mostek pelny", 2, 15), 5);
        m2.addExercise(new Exercise("Schodzenie po scianie", 2, 10), 6);
        m2.addExercise(new Exercise("Wchodzenie po scianie", 2, 8), 7);
        m2.addExercise(new Exercise("Opuszcznie mostu", 2, 6), 8);
        m2.addExercise(new Exercise("Most zwodzony", 2, 20), 9);

        MainExercises m3 = new MainExercises("Podciągnięcia");
        m3.addExercise(new Exercise("Podciągnięcia do pionu", 3, 40), 0);
        m3.addExercise(new Exercise("Podciągnięcia do poziomu", 3, 30), 1);
        m3.addExercise(new Exercise("Podciągnięcia scyzorykowe", 3, 20), 2);
        m3.addExercise(new Exercise("Polpdciągnięcia", 2, 15), 3);
        m3.addExercise(new Exercise("Podciągnięcia pelne", 2, 10), 4);
        m3.addExercise(new Exercise("Podciągnięcia wazkie", 2, 10), 5);
        m3.addExercise(new Exercise("Podciągnięcia nierowne", 2, 9), 6);
        m3.addExercise(new Exercise("Polpodciągnięcia na jednej rece", 2, 8), 7);
        m3.addExercise(new Exercise("Podciągnięcia z asysta", 2, 7), 8);
        m3.addExercise(new Exercise("Podciągnięcia na jednej rece", 2, 6), 9);

        MainExercises m4 = new MainExercises("Wznosy nóg");
        m4.addExercise(new Exercise("Podwijanie kolan", 3, 40), 0);
        m4.addExercise(new Exercise("Wznosy kolan na lezaco", 3, 35), 1);
        m4.addExercise(new Exercise("Wznosy zgietych nog na lezaco", 3, 30), 2);
        m4.addExercise(new Exercise("Zabki na leżąco", 3, 25), 3);
        m4.addExercise(new Exercise("Wznosy prostych nóg na lezaco", 2, 20), 4);
        m4.addExercise(new Exercise("Wznosy kolan w zwisie", 2, 15), 5);
        m4.addExercise(new Exercise("Wznosy zgietych nog w zwisie", 2, 15), 6);
        m4.addExercise(new Exercise("Zabki w zwisie", 2, 15), 7);
        m4.addExercise(new Exercise("Czesciowe wznosy prostych nóg w zwisie", 2, 15), 8);
        m4.addExercise(new Exercise("Wznosy prostyc nóg w zwisie", 2, 40), 9);

        MainExercises m5 = new MainExercises("Przysiady");
        m5.addExercise(new Exercise("Przysiady w staniu na barkach", 3, 50), 0);
        m5.addExercise(new Exercise("Przysiady scyzorykowe", 3, 40), 1);
        m5.addExercise(new Exercise("Przysiady wspomagane", 3, 30), 2);
        m5.addExercise(new Exercise("Polprzysiady", 2, 50), 3);
        m5.addExercise(new Exercise("Przysiady pelne", 2, 30), 4);
        m5.addExercise(new Exercise("Przysiady wazkie", 2, 20), 5);
        m5.addExercise(new Exercise("Przysiady nierowne", 2, 20), 6);
        m5.addExercise(new Exercise("Polrzysiady na jednej nodze", 2, 20), 7);
        m5.addExercise(new Exercise("Przysiady na jednej nodze z asysta", 2, 20), 8);
        m5.addExercise(new Exercise("Przysiady na jednej nodze", 2, 50), 9);

        MainExercises m6 = new MainExercises("Pompki w staniu na rękach");
        m6.addExercise(new Exercise("Stanie na glowie przy scianie", 1, 120), 0);
        m6.addExercise(new Exercise("kruk", 1, 60), 1);
        m6.addExercise(new Exercise("Stanie na rekach przy scianie", 1, 120), 2);
        m6.addExercise(new Exercise("Polpompki w staniu na rekach", 2, 20), 3);
        m6.addExercise(new Exercise("Pompki w staniu na rekach", 2, 15), 4);
        m6.addExercise(new Exercise("Pompki wzskie w staniu na rekach", 2, 12), 5);
        m6.addExercise(new Exercise("Pompki nierowne w staniu na rekach", 2, 10), 6);
        m6.addExercise(new Exercise("Polpompki w staniu na jednej rece", 2, 8), 7);
        m6.addExercise(new Exercise("Pompki z dzwignia na jednej rece", 2, 6), 8);
        m6.addExercise(new Exercise("Pompki na jednej rece", 2, 5), 9);

    }
}
