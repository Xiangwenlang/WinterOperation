package json;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class JsonObjectSample {
    public static void main(String[] args) {
        creatJsonByMap();
    }

    private static void creatJsonByMap() {
        Map<String,Object> wangxiaoer = new HashMap<String, Object>();
        wangxiaoer.put("name","王小二");
        wangxiaoer.put("age",25.2);
        wangxiaoer.put("birthday","1990_01_01");
        System.out.printf(new JSONObject(wangxiaoer).toString());
    }

    private static void JSONObject() {
        JSONObject wangxiaoer =new JSONObject();
        try {
            wangxiaoer.put("name","王小二");
            wangxiaoer.put("age",25.2);
            wangxiaoer.put("birthday","1990_01_01");

        } catch (JSONException e) {
            e.printStackTrace();
        }

    }

}
