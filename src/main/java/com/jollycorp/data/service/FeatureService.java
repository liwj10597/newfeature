package com.jollycorp.data.service;

public interface FeatureService {
    double calculate(int para);
    // jdk1.8支持接口通过default 实现方法
    default double sqrt(int para) {
        return Math.sqrt(para);
    }
}
