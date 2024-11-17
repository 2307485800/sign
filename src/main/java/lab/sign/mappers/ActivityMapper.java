package lab.sign.mappers;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 *  数据库操作接口
 */

@Mapper
public interface ActivityMapper<T,P> extends BaseMapper<T,P> {

	/**
	 * 根据ActId更新
	 */
	 Integer updateByActId(@Param("bean") T t,@Param("actId") String actId);


	/**
	 * 根据ActId删除
	 */
	 Integer deleteByActId(@Param("actId") String actId);


	/**
	 * 根据ActId获取对象
	 */
	 T selectByActId(@Param("actId") String actId);


}
