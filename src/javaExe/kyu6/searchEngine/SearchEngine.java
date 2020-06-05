package javaExe.kyu6.searchEngine;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class SearchEngine {
	static int find(String needle, String haystack) {


		String regNeedle = "\\Q" + needle.replaceAll("_", "\\\\E.\\\\Q") + "\\E";
		Matcher m = Pattern.compile(regNeedle).matcher(haystack);
		return m.find() ? m.start() : -1;
    }
}