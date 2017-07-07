package com.zccp.query.dao;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import com.zccp.query.pojo.User;
import com.zccp.query.util.MD5Util;

/** 
 * @author chenzg14602
 * @version 1.0
 * @todo  
 *类说明：模仿数据库的数据访问层
 */
public class UserDao {
	private static final UserDao userDao;
	private static final LinkedHashMap<String, User> userMap;
	static {//类初始化插入数据
		userDao = new UserDao();
		userMap = new LinkedHashMap<String, User>();
		userMap.put("1", new User(1L, "andy", "","Andy"));
		userMap.put("2", new User(2L, "carl", "","Carl"));
		userMap.put("3", new User(3L, "bruce", "","Bruce"));
		userMap.put("4", new User(4L, "dolly", "","Dolly"));
		}
	
	private UserDao() {
		
	}
	public static UserDao getInstance() {
		return userDao;
	}
	public Collection<User> getUsers() {
	return userMap.values();
	}
	public User getUser(String id) {
		User user = userMap.get(id);
		String pwd = MD5Util.convertMD5(user.getPassword());//解密
		user.setPassword(pwd);
		return user;
	}
	public void saveUser(User user) {
		String pwd = user.getPassword();
		pwd = MD5Util.convertMD5(pwd);//加密
		user.setPassword(pwd);
		userMap.put(String.valueOf(user.getId()), user);
	}
	public void removeUser(String id) {
		userMap.remove(id);
	}
	public void removeUsers(String[] ids) {
		for(String id : ids) {
			userMap.remove(id);
		}
	}
	
}
