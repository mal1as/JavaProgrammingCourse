public enum TimeOfDay {
    MORNING("Утро"),
    AFTERNOON("День"),
    EVENING("Вечер"),
    NIGHT("Ночь");
    private String russian;

    TimeOfDay(String russian) {
        this.russian = russian;
    }

    String getRussian() {
        return russian;
    }

    void describe(String des) {
        System.out.println("Время: " + des + " " + russian);
    }

    void beautifulDescription(String description, String... addPhrases) {
        //локальный класс
        class Speaker {
            private String[] beautifulPhrases = {"необычайно красиво", "прекрасно", "великолепно"};

            private void addPhrase(String phrase) {
                String[] newBeautifulPhrases = new String[beautifulPhrases.length + 1];
                System.arraycopy(beautifulPhrases, 0, newBeautifulPhrases, 0, beautifulPhrases.length);
                newBeautifulPhrases[beautifulPhrases.length] = phrase;
                beautifulPhrases = newBeautifulPhrases;
            }

            //выводим в конце рандомное красивое описание случившегося
            private void speak(String phrase) {
                System.out.println(phrase + ": это было " + beautifulPhrases[(int) Math.floor(Math.random() * beautifulPhrases.length)]);
            }
        }
        Speaker speaker = new Speaker();
        for(String phrase:addPhrases){
            speaker.addPhrase(phrase);
        }
        speaker.speak(description);
    }
}
