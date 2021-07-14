public class SixthLessonProjCat extends SixthLessonProjAnimal {
        public SixthLessonProjCat(float maxRunDistance) {
            super(maxRunDistance, Integer.MIN_VALUE);
        }

        @Override
        public void swimOn(float requiredDistance)
        {
            System.out.println("Кошки плавать не умеют!\n");
        }
}

