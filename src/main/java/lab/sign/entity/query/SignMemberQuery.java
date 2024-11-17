package lab.sign.entity.query;



/**
 * 参数
 */
public class SignMemberQuery extends BaseParam {


	/**
	 * 学号
	 */
	private String studentId;

	private String studentIdFuzzy;

	/**
	 * 手机号
	 */
	private String pythoneNumber;

	private String pythoneNumberFuzzy;

	/**
	 * 活动id
	 */
	private String actId;

	private String actIdFuzzy;

	/**
	 * 姓名
	 */
	private String name;

	private String nameFuzzy;


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

	public void setPythoneNumber(String pythoneNumber){
		this.pythoneNumber = pythoneNumber;
	}

	public String getPythoneNumber(){
		return this.pythoneNumber;
	}

	public void setPythoneNumberFuzzy(String pythoneNumberFuzzy){
		this.pythoneNumberFuzzy = pythoneNumberFuzzy;
	}

	public String getPythoneNumberFuzzy(){
		return this.pythoneNumberFuzzy;
	}

	public void setActId(String actId){
		this.actId = actId;
	}

	public String getActId(){
		return this.actId;
	}

	public void setActIdFuzzy(String actIdFuzzy){
		this.actIdFuzzy = actIdFuzzy;
	}

	public String getActIdFuzzy(){
		return this.actIdFuzzy;
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

}
