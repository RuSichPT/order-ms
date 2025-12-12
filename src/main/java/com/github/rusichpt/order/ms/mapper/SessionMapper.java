package com.github.rusichpt.order.ms.mapper;

import com.github.rusichpt.order.ms.entity.Session;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface SessionMapper {
    Session selectSession(String id);

}
