package tk.mybatis;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * MyMapper
 *
 * @author zhongwenhao
 * @date 2020/3/2
 */

public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T> {
}
