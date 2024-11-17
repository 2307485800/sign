package lab.sign.service;

import java.util.List;

import lab.sign.entity.query.MemberTableQuery;
import lab.sign.entity.po.MemberTable;
import lab.sign.entity.vo.PaginationResultVO;


/**
 *  业务接口
 */
public interface MemberTableService {

	/**
	 * 根据条件查询列表
	 */
	List<MemberTable> findListByParam(MemberTableQuery param);

	/**
	 * 根据条件查询列表
	 */
	Integer findCountByParam(MemberTableQuery param);

	/**
	 * 分页查询
	 */
	PaginationResultVO<MemberTable> findListByPage(MemberTableQuery param);

	/**
	 * 新增
	 */
	Integer add(MemberTable bean);

	/**
	 * 批量新增
	 */
	Integer addBatch(List<MemberTable> listBean);

	/**
	 * 批量新增/修改
	 */
	Integer addOrUpdateBatch(List<MemberTable> listBean);

	/**
	 * 多条件更新
	 */
	Integer updateByParam(MemberTable bean,MemberTableQuery param);

	/**
	 * 多条件删除
	 */
	Integer deleteByParam(MemberTableQuery param);

	/**
	 * 根据StudentId查询对象
	 */
	MemberTable getMemberTableByStudentId(String studentId);


	/**
	 * 根据StudentId修改
	 */
	Integer updateMemberTableByStudentId(MemberTable bean,String studentId);


	/**
	 * 根据StudentId删除
	 */
	Integer deleteMemberTableByStudentId(String studentId);

}