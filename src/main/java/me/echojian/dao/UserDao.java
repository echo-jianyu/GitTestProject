package me.echojian.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import me.echojian.domain.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao extends BaseMapper<User> {
}
