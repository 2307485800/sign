package lab.sign.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lab.sign.entity.enums.PageSize;
import lab.sign.entity.query.ActivityQuery;
import lab.sign.entity.po.Activity;
import lab.sign.entity.vo.PaginationResultVO;
import lab.sign.entity.query.SimplePage;
import lab.sign.mappers.ActivityMapper;
import lab.sign.service.ActivityService;
import lab.sign.utils.StringTools;


/**
 *  业务接口实现
 */
@Service("activityService")
public class ActivityServiceImpl implements ActivityService {

	@Autowired
	private ActivityMapper<Activity, ActivityQuery> activityMapper;

	/**
	 * 根据条件查询列表
	 */
	@Override
	public List<Activity> findListByParam(ActivityQuery param) {
		return this.activityMapper.selectList(param);
	}

	/**
	 * 根据条件查询列表
	 */
	@Override
	public Integer findCountByParam(ActivityQuery param) {
		return this.activityMapper.selectCount(param);
	}

	/**
	 * 分页查询方法
	 */
	@Override
	public PaginationResultVO<Activity> findListByPage(ActivityQuery param) {
		int count = this.findCountByParam(param);
		int pageSize = param.getPageSize() == null ? PageSize.SIZE15.getSize() : param.getPageSize();

		SimplePage page = new SimplePage(param.getPageNo(), count, pageSize);
		param.setSimplePage(page);
		List<Activity> list = this.findListByParam(param);
		PaginationResultVO<Activity> result = new PaginationResultVO(count, page.getPageSize(), page.getPageNo(), page.getPageTotal(), list);
		return result;
	}

	/**
	 * 新增
	 */
	@Override
	public Integer add(Activity bean) {
		return this.activityMapper.insert(bean);
	}

	/**
	 * 批量新增
	 */
	@Override
	public Integer addBatch(List<Activity> listBean) {
		if (listBean == null || listBean.isEmpty()) {
			return 0;
		}
		return this.activityMapper.insertBatch(listBean);
	}

	/**
	 * 批量新增或者修改
	 */
	@Override
	public Integer addOrUpdateBatch(List<Activity> listBean) {
		if (listBean == null || listBean.isEmpty()) {
			return 0;
		}
		return this.activityMapper.insertOrUpdateBatch(listBean);
	}

	/**
	 * 多条件更新
	 */
	@Override
	public Integer updateByParam(Activity bean, ActivityQuery param) {
		StringTools.checkParam(param);
		return this.activityMapper.updateByParam(bean, param);
	}

	/**
	 * 多条件删除
	 */
	@Override
	public Integer deleteByParam(ActivityQuery param) {
		StringTools.checkParam(param);
		return this.activityMapper.deleteByParam(param);
	}

	/**
	 * 根据ActId获取对象
	 */
	@Override
	public Activity getActivityByActId(String actId) {
		return this.activityMapper.selectByActId(actId);
	}

	/**
	 * 根据ActId修改
	 */
	@Override
	public Integer updateActivityByActId(Activity bean, String actId) {
		return this.activityMapper.updateByActId(bean, actId);
	}

	/**
	 * 根据ActId删除
	 */
	@Override
	public Integer deleteActivityByActId(String actId) {
		return this.activityMapper.deleteByActId(actId);
	}
}
