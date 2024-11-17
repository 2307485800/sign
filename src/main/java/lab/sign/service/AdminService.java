package lab.sign.service;

import java.util.List;

import lab.sign.entity.query.AdminQuery;
import lab.sign.entity.po.Admin;
import lab.sign.entity.vo.PaginationResultVO;


/**
 *  业务接口
 */
public interface AdminService {

	/**
	 * 根据条件查询列表
	 */
	List<Admin> findListByParam(AdminQuery param);

	/**
	 * 根据条件查询列表
	 */
	Integer findCountByParam(AdminQuery param);

	/**
	 * 分页查询
	 */
	PaginationResultVO<Admin> findListByPage(AdminQuery param);

	/**
	 * 新增
	 */
	Integer add(Admin bean);

	/**
	 * 批量新增
	 */
	Integer addBatch(List<Admin> listBean);

	/**
	 * 批量新增/修改
	 */
	Integer addOrUpdateBatch(List<Admin> listBean);

	/**
	 * 多条件更新
	 */
	Integer updateByParam(Admin bean,AdminQuery param);

	/**
	 * 多条件删除
	 */
	Integer deleteByParam(AdminQuery param);

	/**
	 * 根据PhoneNumber查询对象
	 */
	Admin getAdminByPhoneNumber(Integer phoneNumber);


	/**
	 * 根据PhoneNumber修改
	 */
	Integer updateAdminByPhoneNumber(Admin bean,Integer phoneNumber);


	/**
	 * 根据PhoneNumber删除
	 */
	Integer deleteAdminByPhoneNumber(Integer phoneNumber);

}