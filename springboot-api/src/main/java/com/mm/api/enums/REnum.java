package com.mm.api.enums;

public enum REnum {

    UNKONW_ERROR(-1, "未知错误"),
    SUCCESS(0, "成功"),
    UNDER_EIGHTEEN(1, "未成年人");

    private Integer code;

    private String msg;

    REnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
