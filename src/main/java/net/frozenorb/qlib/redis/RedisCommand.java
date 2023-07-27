package net.frozenorb.qlib.redis;

import redis.clients.jedis.Jedis;

public interface RedisCommand<T> {

    T execute(Jedis var1);

}

