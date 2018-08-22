/**
 * Copyright 2014 the original author or authors.
 *
 * Licensed under the Baidu company (the "License");
 * you may not use this file except in compliance with the License.
 *
 */
package com.baidu.jprotobuf.pbrpc;

/**
 * The generator interface class for each log ID generate.
 *
 * @author xiemalin
 * @since 1.7
 * @see ProtobufRPC
 */
public interface AuthenticationDataHandler {

    /**
     * To generate log id for each RPC method invoke
     * 
     * @param serviceName the service name
     * @param methodName the method name
     * @param params method params
     * @return authentication data with byte array
     */
    byte[] create(String serviceName, String methodName, Object... params);
}
