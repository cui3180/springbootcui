package com.spring.cui.tools.exception;

import org.springframework.util.StringUtils;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ModelUtils {
	/**
	 * 判断对象属性值是否为空，只要有一个为空则返true,否则返回false
	 * @param model 实体对象
	 * @param notNullFields 需要过滤的属性名，空值表示所有字段过滤
	 * @param ignoreFields  不需要过滤的属性名，空值表示没有忽略的属性
	 * @return
	 */
	public static boolean hasPropertyNull(Object model, String[] notNullFields, String[] ignoreFields){
		if(model==null){
			return true;
		}
		Field[] field = model.getClass().getDeclaredFields();
		//忽略字段
		List<String> ignoreList =ignoreFields!=null ? Arrays.asList(ignoreFields) : new ArrayList<String>();
		//要检查字段list
		List<String> notNullList =notNullFields!=null ? Arrays.asList(notNullFields) : new ArrayList<String>();
		for(int j=0 ; j<field.length ; j++){ 
			//属性
			String name = field[j].getName();
			if(ignoreList.contains(name)){
				continue;
			}
			//
			//属性类型
			String type = field[j].getGenericType().toString();
			//存在需要检查的字段列表
			if(notNullList.size()>0){
				if(notNullList.contains(name)){
					boolean ret = isFieldNull(model, name, type);
					if(ret){
						return ret;
					}
				}
			}else{
				boolean ret = isFieldNull(model, name, type);
				if(ret){
					return ret;
				}
			}
		}
		return false;
	}
	/**
	 * 如果属性name值为空则返回true,否则false
	 * @param model
	 * @param name
	 * @param type
	 * @return
	 */
	private static boolean isFieldNull(Object model, String name, String type){
		//get方法
		Method getMethod=null;
		try {
			getMethod = model.getClass().getMethod(toGetter(name));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		try {
			if(type.equals("class java.lang.String")){
				String value = (String) getMethod.invoke(model);
				if(StringUtils.isEmpty(value)){
					return true;
				}
			}else{
				Object value = getMethod.invoke(model);
				if(value==null){
					return true;
				}
			}
		} catch (IllegalArgumentException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IllegalAccessException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (InvocationTargetException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return false;
	}
	
	/**
	 6      * Get getter method name by field name
	 7      * @param fieldname
	 8      * @return
	 9      */
    private static String toGetter(String fieldname) {
	        
	       if (fieldname == null || fieldname.length() == 0) {
	           return null;
	       }
	       
	      /* If the second char is upper, make 'get' + field name as getter name. For example, eBlog -> geteBlog */
	       if (fieldname.length() > 2) {
	            String second = fieldname.substring(1, 2);
	            if (second.equals(second.toUpperCase())) {
	                return new StringBuffer("get").append(fieldname).toString();
	            }
	       }
	        
	     /* Common situation */
	        fieldname = new StringBuffer("get").append(fieldname.substring(0, 1).toUpperCase())
                .append(fieldname.substring(1)).toString();
        
        return  fieldname;
    }
 
}
