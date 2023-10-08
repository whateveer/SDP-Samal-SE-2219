public class EducationalApp {
    public static void main(String[] args) {
        String contentType = "Flashcard";
        ContentFactory contentFactory = null;

        switch (contentType) {
            case "Quiz" -> contentFactory = new QuizFactory();
            case "Flashcard" -> contentFactory = new FlashcardFactory();
            case "Lesson" -> contentFactory = new LessonFactory();
            case "Exercise" -> contentFactory = new ExerciseFactory();
            default -> {
                System.out.println("Invalid content type selection.");
            }
        }
        Content content = contentFactory.createContent();
        content.display();
    }
}
