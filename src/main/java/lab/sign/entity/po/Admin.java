package lab.sign.entity.po;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;


/**
 * 
 */
public class Admin implements Serializable {


	/**
	 * 手机号
	 */
	private Integer phoneNumber;

	/**
	 * 名字（昵称）
	 */
	private String userName;

	/**
	 * 密码
	 */
	private String password;

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

	public void setPassword(String password){
		this.password = password;
	}

	public String getPassword(){
		return this.password;
	}

	public void setAdmin(Integer admin){
		this.admin = admin;
	}

	public Integer getAdmin(){
		return this.admin;
	}

	@Override
	public String toString (){
		return "手机号:"+(phoneNumber == null ? "空" : phoneNumber)+"，名字（昵称）:"+(userName == null ? "空" : userName)+"，密码:"+(password == null ? "空" : password)+"，管理员:"+(admin == null ? "空" : admin);
	}
}
