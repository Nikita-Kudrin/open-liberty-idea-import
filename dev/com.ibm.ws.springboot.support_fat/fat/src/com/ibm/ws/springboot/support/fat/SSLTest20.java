/*******************************************************************************
 * Copyright (c) 2018 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package com.ibm.ws.springboot.support.fat;

import static componenttest.custom.junit.runner.Mode.TestMode.FULL;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.junit.Test;
import org.junit.runner.RunWith;

import componenttest.custom.junit.runner.FATRunner;
import componenttest.custom.junit.runner.Mode;

@RunWith(FATRunner.class)
@Mode(FULL)
public class SSLTest20 extends SSLCommonTests {

    @Test
    public void testSSLSpringBootApplication20() throws Exception {
        testSSLApplication();
    }

    /*
     * (non-Javadoc)
     *
     * @see com.ibm.ws.springboot.support.fat.SSLCommonTests#getKeyStorePath()
     */
    @Override
    public String getKeyStorePath() {
        return null;
    }

    /*
     * (non-Javadoc)
     *
     * @see com.ibm.ws.springboot.support.fat.SSLCommonTests#getKeyStorePassword()
     */
    @Override
    public String getKeyStorePassword() {
        return null;
    }

    /*
     * (non-Javadoc)
     *
     * @see com.ibm.ws.springboot.support.fat.SSLCommonTests#getTrustStorePath()
     */
    @Override
    public String getTrustStorePath() {
        return null;
    }

    /*
     * (non-Javadoc)
     *
     * @see com.ibm.ws.springboot.support.fat.SSLCommonTests#getTrustStorePassword()
     */
    @Override
    public String getTrustStorePassword() {
        return null;
    }

    /*
     * (non-Javadoc)
     *
     * @see com.ibm.ws.springboot.support.fat.AbstractSpringTests#getFeatures()
     */
    @Override
    public Set<String> getFeatures() {
        return new HashSet<>(Arrays.asList("springBoot-2.0", "servlet-4.0", "ssl-1.0"));
    }

    /*
     * (non-Javadoc)
     *
     * @see com.ibm.ws.springboot.support.fat.AbstractSpringTests#getApplication()
     */
    @Override
    public String getApplication() {
        return SPRING_BOOT_20_APP_SSL;
    }
}