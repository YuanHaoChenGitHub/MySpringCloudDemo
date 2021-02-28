package ResultMapUtil;

public enum ResultEnum {
    SUCCESS("200", "操作成功"),
    ERROR("500", "操作失败");


    private String code;

    private String msg;

    ResultEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return Integer.parseInt(code);
    }

    public String getMsg() {
        return msg;
    }


}
