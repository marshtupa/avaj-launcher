package edu.school.simulator.utils;

import edu.school.simulator.aviation.Aircraft;
import java.util.HashMap;
import java.util.Map;

public class Logger {
	private static Logger logger;
	private static Map<Integer, String> messages = new HashMap();
	private static Map<Integer, String> colors = new HashMap();

	public Logger() {
		if (logger != null) {
			logger = new Logger();
		}
		initMessages();
		initColors();
	}

	private void initMessages() {
		messages.put(0, "☀️ Let's enjoy the good weather and take some pics.");
		messages.put(1, "💦 It's raining. Better watch out for lightnings.");
		messages.put(2, "🌫 Can't see anything.");
		messages.put(3, "❄️ It's snowing. We're gonna crash.");
	}

	private void initColors() {
		colors.put(0, "\033[1;33m");
		colors.put(1, "\033[1;34m");
		colors.put(2, "\033[1;37m");
		colors.put(3, "\033[1;30m");
		colors.put(4, "\033[0m");
	}

	public static void logWeatherCondition(Aircraft aircraft, int weatherIndex) {
		System.out.println(colors.get(weatherIndex) + aircraft.toString() + messages.get(weatherIndex) + colors.get(4));
	}
}
