package lab.sign.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import lab.sign.entity.enums.PageSize;
import lab.sign.entity.query.MemberTableQuery;
import lab.sign.entity.po.MemberTable;
import lab.sign.entity.vo.PaginationResultVO;
import lab.sign.entity.query.SimplePage;
import lab.sign.mappers.MemberTableMapper;
import lab.sign.service.MemberTableService;
import lab.sign.utils.StringTools;


/**
 *  业务接口实现
 */
@Service("memberTableService")
public class MemberTableServiceImpl implements MemberTableService {

	@Resource
	private MemberTableMapper<MemberTable, MemberTableQuery> memberTableMapper;

	/**
	 * 根据条件查询列表
	 */
	@Override
	public List<MemberTable> findListByParam(MemberTableQuery param) {
		return this.memberTableMapper.selectList(param);
	}

	/**
	 * 根据条件查询列表
	 */
	@Override
	public Integer findCountByParam(MemberTableQuery param) {
		return this.memberTableMapper.selectCount(param);
	}

	/**
	 * 分页查询方法
	 */
	@Override
	public PaginationResultVO<MemberTable> findListByPage(MemberTableQuery param) {
		int count = this.findCountByParam(param);
		int pageSize = param.getPageSize() == null ? PageSize.SIZE15.getSize() : param.getPageSize();

		SimplePage page = new SimplePage(param.getPageNo(), count, pageSize);
		param.setSimplePage(page);
		List<MemberTable> list = this.findListByParam(param);
		PaginationResultVO<MemberTable> result = new PaginationResultVO(count, page.getPageSize(), page.getPageNo(), page.getPageTotal(), list);
		return result;
	}

	/**
	 * 新增
	 */
	@Override
	public Integer add(MemberTable bean) {
		return this.memberTableMapper.insert(bean);
	}

	/**
	 * 批量新增
	 */
	@Override
	public Integer addBatch(List<MemberTable> listBean) {
		if (listBean == null || listBean.isEmpty()) {
			return 0;
		}
		return this.memberTableMapper.insertBatch(listBean);
	}

	/**
	 * 批量新增或者修改
	 */
	@Override
	public Integer addOrUpdateBatch(List<MemberTable> listBean) {
		if (listBean == null || listBean.isEmpty()) {
			return 0;
		}
		return this.memberTableMapper.insertOrUpdateBatch(listBean);
	}

	/**
	 * 多条件更新
	 */
	@Override
	public Integer updateByParam(MemberTable bean, MemberTableQuery param) {
		StringTools.checkParam(param);
		return this.memberTableMapper.updateByParam(bean, param);
	}

	/**
	 * 多条件删除
	 */
	@Override
	public Integer deleteByParam(MemberTableQuery param) {
		StringTools.checkParam(param);
		return this.memberTableMapper.deleteByParam(param);
	}

	/**
	 * 根据StudentId获取对象
	 */
	@Override
	public MemberTable getMemberTableByStudentId(String studentId) {
		return this.memberTableMapper.selectByStudentId(studentId);
	}

	/**
	 * 根据StudentId修改
	 */
	@Override
	public Integer updateMemberTableByStudentId(MemberTable bean, String studentId) {
		return this.memberTableMapper.updateByStudentId(bean, studentId);
	}

	/**
	 * 根据StudentId删除
	 */
	@Override
	public Integer deleteMemberTableByStudentId(String studentId) {
		return this.memberTableMapper.deleteByStudentId(studentId);
	}
}