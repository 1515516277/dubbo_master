package com.ming.until;

import java.util.HashMap;
import java.util.Map;

public class ResultMsg {
    private int code;
    private Object msg;

    private Map<String, Object> extend=new HashMap<String, Object>();

    public ResultMsg add(String key,Object value) {
        this.getExtend().put(key, value);
        return this;
    }
    public static Msg success() {
        Msg msg=new Msg();
        msg.setCode(100);
        msg.setName("成功");
        return msg;
    }

    public static Msg fail() {
        Msg msg=new Msg();
        msg.setCode(200);
        msg.setName("失败");
        return msg;
    }
    public Map<String, Object> getExtend() {
        return extend;
    }

    public void setExtend(Map<String, Object> extend) {
        this.extend = extend;
    }

    public int getCode() {
        return code;

    }

    public void setCode(int code) {
        this.code = code;
    }

    public Object getMsg() {
        return msg;
    }

    public void setMsg(Object msg) {
        this.msg = msg;
    }


}
