package bridge;

public enum Validation {
    NUMERIC("[0-9]+"),
    THREE_TO_TWENTY("^[3-9]{1}$|^1{1}[0-9]{1}$|^20$");

    private final String value;

    Validation(String value) {
        this.value = value;
    }

    public boolean isValid(String target){
        return target.matches(this.value);
    }
}