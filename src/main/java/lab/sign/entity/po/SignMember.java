package lab.sign.entity.po;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;


/**
 * 
 */
public class SignMember implements Serializable {


	/**
	 * 学号
	 */
	private String studentId;

	/**
	 * 手机号
	 */
	private String pythoneNumber;

	/**
	 * 活动id
	 */
	private String actId;

	/**
	 * 姓名
	 */
	private String name;


	public void setStudentId(String studentId){
		this.studentId = studentId;
	}

	public String getStudentId(){
		return this.studentId;
	}

	public void setPythoneNumber(String pythoneNumber){
		this.pythoneNumber = pythoneNumber;
	}

	public String getPythoneNumber(){
		return this.pythoneNumber;
	}

	public void setActId(String actId){
		this.actId = actId;
	}

	public String getActId(){
		return this.actId;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return this.name;
	}

	@Override
	public String toString (){
		return "学号:"+(studentId == null ? "空" : studentId)+"，手机号:"+(pythoneNumber == null ? "空" : pythoneNumber)+"，活动id:"+(actId == null ? "空" : actId)+"，姓名:"+(name == null ? "空" : name);
	}
}
