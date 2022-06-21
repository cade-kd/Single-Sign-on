package cool.cade.common.constant;

public enum StatusCodeEnum {


    SUCCESS(200, "success"),
    INTERNAL_ERROR(500, "server internal error");

    private int code;
    private String msg;

    StatusCodeEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}