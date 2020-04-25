package dev.jmwri.flip-tracker;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class FlipTrackerPluginTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(FlipTrackerPlugin.class);
		RuneLite.main(args);
	}
}