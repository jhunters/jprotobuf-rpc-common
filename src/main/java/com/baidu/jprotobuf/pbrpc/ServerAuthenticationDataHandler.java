/**
 * Copyright 2014 the original author or authors.
 *
 * Licensed under the Baidu company (the "License");
 * you may not use this file except in compliance with the License.
 *
 */
package com.baidu.jprotobuf.pbrpc;

/**
 * The handler interface class for RPC server to check each authentication data for each RPC method invoking.
 *
 * @author xiemalin
 * @since 1.7
 * @see ProtobufRPC
 */
public interface ServerAuthenticationDataHandler {

    /**
     * To check authentication data for each RPC method invoking
     * 
     * @param authenticationData authentication data
     * @param serviceName the service name
     * @param methodName the method name
     * @param params method parameters
     */
    void handle(byte[] authenticationData, String serviceName, String methodName, Object... params);
}
