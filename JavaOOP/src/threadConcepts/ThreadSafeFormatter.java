package threadConcepts;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ThreadSafeFormatter {

	// Use Case: When you need variables that are local to a thread and should not
	// be shared across threads.

	private static final ThreadLocal<SimpleDateFormat> dateFormat = ThreadLocal
			.withInitial(() -> new SimpleDateFormat("yyyy-MM-dd"));

	public static String format(Date date) {
		return dateFormat.get().format(date);
	}
}
