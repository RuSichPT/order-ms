package com.github.rusichpt.order.ms.service;

import com.github.rusichpt.order.ms.entity.Session;


public interface SessionService {
    Session select(String sessionId);
}
