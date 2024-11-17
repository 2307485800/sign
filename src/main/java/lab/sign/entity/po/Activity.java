package lab.sign.entity.po;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Date;
import lab.sign.entity.enums.DateTimePatternEnum;
import lab.sign.utils.DateUtil;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;


/**
 * 
 */
public class Activity implements Serializable {


	/**
	 * 活动id，唯一，可以自增
	 */
	private String actId;

	/**
	 * 开始时间
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date startTime;

	/**
	 * 结束时间
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date endTime;

	/**
	 * 发起的人名字
	 */
	private String startUser;

	/**
	 * 发起的内容
	 */
	private String content;


	public void setActId(String actId){
		this.actId = actId;
	}

	public String getActId(){
		return this.actId;
	}

	public void setStartTime(Date startTime){
		this.startTime = startTime;
	}

	public Date getStartTime(){
		return this.startTime;
	}

	public void setEndTime(Date endTime){
		this.endTime = endTime;
	}

	public Date getEndTime(){
		return this.endTime;
	}

	public void setStartUser(String startUser){
		this.startUser = startUser;
	}

	public String getStartUser(){
		return this.startUser;
	}

	public void setContent(String content){
		this.content = content;
	}

	public String getContent(){
		return this.content;
	}

	@Override
	public String toString (){
		return "活动id，唯一，可以自增:"+(actId == null ? "空" : actId)+"，开始时间:"+(startTime == null ? "空" : DateUtil.format(startTime, DateTimePatternEnum.YYYY_MM_DD_HH_MM_SS.getPattern()))+"，结束时间:"+(endTime == null ? "空" : DateUtil.format(endTime, DateTimePatternEnum.YYYY_MM_DD_HH_MM_SS.getPattern()))+"，发起的人名字:"+(startUser == null ? "空" : startUser)+"，发起的内容:"+(content == null ? "空" : content);
	}
}
