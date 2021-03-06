/*
 *  Copyright 2001-2014 Stephen Colebourne
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.joda.beans.impl.flexi;

import java.util.Map;
import java.util.Map.Entry;

import org.joda.beans.BeanBuilder;
import org.joda.beans.MetaProperty;

/**
 * Implementation of a meta-bean for {@code FlexiBean}.
 * 
 * @author Stephen Colebourne
 */
class FlexiBeanBuilder implements BeanBuilder<FlexiBean> {

    /**
     * The bean itself.
     */
    private final FlexiBean bean;

    /**
     * Creates the meta-bean.
     * 
     * @param bean  the underlying bean, not null
     */
    FlexiBeanBuilder(FlexiBean bean) {
        this.bean = bean;
    }

    //-----------------------------------------------------------------------
    @Override
    public Object get(String propertyName) {
        // lenient getter
        return bean.get(propertyName);
    }

    @Override
    public Object get(MetaProperty<?> metaProperty) {
        // this approach allows meta-property from one bean to be used with another
        return bean.get(metaProperty.name());
    }

    //-----------------------------------------------------------------------
    @Override
    public FlexiBeanBuilder set(String propertyName, Object value) {
        bean.put(propertyName, value);
        return this;
    }

    @Override
    public FlexiBeanBuilder set(MetaProperty<?> metaProperty, Object value) {
        // this approach allows meta-property from one bean to be used with another
        bean.put(metaProperty.name(), value);
        return this;
    }

    @Override
    public FlexiBeanBuilder setString(String propertyName, String value) {
        // no type information to perform a conversion
        bean.put(propertyName, value);
        return this;
    }

    @Override
    public FlexiBeanBuilder setString(MetaProperty<?> metaProperty, String value) {
        // no type information to perform a conversion
        // this approach allows meta-property from one FlexiBean to be used with another
        bean.put(metaProperty.name(), value);
        return this;
    }

    @Override
    public BeanBuilder<FlexiBean> setAll(Map<String, ? extends Object> propertyValueMap) {
        for (Entry<String, ? extends Object> entry : propertyValueMap.entrySet()) {
            bean.put(entry.getKey(), entry.getValue());
        }
        return this;
    }

    @Override
    public FlexiBean build() {
        return bean;
    }

    //-----------------------------------------------------------------------
    @Override
    public String toString() {
        return "FlexiBeanBuilder";
    }

}
