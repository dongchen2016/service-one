package com.mdd.service.httpService;

import java.net.URL;
import java.util.Map;

/**
 * Created by madongdong on 2017/8/26.
 */
public interface HttpUrlConnectionService {

    /**
     * GET
     */
    String sendGet(String urlParam, Map<String, Object> params, String charset);

    /**
     * POST
     */
    String sendPost(String url, Map<String, Object> params, String charset);

}
