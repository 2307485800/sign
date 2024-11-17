package lab.sign.controller;

import java.util.List;

import lab.sign.entity.query.AdminQuery;
import lab.sign.entity.po.Admin;
import lab.sign.entity.vo.ResponseVO;
import lab.sign.service.AdminService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 *  Controller
 */
@RestController("adminController")
@RequestMapping("/admin")
public class AdminController extends ABaseController{

	@Resource
	private AdminService adminService;
	/**
	 * 根据条件分页查询
	 */
	@RequestMapping("/loadDataList")
	public ResponseVO loadDataList(AdminQuery query){
		return getSuccessResponseVO(adminService.findListByPage(query));
	}

	/**
	 * 新增
	 */
	@RequestMapping("/add")
	public ResponseVO add(Admin bean) {
		adminService.add(bean);
		return getSuccessResponseVO(null);
	}

	/**
	 * 批量新增
	 */
	@RequestMapping("/addBatch")
	public ResponseVO addBatch(@RequestBody List<Admin> listBean) {
		adminService.addBatch(listBean);
		return getSuccessResponseVO(null);
	}

	/**
	 * 批量新增/修改
	 */
	@RequestMapping("/addOrUpdateBatch")
	public ResponseVO addOrUpdateBatch(@RequestBody List<Admin> listBean) {
		adminService.addBatch(listBean);
		return getSuccessResponseVO(null);
	}

	/**
	 * 根据PhoneNumber查询对象
	 */
	@RequestMapping("/getAdminByPhoneNumber")
	public ResponseVO getAdminByPhoneNumber(Integer phoneNumber) {
		return getSuccessResponseVO(adminService.getAdminByPhoneNumber(phoneNumber));
	}

	/**
	 * 根据PhoneNumber修改对象
	 */
	@RequestMapping("/updateAdminByPhoneNumber")
	public ResponseVO updateAdminByPhoneNumber(Admin bean,Integer phoneNumber) {
		adminService.updateAdminByPhoneNumber(bean,phoneNumber);
		return getSuccessResponseVO(null);
	}

	/**
	 * 根据PhoneNumber删除
	 */
	@RequestMapping("/deleteAdminByPhoneNumber")
	public ResponseVO deleteAdminByPhoneNumber(Integer phoneNumber) {
		adminService.deleteAdminByPhoneNumber(phoneNumber);
		return getSuccessResponseVO(null);
	}
}