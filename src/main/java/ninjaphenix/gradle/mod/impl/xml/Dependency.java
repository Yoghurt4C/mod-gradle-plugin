package ninjaphenix.gradle.mod.impl.xml;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(strict = false)
public class Dependency {
    @Element
    private String groupId;
    @Element
    private String artifactId;
    @Element
    private String version;

    public String getArtifactId() {
        return artifactId;
    }

    public String getGradleString() {
        return groupId + ":" + artifactId + ":" + version;
    }
}
