package lab.sign.controller;

import java.util.List;

import lab.sign.entity.query.MemberTableQuery;
import lab.sign.entity.po.MemberTable;
import lab.sign.entity.vo.ResponseVO;
import lab.sign.service.MemberTableService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 *  Controller
 */
@RestController("memberTableController")
@RequestMapping("/memberTable")
public class MemberTableController extends ABaseController{

	@Resource
	private MemberTableService memberTableService;
	/**
	 * 根据条件分页查询
	 */
	@RequestMapping("/loadDataList")
	public ResponseVO loadDataList(MemberTableQuery query){
		return getSuccessResponseVO(memberTableService.findListByPage(query));
	}

	/**
	 * 新增
	 */
	@RequestMapping("/add")
	public ResponseVO add(MemberTable bean) {
		memberTableService.add(bean);
		return getSuccessResponseVO(null);
	}

	/**
	 * 批量新增
	 */
	@RequestMapping("/addBatch")
	public ResponseVO addBatch(@RequestBody List<MemberTable> listBean) {
		memberTableService.addBatch(listBean);
		return getSuccessResponseVO(null);
	}

	/**
	 * 批量新增/修改
	 */
	@RequestMapping("/addOrUpdateBatch")
	public ResponseVO addOrUpdateBatch(@RequestBody List<MemberTable> listBean) {
		memberTableService.addBatch(listBean);
		return getSuccessResponseVO(null);
	}

	/**
	 * 根据StudentId查询对象
	 */
	@RequestMapping("/getMemberTableByStudentId")
	public ResponseVO getMemberTableByStudentId(String studentId) {
		return getSuccessResponseVO(memberTableService.getMemberTableByStudentId(studentId));
	}

	/**
	 * 根据StudentId修改对象
	 */
	@RequestMapping("/updateMemberTableByStudentId")
	public ResponseVO updateMemberTableByStudentId(MemberTable bean,String studentId) {
		memberTableService.updateMemberTableByStudentId(bean,studentId);
		return getSuccessResponseVO(null);
	}

	/**
	 * 根据StudentId删除
	 */
	@RequestMapping("/deleteMemberTableByStudentId")
	public ResponseVO deleteMemberTableByStudentId(String studentId) {
		memberTableService.deleteMemberTableByStudentId(studentId);
		return getSuccessResponseVO(null);
	}
}