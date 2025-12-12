package com.github.rusichpt.order.ms.services;

import com.github.rusichpt.order.ms.entities.Session;
import com.github.rusichpt.order.ms.filters.OrderFilter;
import com.github.rusichpt.order.ms.mappers.SessionMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class SessionServiceImpl implements SessionService{

    private static final Logger LOGGER = LoggerFactory.getLogger(OrderFilter.class);
    @Autowired
    SessionMapper sessionMapper;

    @Override
    @Cacheable(cacheNames = "session")
    public Session select(String sessionId) {
        LOGGER.info("Select session id="+sessionId+" in data base");
        return sessionMapper.selectSession(sessionId);
    }
}
