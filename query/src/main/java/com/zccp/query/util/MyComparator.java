package com.zccp.query.util;

import java.util.Comparator;

import com.zccp.query.pojo.User;

/** 
 * @author chenzg14602
 * @version 1.0
 * @param <T>
 * @todo  
 * 类说明 :
 */
public class MyComparator<T> implements Comparator<T> {

	@Override
	public int compare(T o1, T o2) {
		if(((User)o1).getId()>((User)o2).getId()){  
            return 1;  
        }else{  
            return -1;  
        }  
	}

}
