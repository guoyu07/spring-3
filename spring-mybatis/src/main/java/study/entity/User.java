package study.entity;

/**
 * @describe:
 * @author:yang.bo@pelerin.cn
 * @date:2018年1月22日下午5:21:25
 */
public class User {

	private Integer id;
	private String userId;
	private String userName;
	private String email;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
