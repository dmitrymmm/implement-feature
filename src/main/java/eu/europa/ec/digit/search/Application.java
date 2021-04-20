package eu.europa.ec.digit.search;

import java.util.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {

	private static final Logger LOGGER = LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		LOGGER.info("Starting");
		System.exit(0);
	}

	protected String sortMyString(String unsortedString) {

		List<String> list = Arrays.asList(unsortedString.split(" "));
		list.sort(Comparator.comparing(s -> s.substring(0, 1), String.CASE_INSENSITIVE_ORDER));
		return String.join(" ", list);

	}

	protected List<String> removeDuplicatesFromList(List<String> values) {

		List<String> result = new ArrayList<>();
		for (String element : values) {
			if (!result.contains(element)) {
				result.add(element);
			}
		}
		return result;

	}

}
