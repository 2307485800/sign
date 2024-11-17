package lab.sign.entity.query;



/**
 * 参数
 */
public class AdminQuery extends BaseParam {


	/**
	 * 手机号
	 */
	private Integer phoneNumber;

	/**
	 * 名字（昵称）
	 */
	private String userName;

	private String userNameFuzzy;

	/**
	 * 密码
	 */
	private String password;

	private String passwordFuzzy;

	/**
	 * 管理员
	 */
	private Integer admin;


	public void setPhoneNumber(Integer phoneNumber){
		this.phoneNumber = phoneNumber;
	}

	public Integer getPhoneNumber(){
		return this.phoneNumber;
	}

	public void setUserName(String userName){
		this.userName = userName;
	}

	public String getUserName(){
		return this.userName;
	}

	public void setUserNameFuzzy(String userNameFuzzy){
		this.userNameFuzzy = userNameFuzzy;
	}

	public String getUserNameFuzzy(){
		return this.userNameFuzzy;
	}

	public void setPassword(String password){
		this.password = password;
	}

	public String getPassword(){
		return this.password;
	}

	public void setPasswordFuzzy(String passwordFuzzy){
		this.passwordFuzzy = passwordFuzzy;
	}

	public String getPasswordFuzzy(){
		return this.passwordFuzzy;
	}

	public void setAdmin(Integer admin){
		this.admin = admin;
	}

	public Integer getAdmin(){
		return this.admin;
	}

}
