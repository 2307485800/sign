package lab.sign.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import lab.sign.entity.enums.PageSize;
import lab.sign.entity.query.SignMemberQuery;
import lab.sign.entity.po.SignMember;
import lab.sign.entity.vo.PaginationResultVO;
import lab.sign.entity.query.SimplePage;
import lab.sign.mappers.SignMemberMapper;
import lab.sign.service.SignMemberService;
import lab.sign.utils.StringTools;


/**
 *  业务接口实现
 */
@Service("signMemberService")
public class SignMemberServiceImpl implements SignMemberService {

	@Resource
	private SignMemberMapper<SignMember, SignMemberQuery> signMemberMapper;

	/**
	 * 根据条件查询列表
	 */
	@Override
	public List<SignMember> findListByParam(SignMemberQuery param) {
		return this.signMemberMapper.selectList(param);
	}

	/**
	 * 根据条件查询列表
	 */
	@Override
	public Integer findCountByParam(SignMemberQuery param) {
		return this.signMemberMapper.selectCount(param);
	}

	/**
	 * 分页查询方法
	 */
	@Override
	public PaginationResultVO<SignMember> findListByPage(SignMemberQuery param) {
		int count = this.findCountByParam(param);
		int pageSize = param.getPageSize() == null ? PageSize.SIZE15.getSize() : param.getPageSize();

		SimplePage page = new SimplePage(param.getPageNo(), count, pageSize);
		param.setSimplePage(page);
		List<SignMember> list = this.findListByParam(param);
		PaginationResultVO<SignMember> result = new PaginationResultVO(count, page.getPageSize(), page.getPageNo(), page.getPageTotal(), list);
		return result;
	}

	/**
	 * 新增
	 */
	@Override
	public Integer add(SignMember bean) {
		return this.signMemberMapper.insert(bean);
	}

	/**
	 * 批量新增
	 */
	@Override
	public Integer addBatch(List<SignMember> listBean) {
		if (listBean == null || listBean.isEmpty()) {
			return 0;
		}
		return this.signMemberMapper.insertBatch(listBean);
	}

	/**
	 * 批量新增或者修改
	 */
	@Override
	public Integer addOrUpdateBatch(List<SignMember> listBean) {
		if (listBean == null || listBean.isEmpty()) {
			return 0;
		}
		return this.signMemberMapper.insertOrUpdateBatch(listBean);
	}

	/**
	 * 多条件更新
	 */
	@Override
	public Integer updateByParam(SignMember bean, SignMemberQuery param) {
		StringTools.checkParam(param);
		return this.signMemberMapper.updateByParam(bean, param);
	}

	/**
	 * 多条件删除
	 */
	@Override
	public Integer deleteByParam(SignMemberQuery param) {
		StringTools.checkParam(param);
		return this.signMemberMapper.deleteByParam(param);
	}

	/**
	 * 根据StudentId获取对象
	 */
	@Override
	public SignMember getSignMemberByStudentId(String studentId) {
		return this.signMemberMapper.selectByStudentId(studentId);
	}

	/**
	 * 根据StudentId修改
	 */
	@Override
	public Integer updateSignMemberByStudentId(SignMember bean, String studentId) {
		return this.signMemberMapper.updateByStudentId(bean, studentId);
	}

	/**
	 * 根据StudentId删除
	 */
	@Override
	public Integer deleteSignMemberByStudentId(String studentId) {
		return this.signMemberMapper.deleteByStudentId(studentId);
	}
}