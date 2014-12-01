/**
 * Copyright 2014 the original author or authors.
 *
 * Licensed under the Baidu company (the "License");
 * you may not use this file except in compliance with the License.
 *
 */
package com.baidu.jprotobuf.pbrpc;

/**
 * To holder current log id at server on accept data from client
 *
 * @author xiemalin
 * @since 1.1
 */
public class LogIDHolder {

    protected static final ThreadLocal<Long> CURRENT_LOGID = new ThreadLocal<Long>();

    /**
     * get the currentLogid
     * @return the currentLogid
     */
    public static ThreadLocal<Long> getCurrentLogid() {
        return CURRENT_LOGID;
    }
    
    public static void setCurrentLogid(long logId) {
        CURRENT_LOGID.set(logId);
    }
    
    public static void clearLogId() {
        CURRENT_LOGID.remove();
    }
}
