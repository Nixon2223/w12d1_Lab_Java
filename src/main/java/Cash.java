public class Cash {
    public enum Money {
        NOTE5(500),
        NOTE10(1000);

        private final int value;

        Money(int value) {
            this.value = value;
    }

}
