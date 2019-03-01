package com.runningsss.cloud;

import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

/**
 * @author liqings
 * @date 2019-03-01
 */
public class HttpClientUtil {

    public static Map<String, Object> httpSend(String uri, Map<String,String> keyParams, Map<String, String> params){
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpGet httpPost = new HttpGet(uri);

        CloseableHttpResponse response = null;
        Map<String, Object> result = new HashMap<String, Object>();
        try {
            response = httpClient.execute(httpPost);
            if(response.getStatusLine().getStatusCode()==200){

                HttpEntity httpEntity = response.getEntity();
                String rs = EntityUtils.toString(httpEntity);
                result.put("rs",rs);
                EntityUtils.consume(httpEntity);
            }else{
                result.put("status", "-2");
                result.put("msg", "服务器处理请求失败，httpCode："+response.getStatusLine().getStatusCode());
            }
        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
            result.put("status", "-3");
            result.put("msg", "服务器未响应");
        } finally{
            try {
                if(response!=null){
                    response.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return result;
    }

}
