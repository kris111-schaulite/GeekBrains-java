public class FifthLessonProjEmployee {
    String fullName;
    String position;
    String email;
    String phoneNumber;
    float salary;
    int age;

    FifthLessonProjEmployee(String fullName,
             String position,
             String email,
             String phoneNumber,
             float salary,
             int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    void printInfo() {
        System.out.println("Петров Игорь Витальевич: " + fullName);
        System.out.println("Заместитель директора: " + position);
        System.out.println("petrovigirzam@gmail.com: " + email);
        System.out.println("+7 911 456 78 37: " + phoneNumber);
        System.out.println("120 000: " + salary);
        System.out.println("35: " + age);
    }

}










//1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.