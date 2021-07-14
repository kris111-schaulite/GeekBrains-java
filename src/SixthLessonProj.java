public class SixthLessonProj {
    public static void main(String[] args) {
        SixthLessonProjCat cat = new SixthLessonProjCat(200);
        SixthLessonProjDog dog = new SixthLessonProjDog(500, 10);

        cat.runOn(250);
        cat.swimOn(5);

        dog.runOn(550);
        dog.swimOn(9);
    }
}
