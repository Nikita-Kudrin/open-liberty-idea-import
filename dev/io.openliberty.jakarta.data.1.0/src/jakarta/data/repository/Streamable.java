/*******************************************************************************
 * Copyright (c) 2022 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package jakarta.data.repository;

import java.util.stream.Stream;
import java.util.stream.StreamSupport;

/**
 * Method signatures copied from the Jakarta Data git repo.
 */
public interface Streamable<T> extends Iterable<T> {
    public default Stream<T> stream() {
        return StreamSupport.stream(this.spliterator(),
                                    false /* not parallel */);
    }
}
