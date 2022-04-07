package ninjaphenix.gradle.mod.impl.xml;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.List;

@Root(name = "versioning", strict = false)
public class Versioning {
    @ElementList
    private List<SnapshotVersion> snapshotVersions;
    @Element
    private String lastUpdated;

    public List<SnapshotVersion> getSnapshotVersions() {
        return snapshotVersions;
    }

    public String getLastUpdated() {
        return lastUpdated;
    }
}
