package com.mdd.service.httpService;

import java.util.Map;

/**
 * Created by madongdong on 2017/8/26.
 */
public interface SocketService {

    /**
     * @Description:使用socket发送post请求
     */
    String sendSocketPost(String urlParam, Map<String, Object> params, String charset);

    /**
     * @Description:使用socket发送get请求
     */
    public String sendSocketGet(String urlParam, Map<String, Object> params, String charset);

    /**
     * @Description:使用socket发送get请求  简单版本
     */
    String sendSocketGetSimple(String urlParam, Map<String, Object> params, String charset);
}
