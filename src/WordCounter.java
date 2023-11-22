public class WordCounter {
    public static void analyzeText(String text, String[] words) {
        if (text == null || words == null || words.length == 0) {
            System.out.println("Помилкові вхідні дані");
            return;
        }

        String[] sentences = text.split("\\.");

        int[] sentencesNum = new int[words.length];

        for (String s : sentences) {
            for (int j = 0; j < words.length; j++) {
                if (s.contains(words[j])) {
                    sentencesNum[j]++;
                }
            }
        }

        System.out.println("Результати аналізу:");
        for (int i = 0; i < words.length; i++) {

            String sentence;

            if (sentencesNum[i] % 10 == 1 && sentencesNum[i] != 11){
                sentence = "реченні";
            } else if (sentencesNum[i] == 0) {
                sentence = "речень";
            } else {
                sentence = "реченнях";
            }

            System.out.println("Слово '" + words[i] + " зустрічається в " + sentencesNum[i] + " " + sentence);
        }
    }
}