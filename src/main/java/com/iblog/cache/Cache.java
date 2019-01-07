package com.iblog.cache;

public interface Cache<K, V> {
    V getIfPresent(Object key);
}
