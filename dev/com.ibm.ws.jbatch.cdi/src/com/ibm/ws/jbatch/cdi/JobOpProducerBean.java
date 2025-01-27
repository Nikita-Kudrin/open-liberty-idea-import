/**
 * Copyright 2022 International Business Machines Corp.
 *
 * See the NOTICE file distributed with this work for additional information
 * regarding copyright ownership. Licensed under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.ibm.ws.jbatch.cdi;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import javax.batch.operations.JobOperator;
import javax.batch.runtime.BatchRuntime;
import javax.enterprise.context.Dependent;
import javax.enterprise.context.spi.CreationalContext;
import javax.enterprise.inject.Any;
import javax.enterprise.inject.Default;
import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.Bean;
import javax.enterprise.inject.spi.BeanManager;
import javax.enterprise.inject.spi.InjectionPoint;
import javax.enterprise.util.AnnotationLiteral;
import javax.enterprise.util.TypeLiteral;

public class JobOpProducerBean implements Bean<JobOperator> {
    
        private final Set<Type> types;
        private final Set<Annotation> qualifiers;
        private final String name;
        private final String id;

        public JobOpProducerBean(BeanManager beanManager) {

            final Set<Type> t = new HashSet<>();
            t.add(new TypeLiteral<JobOperator>() {}.getType());
            t.add(new TypeLiteral<Object>() {}.getType());
            types = Collections.unmodifiableSet(t);

            final Set<Annotation> q = new HashSet<Annotation>();
            q.add(new AnnotationLiteral<Any>() {});
            q.add(new AnnotationLiteral<Default>() {});
            qualifiers = Collections.unmodifiableSet(q);
            
            name = this.getClass().getName() + "@" + this.hashCode() + "[jakarta.batch.operations.JobOperator]";
            id = beanManager.hashCode() + "#" + this.name;
        }
    
        @Override
        public JobOperator create(CreationalContext creationalContext) {
            return BatchRuntime.getJobOperator();
        }

        @Override
        public void destroy(JobOperator instance, CreationalContext<JobOperator> creationalContext) {
        }
        
        @Override
        public Class<?> getBeanClass() {
            return JobOpProducerBean.class;
        }
        
        @Override
        public Set<InjectionPoint> getInjectionPoints() {
            return Collections.emptySet();
        }
        
        @Override
        public String getName() {
            return name;
        }
        
        @Override
        public Set<Annotation> getQualifiers() {
            return qualifiers;
        }
        
        @Override
        public Class<? extends Annotation> getScope() {
            return Dependent.class;
        }

        @Override
        public Set<Class<? extends Annotation>> getStereotypes() {
            return Collections.emptySet();
        }
        
        @Override
        public Set<Type> getTypes() {
            return types;
        }

        @Override
        public boolean isAlternative() {
            return false;
        }

        @Override
        public boolean isNullable() {
            return false;
        }
}
