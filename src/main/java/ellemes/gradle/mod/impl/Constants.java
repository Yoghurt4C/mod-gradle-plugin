package ellemes.gradle.mod.impl;

public final class Constants {
    public static final String JETBRAINS_ANNOTATIONS_VERSION = "@JETBRAINS_ANNOTATIONS_VERSION@";

    public static final String REQUIRED_GRADLE_VERSION = "@REQUIRED_GRADLE_VERSION@";

    public static final String TEMPLATE_PLATFORM_KEY = "template.platform";
    public static final String TEMPLATE_COMMON_PROJECT_KEY = "template.commonProject";

    public static final String TEMPLATE_PROPERTY_KEY = "template_project";
    public static final String FABRIC_API_VERSION_KEY = "fabric_api_version";
    public static final String QSL_VERSION_KEY = "qsl_version";

    private Constants() {
        throw new IllegalStateException("Should not instantiate utility class.");
    }
}