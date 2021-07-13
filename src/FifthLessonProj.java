public class FifthLessonProj {
    public static void main(String[] args) {
        FifthLessonProjEmployee[] employees = {
                new FifthLessonProjEmployee(
                        "Петров Игорь Витальевич",
                        "Заместитель директора",
                        "petrovigirzam@gmail.com",
                        "+7 911 456 78 37",
                        120000,
                        35),
                new FifthLessonProjEmployee(
                        "Иванов Иван Петрович",
                        "Директор",
                        "dirIvanov@mail.com",
                        "+7-900-987-00-00",
                        200000,
                        51),
                new FifthLessonProjEmployee(
                        "Сидоров Петр Петрович",
                        "Менеджер",
                        "sidorovManager@mail.ru",
                        "+7-921-983-09-01",
                        100000,
                        32),
                new FifthLessonProjEmployee(
                        "Самсонова Людмила Алексеевна",
                        "Бухгалтер",
                        "samsonovaBugaga@mail.ru",
                        "+7-971-857-00-95",
                        170000,
                        55),
                new FifthLessonProjEmployee(
                        "Кислицин Семен Аркадьевич",
                        "Младший бухгалтер",
                        "kisel@mail.ru",
                        "+7-900-776-54-11",
                        80000,
                        28)
        };

        int minAge = 40;
        for (FifthLessonProjEmployee employee : employees) {
            if (employee.age > minAge) {
                employee.printInfo();
                System.out.println();
            }
        }
    }
}
