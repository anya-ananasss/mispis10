import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Faculty faculty = new Faculty("Факультет Компьютерных Наук");

        Institute institute = new Institute("ПиВиCgit init\n", "г. Воронеж, Университетская, 1");


        faculty.setInstitutes(new Institute[]{institute});

        ResearchAssociate employee1 = new ResearchAssociate(1, "Косенко И. М.",
                "КГиГ");

        ResearchAssociate employee2 = new ResearchAssociate(2, "Соломатин Д. С.",
                "ВВП");
        institute.setEmployees(new ResearchAssociate[]{employee1, employee2});


        Institute pivis = faculty.getInstitutes()[0];
        ResearchAssociate[] employees = pivis.getEmployees();

        System.out.println(faculty.getName());
        System.out.println("Кафедра: " + institute.getName() + " (" + institute.getAddress() + ")");
        System.out.println("Сотрудники: ");
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].getSsNo()+". "+employees[i].getName()+", "+employees[i].getFieldOfStudy());
        }

    }
}