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
package org.joda.beans.gen;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

import org.joda.beans.Bean;
import org.joda.beans.BeanDefinition;
import org.joda.beans.ImmutableBean;
import org.joda.beans.JodaBeanUtils;
import org.joda.beans.MetaProperty;
import org.joda.beans.Property;
import org.joda.beans.PropertyDefinition;
import org.joda.beans.impl.direct.DirectFieldsBeanBuilder;
import org.joda.beans.impl.direct.DirectMetaBean;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.joda.beans.impl.direct.DirectMetaPropertyMap;

import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableListMultimap;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.ImmutableMultiset;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSetMultimap;
import com.google.common.collect.ImmutableSortedMap;
import com.google.common.collect.ImmutableSortedMultiset;
import com.google.common.collect.ImmutableSortedSet;
import com.google.common.collect.ListMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.Multiset;
import com.google.common.collect.SetMultimap;
import com.google.common.collect.SortedMultiset;

/**
 * Mock JavaBean, used for testing.
 * 
 * @author Stephen Colebourne
 */
@BeanDefinition(builderScope = "public")
public final class ImmGuava<T extends Comparable<T>> implements ImmutableBean {

    @PropertyDefinition(validate = "notNull")
    private final ImmutableCollection<T> collection;
    @PropertyDefinition(validate = "notNull")
    private final ImmutableList<T> list;
    @PropertyDefinition(validate = "notNull")
    private final ImmutableSet<T> set;
    @PropertyDefinition(validate = "notNull")
    private final ImmutableSortedSet<T> sortedSet;
    @PropertyDefinition(validate = "notNull")
    private final ImmutableMap<T, String> map;
    @PropertyDefinition(validate = "notNull")
    private final ImmutableSortedMap<T, String> sortedMap;

    @PropertyDefinition(validate = "notNull")
    private final ImmutableBiMap<T, String> biMap;
    @PropertyDefinition(validate = "notNull")
    private final ImmutableMultimap<T, String> multimap;
    @PropertyDefinition(validate = "notNull")
    private final ImmutableListMultimap<T, String> listMultimap;
    @PropertyDefinition(validate = "notNull")
    private final ImmutableSetMultimap<T, String> setMultimap;
    @PropertyDefinition(validate = "notNull")
    private final ImmutableMultiset<T> multiset;
    @PropertyDefinition(validate = "notNull")
    private final ImmutableSortedMultiset<T> sortedMultiset;

    @PropertyDefinition(validate = "notNull")
    private final Collection<T> collectionInterface;
    @PropertyDefinition(validate = "notNull")
    private final List<T> listInterface;
    @PropertyDefinition(validate = "notNull")
    private final Set<T> setInterface;
    @PropertyDefinition(validate = "notNull")
    private final SortedSet<T> sortedSetInterface;
    @PropertyDefinition(validate = "notNull")
    private final Map<T, String> mapInterface;
    @PropertyDefinition(validate = "notNull")
    private final SortedMap<T, String> sortedMapInterface;

    @PropertyDefinition(validate = "notNull")
    private final BiMap<T, String> biMapInterface;
    @PropertyDefinition(validate = "notNull")
    private final Multimap<T, String> multimapInterface;
    @PropertyDefinition(validate = "notNull")
    private final ListMultimap<T, String> listMultimapInterface;
    @PropertyDefinition(validate = "notNull")
    private final SetMultimap<T, String> setMultimapInterface;
    @PropertyDefinition(validate = "notNull")
    private final Multiset<T> multisetInterface;
    @PropertyDefinition(validate = "notNull")
    private final SortedMultiset<T> sortedMultisetInterface;

//    @PropertyDefinition(validate = "notNull")
//    private final ArrayListMultimap<T, String> listMultimapArray;
//    @PropertyDefinition(validate = "notNull")
//    private final LinkedListMultimap<T, String> listMultimapLinked;
//    @PropertyDefinition(validate = "notNull")
//    private final HashMultimap<T, String> setMultimapHash;
//    @PropertyDefinition(validate = "notNull")
//    private final LinkedHashMultimap<T, String> setMultimapLinkedHash;

    //------------------------- AUTOGENERATED START -------------------------
    ///CLOVER:OFF
    /**
     * The meta-bean for {@code ImmGuava}.
     * @return the meta-bean, not null
     */
    @SuppressWarnings("rawtypes")
    public static ImmGuava.Meta meta() {
        return ImmGuava.Meta.INSTANCE;
    }

    /**
     * The meta-bean for {@code ImmGuava}.
     * @param <R>  the bean's generic type
     * @param cls  the bean's generic type
     * @return the meta-bean, not null
     */
    @SuppressWarnings("unchecked")
    public static <R extends Comparable<R>> ImmGuava.Meta<R> metaImmGuava(Class<R> cls) {
        return ImmGuava.Meta.INSTANCE;
    }

    static {
        JodaBeanUtils.registerMetaBean(ImmGuava.Meta.INSTANCE);
    }

    /**
     * Returns a builder used to create an instance of the bean.
     * @param <T>  the type
     * @return the builder, not null
     */
    public static <T extends Comparable<T>> ImmGuava.Builder<T> builder() {
        return new ImmGuava.Builder<T>();
    }

    private ImmGuava(
            Collection<T> collection,
            List<T> list,
            Set<T> set,
            SortedSet<T> sortedSet,
            Map<T, String> map,
            SortedMap<T, String> sortedMap,
            BiMap<T, String> biMap,
            Multimap<T, String> multimap,
            ListMultimap<T, String> listMultimap,
            SetMultimap<T, String> setMultimap,
            Multiset<T> multiset,
            SortedMultiset<T> sortedMultiset,
            Collection<T> collectionInterface,
            List<T> listInterface,
            Set<T> setInterface,
            SortedSet<T> sortedSetInterface,
            Map<T, String> mapInterface,
            SortedMap<T, String> sortedMapInterface,
            BiMap<T, String> biMapInterface,
            Multimap<T, String> multimapInterface,
            ListMultimap<T, String> listMultimapInterface,
            SetMultimap<T, String> setMultimapInterface,
            Multiset<T> multisetInterface,
            SortedMultiset<T> sortedMultisetInterface) {
        JodaBeanUtils.notNull(collection, "collection");
        JodaBeanUtils.notNull(list, "list");
        JodaBeanUtils.notNull(set, "set");
        JodaBeanUtils.notNull(sortedSet, "sortedSet");
        JodaBeanUtils.notNull(map, "map");
        JodaBeanUtils.notNull(sortedMap, "sortedMap");
        JodaBeanUtils.notNull(biMap, "biMap");
        JodaBeanUtils.notNull(multimap, "multimap");
        JodaBeanUtils.notNull(listMultimap, "listMultimap");
        JodaBeanUtils.notNull(setMultimap, "setMultimap");
        JodaBeanUtils.notNull(multiset, "multiset");
        JodaBeanUtils.notNull(sortedMultiset, "sortedMultiset");
        JodaBeanUtils.notNull(collectionInterface, "collectionInterface");
        JodaBeanUtils.notNull(listInterface, "listInterface");
        JodaBeanUtils.notNull(setInterface, "setInterface");
        JodaBeanUtils.notNull(sortedSetInterface, "sortedSetInterface");
        JodaBeanUtils.notNull(mapInterface, "mapInterface");
        JodaBeanUtils.notNull(sortedMapInterface, "sortedMapInterface");
        JodaBeanUtils.notNull(biMapInterface, "biMapInterface");
        JodaBeanUtils.notNull(multimapInterface, "multimapInterface");
        JodaBeanUtils.notNull(listMultimapInterface, "listMultimapInterface");
        JodaBeanUtils.notNull(setMultimapInterface, "setMultimapInterface");
        JodaBeanUtils.notNull(multisetInterface, "multisetInterface");
        JodaBeanUtils.notNull(sortedMultisetInterface, "sortedMultisetInterface");
        this.collection = ImmutableList.copyOf(collection);
        this.list = ImmutableList.copyOf(list);
        this.set = ImmutableSet.copyOf(set);
        this.sortedSet = ImmutableSortedSet.copyOfSorted(sortedSet);
        this.map = ImmutableMap.copyOf(map);
        this.sortedMap = ImmutableSortedMap.copyOfSorted(sortedMap);
        this.biMap = ImmutableBiMap.copyOf(biMap);
        this.multimap = ImmutableMultimap.copyOf(multimap);
        this.listMultimap = ImmutableListMultimap.copyOf(listMultimap);
        this.setMultimap = ImmutableSetMultimap.copyOf(setMultimap);
        this.multiset = ImmutableMultiset.copyOf(multiset);
        this.sortedMultiset = ImmutableSortedMultiset.copyOfSorted(sortedMultiset);
        this.collectionInterface = ImmutableList.copyOf(collectionInterface);
        this.listInterface = ImmutableList.copyOf(listInterface);
        this.setInterface = ImmutableSet.copyOf(setInterface);
        this.sortedSetInterface = ImmutableSortedSet.copyOfSorted(sortedSetInterface);
        this.mapInterface = ImmutableMap.copyOf(mapInterface);
        this.sortedMapInterface = ImmutableSortedMap.copyOfSorted(sortedMapInterface);
        this.biMapInterface = ImmutableBiMap.copyOf(biMapInterface);
        this.multimapInterface = ImmutableMultimap.copyOf(multimapInterface);
        this.listMultimapInterface = ImmutableListMultimap.copyOf(listMultimapInterface);
        this.setMultimapInterface = ImmutableSetMultimap.copyOf(setMultimapInterface);
        this.multisetInterface = ImmutableMultiset.copyOf(multisetInterface);
        this.sortedMultisetInterface = ImmutableSortedMultiset.copyOfSorted(sortedMultisetInterface);
    }

