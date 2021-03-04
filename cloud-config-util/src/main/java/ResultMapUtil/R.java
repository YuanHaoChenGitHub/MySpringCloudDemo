package ResultMapUtil;


import java.io.Serializable;
import java.util.HashMap;

/**
 * @author: gaodeqiang
 * @date 2018年8月15日
 * @version V1.0
 * @Description: 结果集
 */
public class R implements Serializable{

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    private int code;

    private String msg;

    private Object data;



    /**
     * @return the code
     */
    public int getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(int code) {
        this.code = code;
    }

    /**
     * @return the msg
     */
    public String getMsg() {
        return msg;
    }

    /**
     * @param msg the msg to set
     */
    public void setMsg(String msg) {
        this.msg = msg;
    }

    /**
     * @return the data
     */
    public Object getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(Object data) {
        this.data = data;
    }


    public static R ok(String msg) {
        return new R(msg);
    }
    public static R ok(Object data) {
        return new R(ResultEnum.SUCCESS.getCode(),ResultEnum.SUCCESS.getMsg(),data);
    }

    public static  R ok(String msg, Object data) {
        return new R(ResultEnum.SUCCESS.getCode(), msg, data);
    }

    public static  R ok(int code,String msg,Object data) {
        return new R(code, msg, data);
    }

    public static  R ok(int code,String msg) {
        return new R(code, msg);
    }

    public static  R error(String msg) {
        return new R(ResultEnum.ERROR.getCode(),msg);
    }

    public static  R error(String msg,Object data) {
        return new R(ResultEnum.ERROR.getCode(), msg, data);
    }

    public static  R error(int code,String msg) {
        return new R(code, msg);
    }


    public R() {
    }

    private R(Object data) {
        this.code = ResultEnum.SUCCESS.getCode();
        this.msg = ResultEnum.SUCCESS.getMsg();
        this.data = data;
    }

    private R(String msg) {
        this.code = ResultEnum.SUCCESS.getCode();
        this.data = new HashMap<>();
        this.msg = msg;
    }

    private R(int code, String msg) {
        this.code = code;
        this.data = new HashMap<>();
        this.msg = msg;
    }

    private R(int code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }
}