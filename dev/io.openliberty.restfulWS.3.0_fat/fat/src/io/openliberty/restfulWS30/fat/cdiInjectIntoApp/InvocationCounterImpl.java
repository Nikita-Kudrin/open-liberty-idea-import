/*******************************************************************************
 * Copyright (c) 2021 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package io.openliberty.restfulWS30.fat.cdiInjectIntoApp;

import java.util.concurrent.atomic.AtomicInteger;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class InvocationCounterImpl implements InvocationCounter {

    AtomicInteger count = new AtomicInteger(0);

    @Override
    public int invoke() {
        return count.incrementAndGet();
    }

    @Override
    public int getInvocations() {
        return count.get();
    }
}