    @SuppressWarnings("unchecked")
    @Override
    public ImmGuava.Meta<T> metaBean() {
        return ImmGuava.Meta.INSTANCE;
    }

    @Override
    public <R> Property<R> property(String propertyName) {
        return metaBean().<R>metaProperty(propertyName).createProperty(this);
    }

    @Override
    public Set<String> propertyNames() {
        return metaBean().metaPropertyMap().keySet();
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the collection.
     * @return the value of the property, not null
     */
    public ImmutableCollection<T> getCollection() {
        return collection;
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the list.
     * @return the value of the property, not null
     */
    public ImmutableList<T> getList() {
        return list;
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the set.
     * @return the value of the property, not null
     */
    public ImmutableSet<T> getSet() {
        return set;
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the sortedSet.
     * @return the value of the property, not null
     */
    public ImmutableSortedSet<T> getSortedSet() {
        return sortedSet;
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the map.
     * @return the value of the property, not null
     */
    public ImmutableMap<T, String> getMap() {
        return map;
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the sortedMap.
     * @return the value of the property, not null
     */
    public ImmutableSortedMap<T, String> getSortedMap() {
        return sortedMap;
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the biMap.
     * @return the value of the property, not null
     */
    public ImmutableBiMap<T, String> getBiMap() {
        return biMap;
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the multimap.
     * @return the value of the property, not null
     */
    public ImmutableMultimap<T, String> getMultimap() {
        return multimap;
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the listMultimap.
     * @return the value of the property, not null
     */
    public ImmutableListMultimap<T, String> getListMultimap() {
        return listMultimap;
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the setMultimap.
     * @return the value of the property, not null
     */
    public ImmutableSetMultimap<T, String> getSetMultimap() {
        return setMultimap;
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the multiset.
     * @return the value of the property, not null
     */
    public ImmutableMultiset<T> getMultiset() {
        return multiset;
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the sortedMultiset.
     * @return the value of the property, not null
     */
    public ImmutableSortedMultiset<T> getSortedMultiset() {
        return sortedMultiset;
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the collectionInterface.
     * @return the value of the property, not null
     */
    public Collection<T> getCollectionInterface() {
        return collectionInterface;
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the listInterface.
     * @return the value of the property, not null
     */
    public List<T> getListInterface() {
        return listInterface;
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the setInterface.
     * @return the value of the property, not null
     */
    public Set<T> getSetInterface() {
        return setInterface;
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the sortedSetInterface.
     * @return the value of the property, not null
     */
    public SortedSet<T> getSortedSetInterface() {
        return sortedSetInterface;
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the mapInterface.
     * @return the value of the property, not null
     */
    public Map<T, String> getMapInterface() {
        return mapInterface;
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the sortedMapInterface.
     * @return the value of the property, not null
     */
    public SortedMap<T, String> getSortedMapInterface() {
        return sortedMapInterface;
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the biMapInterface.
     * @return the value of the property, not null
     */
    public BiMap<T, String> getBiMapInterface() {
        return biMapInterface;
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the multimapInterface.
     * @return the value of the property, not null
     */
    public Multimap<T, String> getMultimapInterface() {
        return multimapInterface;
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the listMultimapInterface.
     * @return the value of the property, not null
     */
    public ListMultimap<T, String> getListMultimapInterface() {
        return listMultimapInterface;
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the setMultimapInterface.
     * @return the value of the property, not null
     */
    public SetMultimap<T, String> getSetMultimapInterface() {
        return setMultimapInterface;
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the multisetInterface.
     * @return the value of the property, not null
     */
    public Multiset<T> getMultisetInterface() {
        return multisetInterface;
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the sortedMultisetInterface.
     * @return the value of the property, not null
     */
    public SortedMultiset<T> getSortedMultisetInterface() {
        return sortedMultisetInterface;
    }

    //-----------------------------------------------------------------------
    /**
     * Returns a builder that allows this bean to be mutated.
     * @return the mutable builder, not null
     */
    public Builder<T> toBuilder() {
        return new Builder<T>(this);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == this.getClass()) {
            ImmGuava<?> other = (ImmGuava<?>) obj;
            return JodaBeanUtils.equal(getCollection(), other.getCollection()) &&
                    JodaBeanUtils.equal(getList(), other.getList()) &&
                    JodaBeanUtils.equal(getSet(), other.getSet()) &&
                    JodaBeanUtils.equal(getSortedSet(), other.getSortedSet()) &&
                    JodaBeanUtils.equal(getMap(), other.getMap()) &&
                    JodaBeanUtils.equal(getSortedMap(), other.getSortedMap()) &&
                    JodaBeanUtils.equal(getBiMap(), other.getBiMap()) &&
                    JodaBeanUtils.equal(getMultimap(), other.getMultimap()) &&
                    JodaBeanUtils.equal(getListMultimap(), other.getListMultimap()) &&
                    JodaBeanUtils.equal(getSetMultimap(), other.getSetMultimap()) &&
                    JodaBeanUtils.equal(getMultiset(), other.getMultiset()) &&
                    JodaBeanUtils.equal(getSortedMultiset(), other.getSortedMultiset()) &&
                    JodaBeanUtils.equal(getCollectionInterface(), other.getCollectionInterface()) &&
                    JodaBeanUtils.equal(getListInterface(), other.getListInterface()) &&
                    JodaBeanUtils.equal(getSetInterface(), other.getSetInterface()) &&
                    JodaBeanUtils.equal(getSortedSetInterface(), other.getSortedSetInterface()) &&
                    JodaBeanUtils.equal(getMapInterface(), other.getMapInterface()) &&
                    JodaBeanUtils.equal(getSortedMapInterface(), other.getSortedMapInterface()) &&
                    JodaBeanUtils.equal(getBiMapInterface(), other.getBiMapInterface()) &&
                    JodaBeanUtils.equal(getMultimapInterface(), other.getMultimapInterface()) &&
                    JodaBeanUtils.equal(getListMultimapInterface(), other.getListMultimapInterface()) &&
                    JodaBeanUtils.equal(getSetMultimapInterface(), other.getSetMultimapInterface()) &&
                    JodaBeanUtils.equal(getMultisetInterface(), other.getMultisetInterface()) &&
                    JodaBeanUtils.equal(getSortedMultisetInterface(), other.getSortedMultisetInterface());
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = getClass().hashCode();
        hash = hash * 31 + JodaBeanUtils.hashCode(getCollection());
        hash = hash * 31 + JodaBeanUtils.hashCode(getList());
        hash = hash * 31 + JodaBeanUtils.hashCode(getSet());
        hash = hash * 31 + JodaBeanUtils.hashCode(getSortedSet());
        hash = hash * 31 + JodaBeanUtils.hashCode(getMap());
        hash = hash * 31 + JodaBeanUtils.hashCode(getSortedMap());
        hash = hash * 31 + JodaBeanUtils.hashCode(getBiMap());
        hash = hash * 31 + JodaBeanUtils.hashCode(getMultimap());
        hash = hash * 31 + JodaBeanUtils.hashCode(getListMultimap());
        hash = hash * 31 + JodaBeanUtils.hashCode(getSetMultimap());
        hash = hash * 31 + JodaBeanUtils.hashCode(getMultiset());
        hash = hash * 31 + JodaBeanUtils.hashCode(getSortedMultiset());
        hash = hash * 31 + JodaBeanUtils.hashCode(getCollectionInterface());
        hash = hash * 31 + JodaBeanUtils.hashCode(getListInterface());
        hash = hash * 31 + JodaBeanUtils.hashCode(getSetInterface());
        hash = hash * 31 + JodaBeanUtils.hashCode(getSortedSetInterface());
        hash = hash * 31 + JodaBeanUtils.hashCode(getMapInterface());
        hash = hash * 31 + JodaBeanUtils.hashCode(getSortedMapInterface());
        hash = hash * 31 + JodaBeanUtils.hashCode(getBiMapInterface());
        hash = hash * 31 + JodaBeanUtils.hashCode(getMultimapInterface());
        hash = hash * 31 + JodaBeanUtils.hashCode(getListMultimapInterface());
        hash = hash * 31 + JodaBeanUtils.hashCode(getSetMultimapInterface());
        hash = hash * 31 + JodaBeanUtils.hashCode(getMultisetInterface());
        hash = hash * 31 + JodaBeanUtils.hashCode(getSortedMultisetInterface());
        return hash;
    }

    @Override
    public String toString() {
        StringBuilder buf = new StringBuilder(800);
        buf.append("ImmGuava{");
        buf.append("collection").append('=').append(getCollection()).append(',').append(' ');
        buf.append("list").append('=').append(getList()).append(',').append(' ');
        buf.append("set").append('=').append(getSet()).append(',').append(' ');
        buf.append("sortedSet").append('=').append(getSortedSet()).append(',').append(' ');
        buf.append("map").append('=').append(getMap()).append(',').append(' ');
        buf.append("sortedMap").append('=').append(getSortedMap()).append(',').append(' ');
        buf.append("biMap").append('=').append(getBiMap()).append(',').append(' ');
        buf.append("multimap").append('=').append(getMultimap()).append(',').append(' ');
        buf.append("listMultimap").append('=').append(getListMultimap()).append(',').append(' ');
        buf.append("setMultimap").append('=').append(getSetMultimap()).append(',').append(' ');
        buf.append("multiset").append('=').append(getMultiset()).append(',').append(' ');
        buf.append("sortedMultiset").append('=').append(getSortedMultiset()).append(',').append(' ');
        buf.append("collectionInterface").append('=').append(getCollectionInterface()).append(',').append(' ');
        buf.append("listInterface").append('=').append(getListInterface()).append(',').append(' ');
        buf.append("setInterface").append('=').append(getSetInterface()).append(',').append(' ');
        buf.append("sortedSetInterface").append('=').append(getSortedSetInterface()).append(',').append(' ');
        buf.append("mapInterface").append('=').append(getMapInterface()).append(',').append(' ');
        buf.append("sortedMapInterface").append('=').append(getSortedMapInterface()).append(',').append(' ');
        buf.append("biMapInterface").append('=').append(getBiMapInterface()).append(',').append(' ');
        buf.append("multimapInterface").append('=').append(getMultimapInterface()).append(',').append(' ');
        buf.append("listMultimapInterface").append('=').append(getListMultimapInterface()).append(',').append(' ');
        buf.append("setMultimapInterface").append('=').append(getSetMultimapInterface()).append(',').append(' ');
        buf.append("multisetInterface").append('=').append(getMultisetInterface()).append(',').append(' ');
        buf.append("sortedMultisetInterface").append('=').append(JodaBeanUtils.toString(getSortedMultisetInterface()));
        buf.append('}');
        return buf.toString();
    }

    //-----------------------------------------------------------------------
    /**
     * The meta-bean for {@code ImmGuava}.
     * @param <T>  the type
     */
    public static final class Meta<T extends Comparable<T>> extends DirectMetaBean {
        /**
         * The singleton instance of the meta-bean.
         */
        @SuppressWarnings("rawtypes")
        static final Meta INSTANCE = new Meta();

        /**
         * The meta-property for the {@code collection} property.
         */
        @SuppressWarnings({"unchecked", "rawtypes" })
        private final MetaProperty<ImmutableCollection<T>> collection = DirectMetaProperty.ofImmutable(
                this, "collection", ImmGuava.class, (Class) ImmutableCollection.class);
        /**
         * The meta-property for the {@code list} property.
         */
        @SuppressWarnings({"unchecked", "rawtypes" })
        private final MetaProperty<ImmutableList<T>> list = DirectMetaProperty.ofImmutable(
                this, "list", ImmGuava.class, (Class) ImmutableList.class);
        /**
         * The meta-property for the {@code set} property.
         */
        @SuppressWarnings({"unchecked", "rawtypes" })
        private final MetaProperty<ImmutableSet<T>> set = DirectMetaProperty.ofImmutable(
                this, "set", ImmGuava.class, (Class) ImmutableSet.class);
        /**
         * The meta-property for the {@code sortedSet} property.
         */
        @SuppressWarnings({"unchecked", "rawtypes" })
        private final MetaProperty<ImmutableSortedSet<T>> sortedSet = DirectMetaProperty.ofImmutable(
                this, "sortedSet", ImmGuava.class, (Class) ImmutableSortedSet.class);
        /**
         * The meta-property for the {@code map} property.
         */
        @SuppressWarnings({"unchecked", "rawtypes" })
        private final MetaProperty<ImmutableMap<T, String>> map = DirectMetaProperty.ofImmutable(
                this, "map", ImmGuava.class, (Class) ImmutableMap.class);
        /**
         * The meta-property for the {@code sortedMap} property.
         */
        @SuppressWarnings({"unchecked", "rawtypes" })
        private final MetaProperty<ImmutableSortedMap<T, String>> sortedMap = DirectMetaProperty.ofImmutable(
                this, "sortedMap", ImmGuava.class, (Class) ImmutableSortedMap.class);
        /**
         * The meta-property for the {@code biMap} property.
         */
        @SuppressWarnings({"unchecked", "rawtypes" })
        private final MetaProperty<ImmutableBiMap<T, String>> biMap = DirectMetaProperty.ofImmutable(
                this, "biMap", ImmGuava.class, (Class) ImmutableBiMap.class);
        /**
         * The meta-property for the {@code multimap} property.
         */
        @SuppressWarnings({"unchecked", "rawtypes" })
        private final MetaProperty<ImmutableMultimap<T, String>> multimap = DirectMetaProperty.ofImmutable(
                this, "multimap", ImmGuava.class, (Class) ImmutableMultimap.class);
        /**
         * The meta-property for the {@code listMultimap} property.
         */
        @SuppressWarnings({"unchecked", "rawtypes" })
        private final MetaProperty<ImmutableListMultimap<T, String>> listMultimap = DirectMetaProperty.ofImmutable(
                this, "listMultimap", ImmGuava.class, (Class) ImmutableListMultimap.class);
        /**
         * The meta-property for the {@code setMultimap} property.
         */
        @SuppressWarnings({"unchecked", "rawtypes" })
        private final MetaProperty<ImmutableSetMultimap<T, String>> setMultimap = DirectMetaProperty.ofImmutable(
                this, "setMultimap", ImmGuava.class, (Class) ImmutableSetMultimap.class);
        /**
         * The meta-property for the {@code multiset} property.
         */
        @SuppressWarnings({"unchecked", "rawtypes" })
        private final MetaProperty<ImmutableMultiset<T>> multiset = DirectMetaProperty.ofImmutable(
                this, "multiset", ImmGuava.class, (Class) ImmutableMultiset.class);
        /**
         * The meta-property for the {@code sortedMultiset} property.
         */
        @SuppressWarnings({"unchecked", "rawtypes" })
        private final MetaProperty<ImmutableSortedMultiset<T>> sortedMultiset = DirectMetaProperty.ofImmutable(
                this, "sortedMultiset", ImmGuava.class, (Class) ImmutableSortedMultiset.class);
        /**
         * The meta-property for the {@code collectionInterface} property.
         */
        @SuppressWarnings({"unchecked", "rawtypes" })
        private final MetaProperty<Collection<T>> collectionInterface = DirectMetaProperty.ofImmutable(
                this, "collectionInterface", ImmGuava.class, (Class) Collection.class);
        /**
         * The meta-property for the {@code listInterface} property.
         */
        @SuppressWarnings({"unchecked", "rawtypes" })
        private final MetaProperty<List<T>> listInterface = DirectMetaProperty.ofImmutable(
                this, "listInterface", ImmGuava.class, (Class) List.class);
        /**
         * The meta-property for the {@code setInterface} property.
         */
        @SuppressWarnings({"unchecked", "rawtypes" })
        private final MetaProperty<Set<T>> setInterface = DirectMetaProperty.ofImmutable(
                this, "setInterface", ImmGuava.class, (Class) Set.class);
        /**
         * The meta-property for the {@code sortedSetInterface} property.
         */
        @SuppressWarnings({"unchecked", "rawtypes" })
        private final MetaProperty<SortedSet<T>> sortedSetInterface = DirectMetaProperty.ofImmutable(
                this, "sortedSetInterface", ImmGuava.class, (Class) SortedSet.class);
        /**
         * The meta-property for the {@code mapInterface} property.
         */
        @SuppressWarnings({"unchecked", "rawtypes" })
        private final MetaProperty<Map<T, String>> mapInterface = DirectMetaProperty.ofImmutable(
                this, "mapInterface", ImmGuava.class, (Class) Map.class);
        /**
         * The meta-property for the {@code sortedMapInterface} property.
         */
        @SuppressWarnings({"unchecked", "rawtypes" })
        private final MetaProperty<SortedMap<T, String>> sortedMapInterface = DirectMetaProperty.ofImmutable(
                this, "sortedMapInterface", ImmGuava.class, (Class) SortedMap.class);
        /**
         * The meta-property for the {@code biMapInterface} property.
         */
        @SuppressWarnings({"unchecked", "rawtypes" })
        private final MetaProperty<BiMap<T, String>> biMapInterface = DirectMetaProperty.ofImmutable(
                this, "biMapInterface", ImmGuava.class, (Class) BiMap.class);
        /**
         * The meta-property for the {@code multimapInterface} property.
         */
        @SuppressWarnings({"unchecked", "rawtypes" })
        private final MetaProperty<Multimap<T, String>> multimapInterface = DirectMetaProperty.ofImmutable(
                this, "multimapInterface", ImmGuava.class, (Class) Multimap.class);
        /**
         * The meta-property for the {@code listMultimapInterface} property.
         */
        @SuppressWarnings({"unchecked", "rawtypes" })
        private final MetaProperty<ListMultimap<T, String>> listMultimapInterface = DirectMetaProperty.ofImmutable(
                this, "listMultimapInterface", ImmGuava.class, (Class) ListMultimap.class);
        /**
         * The meta-property for the {@code setMultimapInterface} property.
         */
        @SuppressWarnings({"unchecked", "rawtypes" })
        private final MetaProperty<SetMultimap<T, String>> setMultimapInterface = DirectMetaProperty.ofImmutable(
                this, "setMultimapInterface", ImmGuava.class, (Class) SetMultimap.class);
        /**
         * The meta-property for the {@code multisetInterface} property.
         */
        @SuppressWarnings({"unchecked", "rawtypes" })
        private final MetaProperty<Multiset<T>> multisetInterface = DirectMetaProperty.ofImmutable(
                this, "multisetInterface", ImmGuava.class, (Class) Multiset.class);
        /**
         * The meta-property for the {@code sortedMultisetInterface} property.
         */
        @SuppressWarnings({"unchecked", "rawtypes" })
        private final MetaProperty<SortedMultiset<T>> sortedMultisetInterface = DirectMetaProperty.ofImmutable(
                this, "sortedMultisetInterface", ImmGuava.class, (Class) SortedMultiset.class);
        /**
         * The meta-properties.
         */
        private final Map<String, MetaProperty<?>> metaPropertyMap$ = new DirectMetaPropertyMap(
                this, null,
                "collection",
                "list",
                "set",
                "sortedSet",
                "map",
                "sortedMap",
                "biMap",
                "multimap",
                "listMultimap",
                "setMultimap",
                "multiset",
                "sortedMultiset",
                "collectionInterface",
                "listInterface",
                "setInterface",
                "sortedSetInterface",
                "mapInterface",
                "sortedMapInterface",
                "biMapInterface",
                "multimapInterface",
                "listMultimapInterface",
                "setMultimapInterface",
                "multisetInterface",
                "sortedMultisetInterface");

        /**
         * Restricted constructor.
         */
        private Meta() {
        }

        @Override
        protected MetaProperty<?> metaPropertyGet(String propertyName) {
            switch (propertyName.hashCode()) {
                case -1741312354:  // collection
                    return collection;
                case 3322014:  // list
                    return list;
                case 113762:  // set
                    return set;
                case -6890395:  // sortedSet
                    return sortedSet;
                case 107868:  // map
                    return map;
                case -6896289:  // sortedMap
                    return sortedMap;
                case 93710229:  // biMap
                    return biMap;
                case 653826435:  // multimap
                    return multimap;
                case 1737633857:  // listMultimap
                    return listMultimap;
                case -1651820539:  // setMultimap
                    return setMultimap;
                case 653832329:  // multiset
                    return multiset;
                case 1018567270:  // sortedMultiset
                    return sortedMultiset;
                case 420048955:  // collectionInterface
                    return collectionInterface;
                case -259084741:  // listInterface
                    return listInterface;
                case 2042011383:  // setInterface
                    return setInterface;
                case 1019335252:  // sortedSetInterface
                    return sortedSetInterface;
                case 651439933:  // mapInterface
                    return mapInterface;
                case -371236198:  // sortedMapInterface
                    return sortedMapInterface;
                case 2068077860:  // biMapInterface
                    return biMapInterface;
                case -1415579914:  // multimapInterface
                    return multimapInterface;
                case 1576080888:  // listMultimapInterface
                    return listMultimapInterface;
                case -630551884:  // setMultimapInterface
                    return setMultimapInterface;
                case -25008464:  // multisetInterface
                    return multisetInterface;
                case 271697267:  // sortedMultisetInterface
                    return sortedMultisetInterface;
            }
            return super.metaPropertyGet(propertyName);
        }

        @Override
        public ImmGuava.Builder<T> builder() {
            return new ImmGuava.Builder<T>();
        }

        @SuppressWarnings({"unchecked", "rawtypes" })
        @Override
        public Class<? extends ImmGuava<T>> beanType() {
            return (Class) ImmGuava.class;
        }

        @Override
        public Map<String, MetaProperty<?>> metaPropertyMap() {
            return metaPropertyMap$;
        }

        //-----------------------------------------------------------------------
        /**
         * The meta-property for the {@code collection} property.
         * @return the meta-property, not null
         */
        public MetaProperty<ImmutableCollection<T>> collection() {
            return collection;
        }

        /**
         * The meta-property for the {@code list} property.
         * @return the meta-property, not null
         */
        public MetaProperty<ImmutableList<T>> list() {
            return list;
        }

        /**
         * The meta-property for the {@code set} property.
         * @return the meta-property, not null
         */
        public MetaProperty<ImmutableSet<T>> set() {
            return set;
        }

        /**
         * The meta-property for the {@code sortedSet} property.
         * @return the meta-property, not null
         */
        public MetaProperty<ImmutableSortedSet<T>> sortedSet() {
            return sortedSet;
        }

        /**
         * The meta-property for the {@code map} property.
         * @return the meta-property, not null
         */
        public MetaProperty<ImmutableMap<T, String>> map() {
            return map;
        }

        /**
         * The meta-property for the {@code sortedMap} property.
         * @return the meta-property, not null
         */
        public MetaProperty<ImmutableSortedMap<T, String>> sortedMap() {
            return sortedMap;
        }

        /**
         * The meta-property for the {@code biMap} property.
         * @return the meta-property, not null
         */
        public MetaProperty<ImmutableBiMap<T, String>> biMap() {
            return biMap;
        }

        /**
         * The meta-property for the {@code multimap} property.
         * @return the meta-property, not null
         */
        public MetaProperty<ImmutableMultimap<T, String>> multimap() {
            return multimap;
        }

        /**
         * The meta-property for the {@code listMultimap} property.
         * @return the meta-property, not null
         */
        public MetaProperty<ImmutableListMultimap<T, String>> listMultimap() {
            return listMultimap;
        }

        /**
         * The meta-property for the {@code setMultimap} property.
         * @return the meta-property, not null
         */
        public MetaProperty<ImmutableSetMultimap<T, String>> setMultimap() {
            return setMultimap;
        }

        /**
         * The meta-property for the {@code multiset} property.
         * @return the meta-property, not null
         */
        public MetaProperty<ImmutableMultiset<T>> multiset() {
            return multiset;
        }

        /**
         * The meta-property for the {@code sortedMultiset} property.
         * @return the meta-property, not null
         */
        public MetaProperty<ImmutableSortedMultiset<T>> sortedMultiset() {
            return sortedMultiset;
        }

        /**
         * The meta-property for the {@code collectionInterface} property.
         * @return the meta-property, not null
         */
        public MetaProperty<Collection<T>> collectionInterface() {
            return collectionInterface;
        }

        /**
         * The meta-property for the {@code listInterface} property.
         * @return the meta-property, not null
         */
        public MetaProperty<List<T>> listInterface() {
            return listInterface;
        }

        /**
         * The meta-property for the {@code setInterface} property.
         * @return the meta-property, not null
         */
        public MetaProperty<Set<T>> setInterface() {
            return setInterface;
        }

        /**
         * The meta-property for the {@code sortedSetInterface} property.
         * @return the meta-property, not null
         */
        public MetaProperty<SortedSet<T>> sortedSetInterface() {
            return sortedSetInterface;
        }

        /**
         * The meta-property for the {@code mapInterface} property.
         * @return the meta-property, not null
         */
        public MetaProperty<Map<T, String>> mapInterface() {
            return mapInterface;
        }

        /**
         * The meta-property for the {@code sortedMapInterface} property.
         * @return the meta-property, not null
         */
        public MetaProperty<SortedMap<T, String>> sortedMapInterface() {
            return sortedMapInterface;
        }

        /**
         * The meta-property for the {@code biMapInterface} property.
         * @return the meta-property, not null
         */
        public MetaProperty<BiMap<T, String>> biMapInterface() {
            return biMapInterface;
        }

        /**
         * The meta-property for the {@code multimapInterface} property.
         * @return the meta-property, not null
         */
        public MetaProperty<Multimap<T, String>> multimapInterface() {
            return multimapInterface;
        }

        /**
         * The meta-property for the {@code listMultimapInterface} property.
         * @return the meta-property, not null
         */
        public MetaProperty<ListMultimap<T, String>> listMultimapInterface() {
            return listMultimapInterface;
        }

        /**
         * The meta-property for the {@code setMultimapInterface} property.
         * @return the meta-property, not null
         */
        public MetaProperty<SetMultimap<T, String>> setMultimapInterface() {
            return setMultimapInterface;
        }

        /**
         * The meta-property for the {@code multisetInterface} property.
         * @return the meta-property, not null
         */
        public MetaProperty<Multiset<T>> multisetInterface() {
            return multisetInterface;
        }

        /**
         * The meta-property for the {@code sortedMultisetInterface} property.
         * @return the meta-property, not null
         */
        public MetaProperty<SortedMultiset<T>> sortedMultisetInterface() {
            return sortedMultisetInterface;
        }

        //-----------------------------------------------------------------------
        @Override
        protected Object propertyGet(Bean bean, String propertyName, boolean quiet) {
            switch (propertyName.hashCode()) {
                case -1741312354:  // collection
                    return ((ImmGuava<?>) bean).getCollection();
                case 3322014:  // list
                    return ((ImmGuava<?>) bean).getList();
                case 113762:  // set
                    return ((ImmGuava<?>) bean).getSet();
                case -6890395:  // sortedSet
                    return ((ImmGuava<?>) bean).getSortedSet();
                case 107868:  // map
                    return ((ImmGuava<?>) bean).getMap();
                case -6896289:  // sortedMap
                    return ((ImmGuava<?>) bean).getSortedMap();
                case 93710229:  // biMap
                    return ((ImmGuava<?>) bean).getBiMap();
                case 653826435:  // multimap
                    return ((ImmGuava<?>) bean).getMultimap();
                case 1737633857:  // listMultimap
                    return ((ImmGuava<?>) bean).getListMultimap();
                case -1651820539:  // setMultimap
                    return ((ImmGuava<?>) bean).getSetMultimap();
                case 653832329:  // multiset
                    return ((ImmGuava<?>) bean).getMultiset();
                case 1018567270:  // sortedMultiset
                    return ((ImmGuava<?>) bean).getSortedMultiset();
                case 420048955:  // collectionInterface
                    return ((ImmGuava<?>) bean).getCollectionInterface();
                case -259084741:  // listInterface
                    return ((ImmGuava<?>) bean).getListInterface();
                case 2042011383:  // setInterface
                    return ((ImmGuava<?>) bean).getSetInterface();
                case 1019335252:  // sortedSetInterface
                    return ((ImmGuava<?>) bean).getSortedSetInterface();
                case 651439933:  // mapInterface
                    return ((ImmGuava<?>) bean).getMapInterface();
                case -371236198:  // sortedMapInterface
                    return ((ImmGuava<?>) bean).getSortedMapInterface();
                case 2068077860:  // biMapInterface
                    return ((ImmGuava<?>) bean).getBiMapInterface();
                case -1415579914:  // multimapInterface
                    return ((ImmGuava<?>) bean).getMultimapInterface();
                case 1576080888:  // listMultimapInterface
                    return ((ImmGuava<?>) bean).getListMultimapInterface();
                case -630551884:  // setMultimapInterface
                    return ((ImmGuava<?>) bean).getSetMultimapInterface();
                case -25008464:  // multisetInterface
                    return ((ImmGuava<?>) bean).getMultisetInterface();
                case 271697267:  // sortedMultisetInterface
                    return ((ImmGuava<?>) bean).getSortedMultisetInterface();
            }
            return super.propertyGet(bean, propertyName, quiet);
        }

        @Override
        protected void propertySet(Bean bean, String propertyName, Object newValue, boolean quiet) {
            metaProperty(propertyName);
            if (quiet) {
                return;
            }
            throw new UnsupportedOperationException("Property cannot be written: " + propertyName);
        }

    }

    //-----------------------------------------------------------------------
    /**
     * The bean-builder for {@code ImmGuava}.
     * @param <T>  the type
     */
    public static final class Builder<T extends Comparable<T>> extends DirectFieldsBeanBuilder<ImmGuava<T>> {

        private Collection<T> collection = ImmutableList.of();
        private List<T> list = ImmutableList.of();
        private Set<T> set = ImmutableSet.of();
        private SortedSet<T> sortedSet = ImmutableSortedSet.of();
        private Map<T, String> map = ImmutableMap.of();
        private SortedMap<T, String> sortedMap = ImmutableSortedMap.of();
        private BiMap<T, String> biMap = ImmutableBiMap.of();
        private Multimap<T, String> multimap = ImmutableMultimap.of();
        private ListMultimap<T, String> listMultimap = ImmutableListMultimap.of();
        private SetMultimap<T, String> setMultimap = ImmutableSetMultimap.of();
        private Multiset<T> multiset = ImmutableMultiset.of();
        private SortedMultiset<T> sortedMultiset = ImmutableSortedMultiset.of();
        private Collection<T> collectionInterface = ImmutableList.of();
        private List<T> listInterface = ImmutableList.of();
        private Set<T> setInterface = ImmutableSet.of();
        private SortedSet<T> sortedSetInterface = ImmutableSortedSet.of();
        private Map<T, String> mapInterface = ImmutableMap.of();
        private SortedMap<T, String> sortedMapInterface = ImmutableSortedMap.of();
        private BiMap<T, String> biMapInterface = ImmutableBiMap.of();
        private Multimap<T, String> multimapInterface = ImmutableMultimap.of();
        private ListMultimap<T, String> listMultimapInterface = ImmutableListMultimap.of();
        private SetMultimap<T, String> setMultimapInterface = ImmutableSetMultimap.of();
        private Multiset<T> multisetInterface = ImmutableMultiset.of();
        private SortedMultiset<T> sortedMultisetInterface = ImmutableSortedMultiset.of();

        /**
         * Restricted constructor.
         */
        private Builder() {
        }

        /**
         * Restricted copy constructor.
         * @param beanToCopy  the bean to copy from, not null
         */
        private Builder(ImmGuava<T> beanToCopy) {
            this.collection = beanToCopy.getCollection();
            this.list = beanToCopy.getList();
            this.set = beanToCopy.getSet();
            this.sortedSet = beanToCopy.getSortedSet();
            this.map = beanToCopy.getMap();
            this.sortedMap = beanToCopy.getSortedMap();
            this.biMap = beanToCopy.getBiMap();
            this.multimap = beanToCopy.getMultimap();
            this.listMultimap = beanToCopy.getListMultimap();
            this.setMultimap = beanToCopy.getSetMultimap();
            this.multiset = beanToCopy.getMultiset();
            this.sortedMultiset = beanToCopy.getSortedMultiset();
            this.collectionInterface = ImmutableList.copyOf(beanToCopy.getCollectionInterface());
            this.listInterface = ImmutableList.copyOf(beanToCopy.getListInterface());
            this.setInterface = ImmutableSet.copyOf(beanToCopy.getSetInterface());
            this.sortedSetInterface = ImmutableSortedSet.copyOfSorted(beanToCopy.getSortedSetInterface());
            this.mapInterface = ImmutableMap.copyOf(beanToCopy.getMapInterface());
            this.sortedMapInterface = ImmutableSortedMap.copyOfSorted(beanToCopy.getSortedMapInterface());
            this.biMapInterface = ImmutableBiMap.copyOf(beanToCopy.getBiMapInterface());
            this.multimapInterface = ImmutableMultimap.copyOf(beanToCopy.getMultimapInterface());
            this.listMultimapInterface = ImmutableListMultimap.copyOf(beanToCopy.getListMultimapInterface());
            this.setMultimapInterface = ImmutableSetMultimap.copyOf(beanToCopy.getSetMultimapInterface());
            this.multisetInterface = ImmutableMultiset.copyOf(beanToCopy.getMultisetInterface());
            this.sortedMultisetInterface = ImmutableSortedMultiset.copyOfSorted(beanToCopy.getSortedMultisetInterface());
        }

        //-----------------------------------------------------------------------
        @Override
        public Object get(String propertyName) {
            switch (propertyName.hashCode()) {
                case -1741312354:  // collection
                    return collection;
                case 3322014:  // list
                    return list;
                case 113762:  // set
                    return set;
                case -6890395:  // sortedSet
                    return sortedSet;
                case 107868:  // map
                    return map;
                case -6896289:  // sortedMap
                    return sortedMap;
                case 93710229:  // biMap
                    return biMap;
                case 653826435:  // multimap
                    return multimap;
                case 1737633857:  // listMultimap
                    return listMultimap;
                case -1651820539:  // setMultimap
                    return setMultimap;
                case 653832329:  // multiset
                    return multiset;
                case 1018567270:  // sortedMultiset
                    return sortedMultiset;
                case 420048955:  // collectionInterface
                    return collectionInterface;
                case -259084741:  // listInterface
                    return listInterface;
                case 2042011383:  // setInterface
                    return setInterface;
                case 1019335252:  // sortedSetInterface
                    return sortedSetInterface;
                case 651439933:  // mapInterface
                    return mapInterface;
                case -371236198:  // sortedMapInterface
                    return sortedMapInterface;
                case 2068077860:  // biMapInterface
                    return biMapInterface;
                case -1415579914:  // multimapInterface
                    return multimapInterface;
                case 1576080888:  // listMultimapInterface
                    return listMultimapInterface;
                case -630551884:  // setMultimapInterface
                    return setMultimapInterface;
                case -25008464:  // multisetInterface
                    return multisetInterface;
                case 271697267:  // sortedMultisetInterface
                    return sortedMultisetInterface;
                default:
                    throw new NoSuchElementException("Unknown property: " + propertyName);
            }
        }

        @SuppressWarnings("unchecked")
        @Override
        public Builder<T> set(String propertyName, Object newValue) {
            switch (propertyName.hashCode()) {
                case -1741312354:  // collection
                    this.collection = (Collection<T>) newValue;
                    break;
                case 3322014:  // list
                    this.list = (List<T>) newValue;
                    break;
                case 113762:  // set
                    this.set = (Set<T>) newValue;
                    break;
                case -6890395:  // sortedSet
                    this.sortedSet = (SortedSet<T>) newValue;
                    break;
                case 107868:  // map
                    this.map = (Map<T, String>) newValue;
                    break;
                case -6896289:  // sortedMap
                    this.sortedMap = (SortedMap<T, String>) newValue;
                    break;
                case 93710229:  // biMap
                    this.biMap = (BiMap<T, String>) newValue;
                    break;
                case 653826435:  // multimap
                    this.multimap = (Multimap<T, String>) newValue;
                    break;
                case 1737633857:  // listMultimap
                    this.listMultimap = (ListMultimap<T, String>) newValue;
                    break;
                case -1651820539:  // setMultimap
                    this.setMultimap = (SetMultimap<T, String>) newValue;
                    break;
                case 653832329:  // multiset
                    this.multiset = (Multiset<T>) newValue;
                    break;
                case 1018567270:  // sortedMultiset
                    this.sortedMultiset = (SortedMultiset<T>) newValue;
                    break;
                case 420048955:  // collectionInterface
                    this.collectionInterface = (Collection<T>) newValue;
                    break;
                case -259084741:  // listInterface
                    this.listInterface = (List<T>) newValue;
                    break;
                case 2042011383:  // setInterface
                    this.setInterface = (Set<T>) newValue;
                    break;
                case 1019335252:  // sortedSetInterface
                    this.sortedSetInterface = (SortedSet<T>) newValue;
                    break;
                case 651439933:  // mapInterface
                    this.mapInterface = (Map<T, String>) newValue;
                    break;
                case -371236198:  // sortedMapInterface
                    this.sortedMapInterface = (SortedMap<T, String>) newValue;
                    break;
                case 2068077860:  // biMapInterface
                    this.biMapInterface = (BiMap<T, String>) newValue;
                    break;
                case -1415579914:  // multimapInterface
                    this.multimapInterface = (Multimap<T, String>) newValue;
                    break;
                case 1576080888:  // listMultimapInterface
                    this.listMultimapInterface = (ListMultimap<T, String>) newValue;
                    break;
                case -630551884:  // setMultimapInterface
                    this.setMultimapInterface = (SetMultimap<T, String>) newValue;
                    break;
                case -25008464:  // multisetInterface
                    this.multisetInterface = (Multiset<T>) newValue;
                    break;
                case 271697267:  // sortedMultisetInterface
                    this.sortedMultisetInterface = (SortedMultiset<T>) newValue;
                    break;
                default:
                    throw new NoSuchElementException("Unknown property: " + propertyName);
            }
            return this;
        }

        @Override
        public Builder<T> set(MetaProperty<?> property, Object value) {
            super.set(property, value);
            return this;
        }

        @Override
        public Builder<T> setString(String propertyName, String value) {
            setString(meta().metaProperty(propertyName), value);
            return this;
        }

        @Override
        public Builder<T> setString(MetaProperty<?> property, String value) {
            super.setString(property, value);
            return this;
        }

        @Override
        public Builder<T> setAll(Map<String, ? extends Object> propertyValueMap) {
            super.setAll(propertyValueMap);
            return this;
        }

        @Override
        public ImmGuava<T> build() {
            return new ImmGuava<T>(
                    collection,
                    list,
                    set,
                    sortedSet,
                    map,
                    sortedMap,
                    biMap,
                    multimap,
                    listMultimap,
                    setMultimap,
                    multiset,
                    sortedMultiset,
                    collectionInterface,
                    listInterface,
                    setInterface,
                    sortedSetInterface,
                    mapInterface,
                    sortedMapInterface,
                    biMapInterface,
                    multimapInterface,
                    listMultimapInterface,
                    setMultimapInterface,
                    multisetInterface,
                    sortedMultisetInterface);
        }

        //-----------------------------------------------------------------------
        /**
         * Sets the collection.
         * @param collection  the new value, not null
         * @return this, for chaining, not null
         */
        public Builder<T> collection(Collection<T> collection) {
            JodaBeanUtils.notNull(collection, "collection");
            this.collection = collection;
            return this;
        }

        /**
         * Sets the {@code collection} property in the builder
         * from an array of objects.
         * @param collection  the new value, not null
         * @return this, for chaining, not null
         */
        public Builder<T> collection(T... collection) {
            return collection(ImmutableList.copyOf(collection));
        }

        /**
         * Sets the list.
         * @param list  the new value, not null
         * @return this, for chaining, not null
         */
        public Builder<T> list(List<T> list) {
            JodaBeanUtils.notNull(list, "list");
            this.list = list;
            return this;
        }

        /**
         * Sets the {@code list} property in the builder
         * from an array of objects.
         * @param list  the new value, not null
         * @return this, for chaining, not null
         */
        public Builder<T> list(T... list) {
            return list(ImmutableList.copyOf(list));
        }

        /**
         * Sets the set.
         * @param set  the new value, not null
         * @return this, for chaining, not null
         */
        public Builder<T> set(Set<T> set) {
            JodaBeanUtils.notNull(set, "set");
            this.set = set;
            return this;
        }

        /**
         * Sets the {@code set} property in the builder
         * from an array of objects.
         * @param set  the new value, not null
         * @return this, for chaining, not null
         */
        public Builder<T> set(T... set) {
            return set(ImmutableSet.copyOf(set));
        }

        /**
         * Sets the sortedSet.
         * @param sortedSet  the new value, not null
         * @return this, for chaining, not null
         */
        public Builder<T> sortedSet(SortedSet<T> sortedSet) {
            JodaBeanUtils.notNull(sortedSet, "sortedSet");
            this.sortedSet = sortedSet;
            return this;
        }

        /**
         * Sets the {@code sortedSet} property in the builder
         * from an array of objects.
         * @param sortedSet  the new value, not null
         * @return this, for chaining, not null
         */
        public Builder<T> sortedSet(T... sortedSet) {
            return sortedSet(ImmutableSortedSet.copyOf(sortedSet));
        }

        /**
         * Sets the map.
         * @param map  the new value, not null
         * @return this, for chaining, not null
         */
        public Builder<T> map(Map<T, String> map) {
            JodaBeanUtils.notNull(map, "map");
            this.map = map;
            return this;
        }

        /**
         * Sets the sortedMap.
         * @param sortedMap  the new value, not null
         * @return this, for chaining, not null
         */
        public Builder<T> sortedMap(SortedMap<T, String> sortedMap) {
            JodaBeanUtils.notNull(sortedMap, "sortedMap");
            this.sortedMap = sortedMap;
            return this;
        }

        /**
         * Sets the biMap.
         * @param biMap  the new value, not null
         * @return this, for chaining, not null
         */
        public Builder<T> biMap(BiMap<T, String> biMap) {
            JodaBeanUtils.notNull(biMap, "biMap");
            this.biMap = biMap;
            return this;
        }

        /**
         * Sets the multimap.
         * @param multimap  the new value, not null
         * @return this, for chaining, not null
         */
        public Builder<T> multimap(Multimap<T, String> multimap) {
            JodaBeanUtils.notNull(multimap, "multimap");
            this.multimap = multimap;
            return this;
        }

        /**
         * Sets the listMultimap.
         * @param listMultimap  the new value, not null
         * @return this, for chaining, not null
         */
        public Builder<T> listMultimap(ListMultimap<T, String> listMultimap) {
            JodaBeanUtils.notNull(listMultimap, "listMultimap");
            this.listMultimap = listMultimap;
            return this;
        }

        /**
         * Sets the setMultimap.
         * @param setMultimap  the new value, not null
         * @return this, for chaining, not null
         */
        public Builder<T> setMultimap(SetMultimap<T, String> setMultimap) {
            JodaBeanUtils.notNull(setMultimap, "setMultimap");
            this.setMultimap = setMultimap;
            return this;
        }

        /**
         * Sets the multiset.
         * @param multiset  the new value, not null
         * @return this, for chaining, not null
         */
        public Builder<T> multiset(Multiset<T> multiset) {
            JodaBeanUtils.notNull(multiset, "multiset");
            this.multiset = multiset;
            return this;
        }

        /**
         * Sets the sortedMultiset.
         * @param sortedMultiset  the new value, not null
         * @return this, for chaining, not null
         */
        public Builder<T> sortedMultiset(SortedMultiset<T> sortedMultiset) {
            JodaBeanUtils.notNull(sortedMultiset, "sortedMultiset");
            this.sortedMultiset = sortedMultiset;
            return this;
        }

        /**
         * Sets the collectionInterface.
         * @param collectionInterface  the new value, not null
         * @return this, for chaining, not null
         */
        public Builder<T> collectionInterface(Collection<T> collectionInterface) {
            JodaBeanUtils.notNull(collectionInterface, "collectionInterface");
            this.collectionInterface = collectionInterface;
            return this;
        }

        /**
         * Sets the {@code collectionInterface} property in the builder
         * from an array of objects.
         * @param collectionInterface  the new value, not null
         * @return this, for chaining, not null
         */
        public Builder<T> collectionInterface(T... collectionInterface) {
            return collectionInterface(ImmutableList.copyOf(collectionInterface));
        }

        /**
         * Sets the listInterface.
         * @param listInterface  the new value, not null
         * @return this, for chaining, not null
         */
        public Builder<T> listInterface(List<T> listInterface) {
            JodaBeanUtils.notNull(listInterface, "listInterface");
            this.listInterface = listInterface;
            return this;
        }

        /**
         * Sets the {@code listInterface} property in the builder
         * from an array of objects.
         * @param listInterface  the new value, not null
         * @return this, for chaining, not null
         */
        public Builder<T> listInterface(T... listInterface) {
            return listInterface(ImmutableList.copyOf(listInterface));
        }

        /**
         * Sets the setInterface.
         * @param setInterface  the new value, not null
         * @return this, for chaining, not null
         */
        public Builder<T> setInterface(Set<T> setInterface) {
            JodaBeanUtils.notNull(setInterface, "setInterface");
            this.setInterface = setInterface;
            return this;
        }

        /**
         * Sets the {@code setInterface} property in the builder
         * from an array of objects.
         * @param setInterface  the new value, not null
         * @return this, for chaining, not null
         */
        public Builder<T> setInterface(T... setInterface) {
            return setInterface(ImmutableSet.copyOf(setInterface));
        }

        /**
         * Sets the sortedSetInterface.
         * @param sortedSetInterface  the new value, not null
         * @return this, for chaining, not null
         */
        public Builder<T> sortedSetInterface(SortedSet<T> sortedSetInterface) {
            JodaBeanUtils.notNull(sortedSetInterface, "sortedSetInterface");
            this.sortedSetInterface = sortedSetInterface;
            return this;
        }

        /**
         * Sets the {@code sortedSetInterface} property in the builder
         * from an array of objects.
         * @param sortedSetInterface  the new value, not null
         * @return this, for chaining, not null
         */
        public Builder<T> sortedSetInterface(T... sortedSetInterface) {
            return sortedSetInterface(ImmutableSortedSet.copyOf(sortedSetInterface));
        }

        /**
         * Sets the mapInterface.
         * @param mapInterface  the new value, not null
         * @return this, for chaining, not null
         */
        public Builder<T> mapInterface(Map<T, String> mapInterface) {
            JodaBeanUtils.notNull(mapInterface, "mapInterface");
            this.mapInterface = mapInterface;
            return this;
        }

        /**
         * Sets the sortedMapInterface.
         * @param sortedMapInterface  the new value, not null
         * @return this, for chaining, not null
         */
        public Builder<T> sortedMapInterface(SortedMap<T, String> sortedMapInterface) {
            JodaBeanUtils.notNull(sortedMapInterface, "sortedMapInterface");
            this.sortedMapInterface = sortedMapInterface;
            return this;
        }

        /**
         * Sets the biMapInterface.
         * @param biMapInterface  the new value, not null
         * @return this, for chaining, not null
         */
        public Builder<T> biMapInterface(BiMap<T, String> biMapInterface) {
            JodaBeanUtils.notNull(biMapInterface, "biMapInterface");
            this.biMapInterface = biMapInterface;
            return this;
        }

        /**
         * Sets the multimapInterface.
         * @param multimapInterface  the new value, not null
         * @return this, for chaining, not null
         */
        public Builder<T> multimapInterface(Multimap<T, String> multimapInterface) {
            JodaBeanUtils.notNull(multimapInterface, "multimapInterface");
            this.multimapInterface = multimapInterface;
            return this;
        }

        /**
         * Sets the listMultimapInterface.
         * @param listMultimapInterface  the new value, not null
         * @return this, for chaining, not null
         */
        public Builder<T> listMultimapInterface(ListMultimap<T, String> listMultimapInterface) {
            JodaBeanUtils.notNull(listMultimapInterface, "listMultimapInterface");
            this.listMultimapInterface = listMultimapInterface;
            return this;
        }

        /**
         * Sets the setMultimapInterface.
         * @param setMultimapInterface  the new value, not null
         * @return this, for chaining, not null
         */
        public Builder<T> setMultimapInterface(SetMultimap<T, String> setMultimapInterface) {
            JodaBeanUtils.notNull(setMultimapInterface, "setMultimapInterface");
            this.setMultimapInterface = setMultimapInterface;
            return this;
        }

        /**
         * Sets the multisetInterface.
         * @param multisetInterface  the new value, not null
         * @return this, for chaining, not null
         */
        public Builder<T> multisetInterface(Multiset<T> multisetInterface) {
            JodaBeanUtils.notNull(multisetInterface, "multisetInterface");
            this.multisetInterface = multisetInterface;
            return this;
        }

        /**
         * Sets the sortedMultisetInterface.
         * @param sortedMultisetInterface  the new value, not null
         * @return this, for chaining, not null
         */
        public Builder<T> sortedMultisetInterface(SortedMultiset<T> sortedMultisetInterface) {
            JodaBeanUtils.notNull(sortedMultisetInterface, "sortedMultisetInterface");
            this.sortedMultisetInterface = sortedMultisetInterface;
            return this;
        }

        //-----------------------------------------------------------------------
        @Override
        public String toString() {
            StringBuilder buf = new StringBuilder(800);
            buf.append("ImmGuava.Builder{");
            buf.append("collection").append('=').append(JodaBeanUtils.toString(collection)).append(',').append(' ');
            buf.append("list").append('=').append(JodaBeanUtils.toString(list)).append(',').append(' ');
            buf.append("set").append('=').append(JodaBeanUtils.toString(set)).append(',').append(' ');
            buf.append("sortedSet").append('=').append(JodaBeanUtils.toString(sortedSet)).append(',').append(' ');
            buf.append("map").append('=').append(JodaBeanUtils.toString(map)).append(',').append(' ');
            buf.append("sortedMap").append('=').append(JodaBeanUtils.toString(sortedMap)).append(',').append(' ');
            buf.append("biMap").append('=').append(JodaBeanUtils.toString(biMap)).append(',').append(' ');
            buf.append("multimap").append('=').append(JodaBeanUtils.toString(multimap)).append(',').append(' ');
            buf.append("listMultimap").append('=').append(JodaBeanUtils.toString(listMultimap)).append(',').append(' ');
            buf.append("setMultimap").append('=').append(JodaBeanUtils.toString(setMultimap)).append(',').append(' ');
            buf.append("multiset").append('=').append(JodaBeanUtils.toString(multiset)).append(',').append(' ');
            buf.append("sortedMultiset").append('=').append(JodaBeanUtils.toString(sortedMultiset)).append(',').append(' ');
            buf.append("collectionInterface").append('=').append(JodaBeanUtils.toString(collectionInterface)).append(',').append(' ');
            buf.append("listInterface").append('=').append(JodaBeanUtils.toString(listInterface)).append(',').append(' ');
            buf.append("setInterface").append('=').append(JodaBeanUtils.toString(setInterface)).append(',').append(' ');
            buf.append("sortedSetInterface").append('=').append(JodaBeanUtils.toString(sortedSetInterface)).append(',').append(' ');
            buf.append("mapInterface").append('=').append(JodaBeanUtils.toString(mapInterface)).append(',').append(' ');
            buf.append("sortedMapInterface").append('=').append(JodaBeanUtils.toString(sortedMapInterface)).append(',').append(' ');
            buf.append("biMapInterface").append('=').append(JodaBeanUtils.toString(biMapInterface)).append(',').append(' ');
            buf.append("multimapInterface").append('=').append(JodaBeanUtils.toString(multimapInterface)).append(',').append(' ');
            buf.append("listMultimapInterface").append('=').append(JodaBeanUtils.toString(listMultimapInterface)).append(',').append(' ');
            buf.append("setMultimapInterface").append('=').append(JodaBeanUtils.toString(setMultimapInterface)).append(',').append(' ');
            buf.append("multisetInterface").append('=').append(JodaBeanUtils.toString(multisetInterface)).append(',').append(' ');
            buf.append("sortedMultisetInterface").append('=').append(JodaBeanUtils.toString(sortedMultisetInterface));
            buf.append('}');
            return buf.toString();
        }

    }

    ///CLOVER:ON
    //-------------------------- AUTOGENERATED END --------------------------
}
