package com.github.rusichpt.order.ms.mappers;

import com.github.rusichpt.order.ms.entities.Session;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface SessionMapper {
    Session selectSession(String id);

}
