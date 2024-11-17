package lab.sign.service;

import java.util.List;

import lab.sign.entity.query.SignMemberQuery;
import lab.sign.entity.po.SignMember;
import lab.sign.entity.vo.PaginationResultVO;


/**
 *  业务接口
 */
public interface SignMemberService {

	/**
	 * 根据条件查询列表
	 */
	List<SignMember> findListByParam(SignMemberQuery param);

	/**
	 * 根据条件查询列表
	 */
	Integer findCountByParam(SignMemberQuery param);

	/**
	 * 分页查询
	 */
	PaginationResultVO<SignMember> findListByPage(SignMemberQuery param);

	/**
	 * 新增
	 */
	Integer add(SignMember bean);

	/**
	 * 批量新增
	 */
	Integer addBatch(List<SignMember> listBean);

	/**
	 * 批量新增/修改
	 */
	Integer addOrUpdateBatch(List<SignMember> listBean);

	/**
	 * 多条件更新
	 */
	Integer updateByParam(SignMember bean,SignMemberQuery param);

	/**
	 * 多条件删除
	 */
	Integer deleteByParam(SignMemberQuery param);

	/**
	 * 根据StudentId查询对象
	 */
	SignMember getSignMemberByStudentId(String studentId);


	/**
	 * 根据StudentId修改
	 */
	Integer updateSignMemberByStudentId(SignMember bean,String studentId);


	/**
	 * 根据StudentId删除
	 */
	Integer deleteSignMemberByStudentId(String studentId);

}