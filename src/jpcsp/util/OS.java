package jpcsp.util;

public class OS {
    static public final boolean isWindows = System.getProperty("os.name").contains("Windows");
    static public final boolean isLinux = System.getProperty("os.name").contains("Linux");
    static public final boolean isMac = System.getProperty("os.name").contains("Mac");
    static public final boolean is64Bit = "amd64".equals(System.getProperty("os.arch")) || "x86_64".equals(System.getProperty("os.arch"));
}
