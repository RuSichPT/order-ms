package com.github.rusichpt.order.ms.services;

import com.github.rusichpt.order.ms.entities.Session;


public interface SessionService {
    Session select(String sessionId);
}
