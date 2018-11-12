/**
 * Copyright 2014 the original author or authors.
 *
 * Licensed under the Baidu company (the "License");
 * you may not use this file except in compliance with the License.
 *
 */
package com.baidu.jprotobuf.pbrpc;

/**
 * The generator interface class for client to create authentication data for each RPC method invoking.
 *
 * @author xiemalin
 * @since 1.7
 * @see ProtobufRPC
 */
public interface AuthenticationDataHandler {

    /**
     * To create authenticate data for each RPC method invoking
     * 
     * @param serviceName the service name
     * @param methodName the method name
     * @param params method parameters
     * @return authentication data with byte array
     */
    byte[] create(String serviceName, String methodName, Object... params);
}
