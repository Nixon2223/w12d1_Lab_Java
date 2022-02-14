public enum Cash implements IPay {
    NOTE5(500),
    NOTE10(1000);

    private final int value;

    Cash(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
