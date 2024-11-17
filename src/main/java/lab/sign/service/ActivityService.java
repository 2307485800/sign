package lab.sign.service;

import java.util.List;

import lab.sign.entity.query.ActivityQuery;
import lab.sign.entity.po.Activity;
import lab.sign.entity.vo.PaginationResultVO;


/**
 *  业务接口
 */
public interface ActivityService {

	/**
	 * 根据条件查询列表
	 */
	List<Activity> findListByParam(ActivityQuery param);

	/**
	 * 根据条件查询列表
	 */
	Integer findCountByParam(ActivityQuery param);

	/**
	 * 分页查询
	 */
	PaginationResultVO<Activity> findListByPage(ActivityQuery param);

	/**
	 * 新增
	 */
	Integer add(Activity bean);

	/**
	 * 批量新增
	 */
	Integer addBatch(List<Activity> listBean);

	/**
	 * 批量新增/修改
	 */
	Integer addOrUpdateBatch(List<Activity> listBean);

	/**
	 * 多条件更新
	 */
	Integer updateByParam(Activity bean,ActivityQuery param);

	/**
	 * 多条件删除
	 */
	Integer deleteByParam(ActivityQuery param);

	/**
	 * 根据ActId查询对象
	 */
	Activity getActivityByActId(String actId);


	/**
	 * 根据ActId修改
	 */
	Integer updateActivityByActId(Activity bean,String actId);


	/**
	 * 根据ActId删除
	 */
	Integer deleteActivityByActId(String actId);

}