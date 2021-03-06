// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

 /*
 * This file was automatically generated by com.microsoft.tfs.core.ws.generator.Generator
 * from the /flagSet.vm template.
 */
package ms.tfs.build.buildservice._03;

import com.microsoft.tfs.core.ws.runtime.exceptions.*;
import com.microsoft.tfs.core.ws.runtime.serialization.*;
import com.microsoft.tfs.core.ws.runtime.types.*;
import com.microsoft.tfs.core.ws.runtime.xml.*;

import java.util.HashMap;
import java.util.Map;

/**
 * Automatically generated flag set class.
 */
public final class _BuildControllerUpdate
    extends FlagSet
{
    /**
     * Constructs a _BuildControllerUpdate with no flags initially set.
     */
    public _BuildControllerUpdate()
    {
        super();
    }

    /**
     * Constructs a _BuildControllerUpdate with the given flags initially set.
     *
     * @param flags
     *        the flags initially contained in this set.
     */
    public _BuildControllerUpdate(final _BuildControllerUpdate_Flag[] flags)
    {
        super(flags);
    }

    /**
     * Constructs a _BuildControllerUpdate with the given flags initially set.
     *
     * @param flagStrings
     *        the flags initially contained in this set.
     */
    public _BuildControllerUpdate(final String[] flagStrings)
    {
        super(flagStrings);
    }

    /*
     * (non-Javadoc)
     *
     * @see
     * com.microsoft.tfs.core.ws.runtime.types.FlagSet\#findFlagInstance(java.lang
     * .String)
     */
    protected Flag findFlagInstance(final String value)
        throws SOAPSerializationException
    {
        return _BuildControllerUpdate_Flag.fromString(
            value,
            _BuildControllerUpdate_Flag.VALUES_TO_INSTANCES);
    }

    /**
     * Gets the flags this flag set contains.
     *
     * @return the flags this flag set contains.
     */
    public _BuildControllerUpdate_Flag[] getFlags()
    {
        return (_BuildControllerUpdate_Flag[]) this.toArray(new _BuildControllerUpdate_Flag[this.size()]);
    }

    public boolean add(_BuildControllerUpdate_Flag o)
    {
        return super.add(o);
    }

    public boolean contains(_BuildControllerUpdate_Flag o)
    {
        return super.contains(o);
    }

    public boolean remove(_BuildControllerUpdate_Flag o)
    {
        return super.remove(o);
    }

    /**
     * Defines the valid flag values that can be contained in _BuildControllerUpdate.
     *
     * This class is non-final for the rare occasion where custom values must be
     * defined because the web service accepts values not publicly defined in its
     * web service definition.
     */
    public static class _BuildControllerUpdate_Flag
        extends Flag
    {
        /**
         * This map lets static methods in this class map strings to the correct
         * instance type at deserialization time.
         */
        private final static Map VALUES_TO_INSTANCES = new HashMap();
        public static final _BuildControllerUpdate_Flag None = new _BuildControllerUpdate_Flag("None");
        public static final _BuildControllerUpdate_Flag Name = new _BuildControllerUpdate_Flag("Name");
        public static final _BuildControllerUpdate_Flag Description = new _BuildControllerUpdate_Flag("Description");
        public static final _BuildControllerUpdate_Flag CustomAssemblyPath = new _BuildControllerUpdate_Flag(
                    "CustomAssemblyPath");
        public static final _BuildControllerUpdate_Flag MaxConcurrentBuilds = new _BuildControllerUpdate_Flag(
                    "MaxConcurrentBuilds");
        public static final _BuildControllerUpdate_Flag Status = new _BuildControllerUpdate_Flag("Status");
        public static final _BuildControllerUpdate_Flag StatusMessage = new _BuildControllerUpdate_Flag("StatusMessage");
        public static final _BuildControllerUpdate_Flag Enabled = new _BuildControllerUpdate_Flag("Enabled");

        protected _BuildControllerUpdate_Flag(final String name)
        {
            super(name, _BuildControllerUpdate_Flag.VALUES_TO_INSTANCES);
        }
    }
}
