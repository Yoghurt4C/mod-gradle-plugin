package ninjaphenix.gradle.mod.api.ext;

import org.gradle.api.JavaVersion;

public interface ModGradleExtension {
    String getMinecraftVersion();

    JavaVersion getJavaVersion();
}