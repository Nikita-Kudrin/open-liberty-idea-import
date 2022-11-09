/*******************************************************************************
 * Copyright (c) 2020, 2022 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * IBM Corporation - initial API and implementation
 *******************************************************************************/
package io.openliberty.security.mp.jwt.v12.config.impl;

import java.util.Map;
import java.util.Optional;
import java.util.Set;

import org.eclipse.microprofile.config.Config;
import org.eclipse.microprofile.config.ConfigProvider;
import org.osgi.service.component.ComponentContext;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Modified;

import com.ibm.websphere.ras.Tr;
import com.ibm.websphere.ras.TraceComponent;
import com.ibm.ws.security.jwt.config.MpConfigProperties;
import com.ibm.ws.security.mp.jwt.MpConfigProxyService;

import io.openliberty.security.mp.jwt.v12.config.TraceConstants;

@Component(service = MpConfigProxyService.class, immediate = true, configurationPolicy = ConfigurationPolicy.IGNORE, property = { "service.vendor=IBM", "version=1.2", "service.ranking:Integer=12" }, name = "mpConfigProxyService")
public class MpConfigProxyServiceImpl implements MpConfigProxyService {

    public static final TraceComponent tc = Tr.register(MpConfigProxyServiceImpl.class, TraceConstants.TRACE_GROUP, TraceConstants.MESSAGE_BUNDLE);

    static private String MP_VERSION = "1.2";

    @Activate
    protected void activate(ComponentContext cc, Map<String, Object> props) {
        Tr.info(tc, "MPJWT_12_CONFIG_PROXY_PROCESSED");
    }

    @Modified
    protected void modified(ComponentContext cc, Map<String, Object> props) {
        Tr.info(tc, "MPJWT_12_CONFIG_PROXY_MODIFIED");
    }

    @Deactivate
    protected void deactivate(ComponentContext cc) {
        Tr.info(tc, "MPJWT_12_CONFIG_PROXY_DEACTIVATED");
    }

    @Override
    public String getVersion() {
        return MP_VERSION;
    }

    @Override
    public Set<String> getSupportedConfigPropertyNames() {
        return MpConfigProperties.acceptableMpConfigPropNames12;
    }

    @Override
    public MpConfigProxy getConfigProxy(ClassLoader cl) {
        Config config = cl != null ? ConfigProvider.getConfig(cl) : ConfigProvider.getConfig();

        return new MpConfigProxy() {
            @Override
            public <T> Optional<T> getOptionalValue(String propertyName, Class<T> propertyType) {
                return config.getOptionalValue(propertyName, propertyType);
            }
        };
    }
}
