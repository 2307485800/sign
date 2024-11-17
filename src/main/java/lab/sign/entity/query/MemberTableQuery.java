package lab.sign.entity.query;



/**
 * 参数
 */
public class MemberTableQuery extends BaseParam {


	/**
	 * 学号
	 */
	private String studentId;

	private String studentIdFuzzy;

	/**
	 * 姓名
	 */
	private String name;

	private String nameFuzzy;

	/**
	 * 手机号
	 */
	private String phoneNumber;

	private String phoneNumberFuzzy;

	/**
	 * 班级号
	 */
	private String classId;

	private String classIdFuzzy;

	/**
	 * 组号
	 */
	private String groupId;

	private String groupIdFuzzy;


	public void setStudentId(String studentId){
		this.studentId = studentId;
	}

	public String getStudentId(){
		return this.studentId;
	}

	public void setStudentIdFuzzy(String studentIdFuzzy){
		this.studentIdFuzzy = studentIdFuzzy;
	}

	public String getStudentIdFuzzy(){
		return this.studentIdFuzzy;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return this.name;
	}

	public void setNameFuzzy(String nameFuzzy){
		this.nameFuzzy = nameFuzzy;
	}

	public String getNameFuzzy(){
		return this.nameFuzzy;
	}

	public void setPhoneNumber(String phoneNumber){
		this.phoneNumber = phoneNumber;
	}

	public String getPhoneNumber(){
		return this.phoneNumber;
	}

	public void setPhoneNumberFuzzy(String phoneNumberFuzzy){
		this.phoneNumberFuzzy = phoneNumberFuzzy;
	}

	public String getPhoneNumberFuzzy(){
		return this.phoneNumberFuzzy;
	}

	public void setClassId(String classId){
		this.classId = classId;
	}

	public String getClassId(){
		return this.classId;
	}

	public void setClassIdFuzzy(String classIdFuzzy){
		this.classIdFuzzy = classIdFuzzy;
	}

	public String getClassIdFuzzy(){
		return this.classIdFuzzy;
	}

	public void setGroupId(String groupId){
		this.groupId = groupId;
	}

	public String getGroupId(){
		return this.groupId;
	}

	public void setGroupIdFuzzy(String groupIdFuzzy){
		this.groupIdFuzzy = groupIdFuzzy;
	}

	public String getGroupIdFuzzy(){
		return this.groupIdFuzzy;
	}

}
