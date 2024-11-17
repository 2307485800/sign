package lab.sign.mappers;

import org.apache.ibatis.annotations.Param;

/**
 *  数据库操作接口
 */
public interface AdminMapper<T,P> extends BaseMapper<T,P> {

	/**
	 * 根据PhoneNumber更新
	 */
	 Integer updateByPhoneNumber(@Param("bean") T t,@Param("phoneNumber") Integer phoneNumber);


	/**
	 * 根据PhoneNumber删除
	 */
	 Integer deleteByPhoneNumber(@Param("phoneNumber") Integer phoneNumber);


	/**
	 * 根据PhoneNumber获取对象
	 */
	 T selectByPhoneNumber(@Param("phoneNumber") Integer phoneNumber);


}
