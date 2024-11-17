package lab.sign.entity.po;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;


/**
 * 
 */
public class MemberTable implements Serializable {


	/**
	 * 学号
	 */
	private String studentId;

	/**
	 * 姓名
	 */
	private String name;

	/**
	 * 手机号
	 */
	private String phoneNumber;

	/**
	 * 班级号
	 */
	private String classId;

	/**
	 * 组号
	 */
	private String groupId;

	/**
	 * 角色
	 */
	private String role;


	public void setStudentId(String studentId){
		this.studentId = studentId;
	}

	public String getStudentId(){
		return this.studentId;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return this.name;
	}

	public void setPhoneNumber(String phoneNumber){
		this.phoneNumber = phoneNumber;
	}

	public String getPhoneNumber(){
		return this.phoneNumber;
	}

	public void setClassId(String classId){
		this.classId = classId;
	}

	public String getClassId(){
		return this.classId;
	}

	public void setGroupId(String groupId){
		this.groupId = groupId;
	}

	public String getGroupId(){
		return this.groupId;
	}

	public void setRole(String role){
		this.role = role;
	}

	public String getRole(){
		return this.role;
	}

	@Override
	public String toString (){
		return "学号:"+(studentId == null ? "空" : studentId)+"，姓名:"+(name == null ? "空" : name)+"，手机号:"+(phoneNumber == null ? "空" : phoneNumber)+"，班级号:"+(classId == null ? "空" : classId)+"，组号:"+(groupId == null ? "空" : groupId)+"，角色:"+(role == null ? "空" : role);
	}
}
