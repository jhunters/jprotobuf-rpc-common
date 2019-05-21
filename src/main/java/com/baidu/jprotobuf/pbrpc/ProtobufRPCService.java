/**
 * Copyright (C) 2017 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.jprotobuf.pbrpc;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * PbRPC definition annotation.
 * 
 * @author xiemalin
 * @since 1.0.0
 */
@Target({ ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ProtobufRPCService {

    /**
     * <pre>
     * The service name for protobuf RPC definition.
     * </pre>
     * 
     * @return the name of unique service in one publish server
     */
    String serviceName();

    /**
     * <pre>
     * The method name for protobuf RPC definition.
     * </pre>
     * 
     * @return the name of method
     */
    String methodName() default "";

    /**
     * RPC service description message. It used to generate documention.
     */
    String description() default "";
    
    /**
     * Run in async mode by memory queue. Once this tag active will return ASAP and blank response returned.
     *
     * @return true, if successful
     */
    boolean async() default false;

    /**
     * attachment handler
     * 
     * @return class instance of DummyAttachmentHandler
     */
    Class<? extends ServerAttachmentHandler> attachmentHandler() default DummyServerAttachmentHandler.class;

    /**
     * client authentication data handler
     */
    Class<? extends ServerAuthenticationDataHandler> authenticationDataHandler() 
        default DummyServerAuthenticationDataHandler.class;
}
