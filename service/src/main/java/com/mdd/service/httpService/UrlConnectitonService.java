package com.mdd.service.httpService;

import java.util.Map;

/**
 * Created by madongdong on 2017/8/26.
 */
public interface UrlConnectitonService {
    /**
     * URLconnection  GET
     */
    String sendGet(String urlParam, Map<String, Object> params, String charset);

    /**
     * URLconnection  GET
     */
    String sendPost(String urlParam, Map<String, Object> params, String charset);
}
