public class StringUtils {
    static String cleanWord(String word) {
        String[][] wordSwipe = {
                {"é", "e"},
                {"è", "e"},
                {"ê", "e"},
                {"á", "a"},
                {"à", "a"},
                {"ã", "a"},
                {"â", "a"},
                {"í", "i"},
                {"ì", "i"},
                {"î", "i"},
                {"ó", "o"},
                {"ò", "o"},
                {"õ", "o"},
                {"ô", "o"},
                {"ú", "u"},
                {"ù", "u"},
                {"û", "u"},
                {"ç", "c"},
                {",", ""},
                {"\\.", ""},
                {"'", ""},
                {"\"", ""},
        };
        word = word.toLowerCase().trim();
        for (String[] swipe : wordSwipe) {
            word = word.replaceAll(swipe[0], swipe[1]);
        }
        return word;
    }
}
