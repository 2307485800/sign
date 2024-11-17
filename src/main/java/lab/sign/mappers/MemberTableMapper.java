package lab.sign.mappers;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 *  数据库操作接口
 */
@Mapper
public interface MemberTableMapper<T,P> extends BaseMapper<T,P> {

	/**
	 * 根据StudentId更新
	 */
	 Integer updateByStudentId(@Param("bean") T t,@Param("studentId") String studentId);


	/**
	 * 根据StudentId删除
	 */
	 Integer deleteByStudentId(@Param("studentId") String studentId);


	/**
	 * 根据StudentId获取对象
	 */
	 T selectByStudentId(@Param("studentId") String studentId);


}
