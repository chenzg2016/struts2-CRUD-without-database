package com.zccp.query.action;

import java.util.Collection;

import com.opensymphony.xwork2.ActionSupport;
import com.zccp.query.dao.UserDao;
import com.zccp.query.pojo.User;

/** 
 * @author chenzg14602
 * @version 1.0
 * @todo  
 * 类说明 :web请求的action
 */
public class UserAction extends ActionSupport {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String id;
	private String[] ids;//多条记录
	private User user;
	private Collection<User> users;
	private UserDao dao = UserDao.getInstance();
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String[] getIds() {
		return ids;
	}
	public void setIds(String[] ids) {
		this.ids = ids;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Collection<User> getUsers() {
		return users;
	}
	public void setUsers(Collection<User> users) {
		this.users = users;
	}
	public String get() {
		user = dao.getUser(id);
		return SUCCESS;
	}
	public String list() {
		users = dao.getUsers();
		return SUCCESS;
	}
	public String save() {
		dao.saveUser(user);
		return SUCCESS;
	}
	public String remove() {
		if(null != id) {
			dao.removeUser(id);
		} else {
			dao.removeUsers(ids);
		}
		return SUCCESS;
	}

}
