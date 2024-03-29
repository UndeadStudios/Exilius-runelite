package net.runelite.client.plugins.hd.utils;

import jogamp.nativewindow.macosx.OSXUtil;
import net.runelite.client.util.OSType;

public class ThreadUtils
{

    public static void invokeOnMainThread(Runnable runnable)
    {
        if (OSType.getOSType() == OSType.MacOS)
        {
            OSXUtil.RunOnMainThread(true, false, runnable);
        }
        else
        {
            runnable.run();
        }
    }

}
