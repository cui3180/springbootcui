package com.spring.cui.fs.eumn;


import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

public enum StatusEnum {

    /**
     * 0 未知(无业务含义)
     */
    UNKNOW(0, "未知"),
    /**
     * 1 废除
     */
    ABOLISH(1, "废除"),
    /**
     * 2 启用
     */
    START_USE(2, "启用"),

    /**
     * 3  生成中
     */
    CREATE_ING(3, "生成中");

    private int index;
    private String name;

    private StatusEnum(int index, String name) {
        this.index = index;
        this.name = name;
    }

    public int getIndex() {
        return index;
    }

    public String getName() {
        return name;
    }

    public static StatusEnum get(int index) {
        for (StatusEnum em : StatusEnum.values()) {
            if (em.getIndex() == index)
                return em;
        }
        throw new IllegalArgumentException("unknow index : " + index);
    }

    public static StatusEnum get(String name) {
        for (StatusEnum em : StatusEnum.values()) {
            if (em.getName().equals(name))
                return em;
        }
        return StatusEnum.UNKNOW;
    }
    public static JSONArray getEnum(){
        JSONArray jsonArray = new JSONArray();
        JSONObject jsonObject =null;
        for (StatusEnum enumObj : StatusEnum.values()) {
            jsonObject = new JSONObject();
            jsonObject.put("code",enumObj.getIndex());
            jsonObject.put("name",enumObj.getName());
            jsonArray.add(jsonObject);
        }
        return  jsonArray;
    }

}
