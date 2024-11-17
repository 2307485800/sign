package lab.sign.entity.query;

import java.util.Date;


/**
 * 参数
 */
public class ActivityQuery extends BaseParam {


	/**
	 * 活动id，唯一，可以自增
	 */
	private String actId;

	private String actIdFuzzy;

	/**
	 * 开始时间
	 */
	private String startTime;

	private String startTimeStart;

	private String startTimeEnd;

	/**
	 * 结束时间
	 */
	private String endTime;

	private String endTimeStart;

	private String endTimeEnd;

	/**
	 * 发起的人名字
	 */
	private String startUser;

	private String startUserFuzzy;

	/**
	 * 发起的内容
	 */
	private String content;

	private String contentFuzzy;


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

	public void setStartTime(String startTime){
		this.startTime = startTime;
	}

	public String getStartTime(){
		return this.startTime;
	}

	public void setStartTimeStart(String startTimeStart){
		this.startTimeStart = startTimeStart;
	}

	public String getStartTimeStart(){
		return this.startTimeStart;
	}
	public void setStartTimeEnd(String startTimeEnd){
		this.startTimeEnd = startTimeEnd;
	}

	public String getStartTimeEnd(){
		return this.startTimeEnd;
	}

	public void setEndTime(String endTime){
		this.endTime = endTime;
	}

	public String getEndTime(){
		return this.endTime;
	}

	public void setEndTimeStart(String endTimeStart){
		this.endTimeStart = endTimeStart;
	}

	public String getEndTimeStart(){
		return this.endTimeStart;
	}
	public void setEndTimeEnd(String endTimeEnd){
		this.endTimeEnd = endTimeEnd;
	}

	public String getEndTimeEnd(){
		return this.endTimeEnd;
	}

	public void setStartUser(String startUser){
		this.startUser = startUser;
	}

	public String getStartUser(){
		return this.startUser;
	}

	public void setStartUserFuzzy(String startUserFuzzy){
		this.startUserFuzzy = startUserFuzzy;
	}

	public String getStartUserFuzzy(){
		return this.startUserFuzzy;
	}

	public void setContent(String content){
		this.content = content;
	}

	public String getContent(){
		return this.content;
	}

	public void setContentFuzzy(String contentFuzzy){
		this.contentFuzzy = contentFuzzy;
	}

	public String getContentFuzzy(){
		return this.contentFuzzy;
	}

}
