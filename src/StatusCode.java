public enum StatusCode {
    NOT_FOUND(404),
    SUCCES(200),
    FORBIDDEN(403),
    FAILURE(666);

    private int code;

    StatusCode(int code) {
        this.code = code;
    }

    public int getCode(){
        return this.code;
    }
}
