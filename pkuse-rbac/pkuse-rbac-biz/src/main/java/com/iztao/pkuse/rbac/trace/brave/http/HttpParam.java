package com.iztao.pkuse.rbac.trace.brave.http;

import lombok.Data;
import lombok.ToString;

import java.util.Map;

/**
 * Package: me.j360.dubbo.trace.brave.http
 * User: min_xu
 * Date: 2017/4/27 下午10:23
 * 说明：
 */
@Data
@ToString
public class HttpParam {

    private Map<String,String> param;

    public Map<String, String> getParam() {
        return param;
    }

    public void setParam(Map<String, String> param) {
        this.param = param;
    }
}
