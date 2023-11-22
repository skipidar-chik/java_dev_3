public class Main {
    public static void main(String[] args) {
        String text = "На вулиці осінь. Золота осінь принесла з собою багато кольорів. " +
                "Ці кольори осені чудові та різнобарвні. Я люблю гуляти в осінньому парку, " +
                "парк і яскраві осінні кольори.";
        String[] words = {"осінь", "золото", "кольори", "парк"};
        WordCounter.analyzeText(text, words);
    }
}