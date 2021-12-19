public class ProgressBarUtil {

	public static String getBar(int progress, int max, int size, String filledText, String fillColor, String remainingColor) {
		if (progress == -1)
			progress = max;

		StringBuilder sb = new StringBuilder();
		sb.append(fillColor);

		int percentage = progress * 100 / max;

		int fsize = (int) (size * percentage / 100f);

		for (int i = 0; i < fsize; i++) {
			sb.append(filledText);
		}

		if (percentage < 100) {
			sb.append(remainingColor);
			for (int i = 0; i < (size - fsize); i++) {
				sb.append(filledText);
			}
		}
		return sb.toString();
	}

}