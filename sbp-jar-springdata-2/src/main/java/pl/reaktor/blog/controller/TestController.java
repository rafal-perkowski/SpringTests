package pl.reaktor.blog.controller;

public class TestController {
	
	private static long traceCounterLong = 0;
	private static boolean traceFlagBool = true;
	private static boolean checkdbFlagBool = false;

	public static long getTraceCounterLong() {
		return traceCounterLong;
	}

	public static void setTraceCounterLong(long traceCounterLong) {
		TestController.traceCounterLong = traceCounterLong;
	}

	public static boolean isTraceFlagBool() {
		return traceFlagBool;
	}

	public static void setTraceFlagBool(boolean traceFlagBool) {
		TestController.traceFlagBool = traceFlagBool;
	}

	public static boolean isCheckdbFlagBool() {
		return checkdbFlagBool;
	}

	public static void setCheckdbFlagBool(boolean checkdbFlagBool) {
		TestController.checkdbFlagBool = checkdbFlagBool;
	}

	public static void traceCounter(String messageString) {
		if(traceFlagBool)
			System.out.println("[" + String.format("%04d", (++traceCounterLong)) + "]: " + messageString);
	}
	
}
