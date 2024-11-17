package lab.sign.controller;

import java.util.List;

import lab.sign.entity.query.SignMemberQuery;
import lab.sign.entity.po.SignMember;
import lab.sign.entity.vo.ResponseVO;
import lab.sign.service.SignMemberService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 *  Controller
 */
@RestController("signMemberController")
@RequestMapping("/signMember")
public class SignMemberController extends ABaseController{

	@Resource
	private SignMemberService signMemberService;
	/**
	 * 根据条件分页查询
	 */
	@RequestMapping("/loadDataList")
	public ResponseVO loadDataList(SignMemberQuery query){
		return getSuccessResponseVO(signMemberService.findListByPage(query));
	}

	/**
	 * 新增
	 */
	@RequestMapping("/add")
	public ResponseVO add(SignMember bean) {
		signMemberService.add(bean);
		return getSuccessResponseVO(null);
	}

	/**
	 * 批量新增
	 */
	@RequestMapping("/addBatch")
	public ResponseVO addBatch(@RequestBody List<SignMember> listBean) {
		signMemberService.addBatch(listBean);
		return getSuccessResponseVO(null);
	}

	/**
	 * 批量新增/修改
	 */
	@RequestMapping("/addOrUpdateBatch")
	public ResponseVO addOrUpdateBatch(@RequestBody List<SignMember> listBean) {
		signMemberService.addBatch(listBean);
		return getSuccessResponseVO(null);
	}

	/**
	 * 根据StudentId查询对象
	 */
	@RequestMapping("/getSignMemberByStudentId")
	public ResponseVO getSignMemberByStudentId(String studentId) {
		return getSuccessResponseVO(signMemberService.getSignMemberByStudentId(studentId));
	}

	/**
	 * 根据StudentId修改对象
	 */
	@RequestMapping("/updateSignMemberByStudentId")
	public ResponseVO updateSignMemberByStudentId(SignMember bean,String studentId) {
		signMemberService.updateSignMemberByStudentId(bean,studentId);
		return getSuccessResponseVO(null);
	}

	/**
	 * 根据StudentId删除
	 */
	@RequestMapping("/deleteSignMemberByStudentId")
	public ResponseVO deleteSignMemberByStudentId(String studentId) {
		signMemberService.deleteSignMemberByStudentId(studentId);
		return getSuccessResponseVO(null);
	}
}