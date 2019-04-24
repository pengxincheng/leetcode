package com.pxc.leetcode.redis;

import redis.clients.jedis.JedisSentinelPool;

import java.util.HashSet;
import java.util.Set;

public class JedisClientDemo {

    public static void main(String[] args) {


        Set<String> hostAndPortSet = new HashSet<>();
        hostAndPortSet.add("192.168.11.117:26379");
        hostAndPortSet.add("192.168.11.119:26379");

        JedisSentinelPool jedisSentinelPool = new JedisSentinelPool("mymaster", hostAndPortSet);

        //jedisSentinelPool.getResource().set("hello", "world");

        System.out.println(jedisSentinelPool.getResource().get("hello"));

        jedisSentinelPool.destroy();

    }
}
