import dalvik.annotation.TestTarget;
import org.example.lesson3.Director;
import org.example.lesson3.Employee;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Lesson3Test {
    Employee[] hornsAndHooves;
    @BeforeEach
    void init(){
        Employee andrey = new Employee("Andrey","Serov",
                "Igorevich","Electric","8-985-664-52-63",
                50000,46);
        Employee oleg = new Employee("Oleg","Ivanov",
                "Sergeevich","Teacher","8-985-664-85-63",
                70000,40);
        Employee irina = new Employee("Irina","Tarelkina",
                "Sergeevna","Cleaner","8-985-664-52-79",
                40000,50);
        Director alesha = new Director("Alesha","Gromov",
                "Alekseevich","Director","8-985-777-77-77",
                500000,25);
        Employee grisha = new Employee("Grisha","Ershov",
                "Nikolaevich","Manager","8-985-664-52-63",
                150000,43);

         hornsAndHooves = new Employee[5];
        hornsAndHooves[0] = andrey;
        hornsAndHooves[1] = oleg;
        hornsAndHooves[2] = irina;
        hornsAndHooves[3] = alesha;
        hornsAndHooves[4] = grisha;
    }
    @Test
    void checkIncreaseSalaryDirectorTest(){
Director.increaseSalary(hornsAndHooves,100000,20);
        assertThat(hornsAndHooves[3].getSalary()).isEqualTo(500000);

    }
    @Test
    void checkIncreaseSalaryNoDirectorTest(){
        Director.increaseSalary(hornsAndHooves,100000,20);
        assertThat(hornsAndHooves[0].getSalary()).isEqualTo(150000);

    }
}
