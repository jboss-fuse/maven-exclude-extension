package org.jboss.fuse.maven;

import org.apache.maven.execution.MavenSession;

public class PropertyUtils {

    private static final String MAVEN_EXCLUDE_EXTENSION_SKIP = "skip.excludes-extension";

    private PropertyUtils() {
    }  
    
    public static boolean isSkip(MavenSession session) {
        return (Boolean.parseBoolean(session.getCurrentProject().getProperties().getProperty(MAVEN_EXCLUDE_EXTENSION_SKIP))
            || Boolean.parseBoolean(session.getSystemProperties().getProperty(MAVEN_EXCLUDE_EXTENSION_SKIP))
            || Boolean.parseBoolean(session.getUserProperties().getProperty(MAVEN_EXCLUDE_EXTENSION_SKIP)));
    }
}
