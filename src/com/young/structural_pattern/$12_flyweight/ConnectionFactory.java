package com.young.structural_pattern.$12_flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @A-作者 young
 * @D-时间 2023-09-14 13:53
 * @E-邮箱 PlutoYcr520@outlook.com
 * * -
 * @S-描述 :
 * * - 享元工厂
 * * -
 */
public class ConnectionFactory {

    private Map<String, Connection> connectionPool = new HashMap<>();

    public Connection getConnection(String type) {
        if (!connectionPool.containsKey(type)) {
            connectionPool.put(type, new YoungConnection(type));
        }
        return connectionPool.get(type);
    }
}
