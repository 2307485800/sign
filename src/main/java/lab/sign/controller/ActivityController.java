package lab.sign.controller;

import java.util.List;

import lab.sign.entity.query.ActivityQuery;
import lab.sign.entity.po.Activity;
import lab.sign.entity.vo.ResponseVO;
import lab.sign.service.ActivityService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 *  Controller
 */
@RestController("activityController")
@RequestMapping("/activity")
public class ActivityController extends ABaseController{

	@Resource
	private ActivityService activityService;
	/**
	 * 根据条件分页查询
	 */
	@RequestMapping("/loadDataList")
	public ResponseVO loadDataList(ActivityQuery query){
		return getSuccessResponseVO(activityService.findListByPage(query));
	}

	/**
	 * 新增
	 */
	@RequestMapping("/add")
	public ResponseVO add(Activity bean) {
		activityService.add(bean);
		return getSuccessResponseVO(null);
	}

	/**
	 * 批量新增
	 */
	@RequestMapping("/addBatch")
	public ResponseVO addBatch(@RequestBody List<Activity> listBean) {
		activityService.addBatch(listBean);
		return getSuccessResponseVO(null);
	}

	/**
	 * 批量新增/修改
	 */
	@RequestMapping("/addOrUpdateBatch")
	public ResponseVO addOrUpdateBatch(@RequestBody List<Activity> listBean) {
		activityService.addBatch(listBean);
		return getSuccessResponseVO(null);
	}

	/**
	 * 根据ActId查询对象
	 */
	@RequestMapping("/getActivityByActId")
	public ResponseVO getActivityByActId(String actId) {
		return getSuccessResponseVO(activityService.getActivityByActId(actId));
	}

	/**
	 * 根据ActId修改对象
	 */
	@RequestMapping("/updateActivityByActId")
	public ResponseVO updateActivityByActId(Activity bean,String actId) {
		activityService.updateActivityByActId(bean,actId);
		return getSuccessResponseVO(null);
	}

	/**
	 * 根据ActId删除
	 */
	@RequestMapping("/deleteActivityByActId")
	public ResponseVO deleteActivityByActId(String actId) {
		activityService.deleteActivityByActId(actId);
		return getSuccessResponseVO(null);
	}
}