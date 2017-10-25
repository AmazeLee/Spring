package com.sh.c_injection;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Properties;


/**
 * @author Amaze_lee
 * @date 2017年10月20日 下午7:19:19 
 * @version V1.0  
 * @Description: 
 */
public class CollectionBean {
	
	private Object[] arr;//数组类型注入
	private List list;//list/set注入
	private Map map;//map类型注入
	private Properties prop;//Properties类型注入
	public Object[] getArr() {
		return arr;
	}
	public void setArr(Object[] arr) {
		this.arr = arr;
	}
	public List getList() {
		return list;
	}
	public void setList(List list) {
		this.list = list;
	}
	public Map getMap() {
		return map;
	}
	public void setMap(Map map) {
		this.map = map;
	}
	public Properties getProp() {
		return prop;
	}
	public void setProp(Properties prop) {
		this.prop = prop;
	}
	@Override
	public String toString() {
		return "CollectionBean [arr=" + Arrays.toString(arr) + ", list=" + list + ", map=" + map + ", prop=" + prop
				+ "]";
	}
	
	
}
