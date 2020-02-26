package ua.kpi.tef;

public class TestBean {
    private String sentence;

    public TestBean(String sentence) {
        this.sentence = sentence;
    }

    public String getSentence() {
        return sentence;
    }

    public void setSentence(String sentence) {
        this.sentence = sentence;
    }
}