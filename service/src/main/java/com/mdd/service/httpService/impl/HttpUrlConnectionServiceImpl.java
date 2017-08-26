package com.mdd.service.httpService.impl;

import com.mdd.service.httpService.HttpUrlConnectionService;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

/**
 * Created by madongdong on 2017/8/26.
 */
@Service
public class HttpUrlConnectionServiceImpl implements HttpUrlConnectionService {

    public String sendPost(String url, Map<String, Object> params, String charset){
        StringBuffer resultBuffer = null;
        StringBuffer sbParams = new StringBuffer();
        if(params !=null && params.size() >0){
            for(Map.Entry<String,Object> param:params.entrySet()){
                sbParams.append(param.getKey());
                sbParams.append("=");
                sbParams.append(param.getValue());
                sbParams.append("&");
            }
        }
        HttpURLConnection httpURLConnection = null;
        OutputStreamWriter writer = null;
        BufferedReader br = null;
        try{
            URL urlAddress = new URL(url);
            httpURLConnection = (HttpURLConnection) urlAddress.openConnection();
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            if (sbParams != null && sbParams.length() > 0) {
                writer = new OutputStreamWriter(httpURLConnection.getOutputStream(), charset);
                writer.write(sbParams.substring(0, sbParams.length() - 1));
                writer.flush();
            }
            // 读取返回内容
            resultBuffer = new StringBuffer();
            int contentLength = Integer.parseInt(httpURLConnection.getHeaderField("Content-Length"));
            if (contentLength > 0) {
                br = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), charset));
                String temp;
                while ((temp = br.readLine()) != null) {
                    resultBuffer.append(temp);
                }
            }
        }catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    writer = null;
                    throw new RuntimeException(e);
                } finally {
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                        httpURLConnection = null;
                    }
                }
            }

        }
        return resultBuffer.toString();
    }

    /**
     * @Description:使用HttpURLConnection发送get请求
     * @author:liuyc
     * @time:2016年5月17日 下午3:27:29
     */
    public String sendGet(String urlParam, Map<String, Object> params, String charset) {
        StringBuffer resultBuffer = null;
        // 构建请求参数
        StringBuffer sbParams = new StringBuffer();
        if (params != null && params.size() > 0) {
            for (Map.Entry<String, Object> entry : params.entrySet()) {
                sbParams.append(entry.getKey());
                sbParams.append("=");
                sbParams.append(entry.getValue());
                sbParams.append("&");
            }
        }
        HttpURLConnection con = null;
        BufferedReader br = null;
        try {
            URL url = null;
            if (sbParams != null && sbParams.length() > 0) {
                url = new URL(urlParam + "?" + sbParams.substring(0, sbParams.length() - 1));
            } else {
                url = new URL(urlParam);
            }
            con = (HttpURLConnection) url.openConnection();
            con.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            con.connect();
            resultBuffer = new StringBuffer();
            br = new BufferedReader(new InputStreamReader(con.getInputStream(), charset));
            String temp;
            while ((temp = br.readLine()) != null) {
                resultBuffer.append(temp);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    br = null;
                    throw new RuntimeException(e);
                } finally {
                    if (con != null) {
                        con.disconnect();
                        con = null;
                    }
                }
            }
        }
        return resultBuffer.toString();
    }
}
