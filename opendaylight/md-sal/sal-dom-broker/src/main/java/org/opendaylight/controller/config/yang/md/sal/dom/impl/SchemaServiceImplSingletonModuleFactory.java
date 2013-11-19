/**
 * Generated file

 * Generated from: yang module name: opendaylight-sal-dom-broker-impl  yang module local name: schema-service-singleton
 * Generated by: org.opendaylight.controller.config.yangjmxgenerator.plugin.JMXGenerator
 * Generated at: Wed Nov 20 17:01:31 CET 2013
 *
 * Do not modify this file unless it is present under src/main directory
 */
package org.opendaylight.controller.config.yang.md.sal.dom.impl;

import java.util.Collections;
import java.util.Set;

import org.opendaylight.controller.config.api.DependencyResolver;
import org.opendaylight.controller.config.api.DependencyResolverFactory;
import org.opendaylight.controller.config.api.ModuleIdentifier;
import org.opendaylight.controller.config.spi.Module;
import org.osgi.framework.BundleContext;

/**
*
*/
public class SchemaServiceImplSingletonModuleFactory extends
        org.opendaylight.controller.config.yang.md.sal.dom.impl.AbstractSchemaServiceImplSingletonModuleFactory {

    private static final ModuleIdentifier IDENTIFIER = new ModuleIdentifier(NAME, "yang-schema-service");
    public static SchemaServiceImplSingletonModule SINGLETON;

    @Override
    public Module createModule(String instanceName, DependencyResolver dependencyResolver, BundleContext bundleContext) {
        throw new UnsupportedOperationException("Only default instance supported.");
    }

    @Override
    public Set<SchemaServiceImplSingletonModule> getDefaultModules(DependencyResolverFactory dependencyResolverFactory,
            BundleContext bundleContext) {
        DependencyResolver dependencyResolver = dependencyResolverFactory.createDependencyResolver(IDENTIFIER);

        if (SINGLETON == null) {
            SINGLETON = new SchemaServiceImplSingletonModule(IDENTIFIER, dependencyResolver);
            SINGLETON.setBundleContext(bundleContext);
        }
        return Collections.singleton(SINGLETON);
    }
}
