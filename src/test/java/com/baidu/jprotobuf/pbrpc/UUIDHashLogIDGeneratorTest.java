/**
 * Copyright 2014 the original author or authors.
 *
 * Licensed under the Baidu company (the "License");
 * you may not use this file except in compliance with the License.
 *
 */
package com.baidu.jprotobuf.pbrpc;

import java.util.HashSet;
import java.util.Set;

import junit.framework.Assert;

import org.junit.Test;

/**
 * Test class for {@link UUIDHashLogIDGenerator}
 *
 * @author xiemalin
 * @since 1.0
 */
public class UUIDHashLogIDGeneratorTest {

    @Test
    public void estLogIdGenerator() {
        
        LogIDGenerator logIDGenerator = new UUIDHashLogIDGenerator();
        int size = 10000;
        Set<Long> largeSet = new HashSet<Long>(size);
        
        for (int i = 0; i < size; i++) {
            long id = logIDGenerator.generate(null, null, new Object[0]);
            Assert.assertFalse(largeSet.contains(id));
            largeSet.add(id);
        }
        
    }
}
