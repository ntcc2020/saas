package com.ntcc.saascommon.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.ntcc.saascommon.util.JsonBinder;

import java.io.Serializable;

/**
 * ModelJsonResult
 * api接口，返回给客户端的json封装类
 *
 * @author zhongwenhao
 * @date 2020/3/2
 */

@JsonInclude(value = JsonInclude.Include.NON_NULL)
public class ModelJsonResult implements Serializable {
    //
    public static final int CODE_SUCCESS = 1;

    //
    public static final int CODE_ERROR = 0;

    //
    public static final int CODE_ERROR_APP_DENY = -1;
    public static final int CODE_ERROR_AUTH_DENY = -2;
    public static final int CODE_ERROR_IP_DENY = -3;
    public static final int CODE_ERROR_PERMISSION_DENY = -4;

    //
    public static final int CODE_ERROR_WRONG_REQUEST = -5;
    public static final int CODE_ERROR_WRONG_PARAM = -6;

    //the attributes of the result object.
    private int code = ModelJsonResult.CODE_ERROR;

    //static Json Result
    public static final ModelJsonResult RESULT_ERROR_APP_DENY = new ModelJsonResult(CODE_ERROR_APP_DENY, 0, "Application is denied.");
    public static final ModelJsonResult RESULT_ERROR_AUTH_DENY = new ModelJsonResult(CODE_ERROR_AUTH_DENY, 0, "Auth is denied.");
    public static final ModelJsonResult RESULT_ERROR_IP_DENY = new ModelJsonResult(CODE_ERROR_IP_DENY, 0, "IP is denied.");
    public static final ModelJsonResult RESULT_ERROR_PERMISSION_DENY = new ModelJsonResult(CODE_ERROR_PERMISSION_DENY, 0, "Permission is denied.");

    public static final ModelJsonResult RESULT_ERROR_WRONG_REQUEST = new ModelJsonResult(CODE_ERROR_WRONG_REQUEST, 0, "Request is wrong.");
    public static final ModelJsonResult RESULT_ERROR_WRONG_PARAM = new ModelJsonResult(CODE_ERROR_WRONG_PARAM, 0, "Requested param is wrong.");

    //
    private int ID = 0;
    private String desc = null;

    //the object.
    private Object result = null;

    //
    public ModelJsonResult() {
        this.code = CODE_SUCCESS;

        //
        this.ID = 0;
        this.desc = "success";
    }

    public ModelJsonResult(int code) {
        this.code = code;
    }

    public ModelJsonResult(int code, int ID, String desc) {
        this.code = code;

        this.ID = ID;
        this.desc = desc;
    }

    public ModelJsonResult(int code, int ID, String desc, Object result) {
        this.code = code;

        this.ID = ID;
        this.desc = desc;

        this.result = result;
    }

    //
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Object getResult() {
        return result;
    }

    public <T> T getResult(Class<T> clazz) {
        if (result != null) {
            return JsonBinder.buildNonEmptyBinder().fromJson(JsonBinder.buildNonEmptyBinder().toJson(result), clazz);
        }

        return null;
    }

    public void setResult(Object result) {
        this.result = result;
    }

    //
    public static ModelJsonResult fromJson(String jsonValue) throws JsonParseException, JsonMappingException {
        return JsonBinder.buildNonEmptyBinder().fromJson(jsonValue, ModelJsonResult.class);
    }

    public String toJson() {
        return JsonBinder.buildNonNullBinder().toJson(this);
    }
}
