package com.mdd.service.httpService;

import java.util.Map;

/**
 * Created by madongdong on 2017/8/26.
 */
public interface HttpClientService {

    /**
     * @Description:使用HttpClient发送get请求
     */
    String httpClientGet(String urlParam, Map<String, Object> params, String charset);

    /**
     * @Description:使用HttpClient发送post请求
     * @author:liuyc
     * @time:2016年5月17日 下午3:28:23
     */
    String httpClientPost(String urlParam, Map<String, Object> params, String charset);
}
