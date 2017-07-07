package com.zccp.query.pojo;
/** 
 * @author chenzg14602
 * @version 1.0
 * @todo  
 * 类说明 :User pojo
 */
public class User {
	
		private Long id;
		private String loginname;
		private String password; // 加密
		private String name;
		public User(){
			
		}
		public User(Long id,String loginname,String password,String name){
			this.id = id;
			this.loginname = loginname;
			this.password = password;
			this.name = name;
		}
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getLoginname() {
			return loginname;
		}
		public void setLoginname(String loginname) {
			this.loginname = loginname;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
	

}
