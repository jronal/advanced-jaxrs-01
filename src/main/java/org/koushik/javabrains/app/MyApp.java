package org.koushik.javabrains.app;

import org.koushik.javabrains.rest.MyResource;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

/*@ApplicationPath("webapi")*/
public class MyApp/* extends Application*/ {
    public Set<Class<?>> getClasses() {
        Set<Class<?>> s = new HashSet<Class<?>>();
        s.add(MyResource.class);
        return s;
    }
}