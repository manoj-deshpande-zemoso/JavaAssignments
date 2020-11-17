package assignment01;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Main {

	private Pattern pattern;
	private boolean showHiddenItems = false;
	private Predicate<File> fileIsNotHiddenFilter = file -> !file.isHidden();

	public static void main(String[] args) {
		Main main = new Main();
		main.filterFileNames();
	}

	private void filterFileNames(){
		System.out.print("Enter the regex input: ");
		String regex = new Scanner(System.in).nextLine();
		pattern = Pattern.compile(regex);

		File homeDirectory = new File(System.getenv("HOME"));
		filterAndPrintFilesRecursivelyInDirectory(homeDirectory);
	}

	private void filterAndPrintFilesRecursivelyInDirectory(File directory){
		List<File> fileItems =
				Arrays.asList(directory.listFiles()).stream()
						.filter(showHiddenItems? f -> true : fileIsNotHiddenFilter)
						.collect(Collectors.toList());
		List<File> directories = fileItems.stream().filter(f -> f.isDirectory()).collect(Collectors.toList());
		List<File> files = fileItems.stream().filter(file -> file.isFile() && pattern.matcher(file.getName()).find()).collect(Collectors.toList());

		if(files.size() != 0) System.out.println(directory.getAbsolutePath());

		files.stream().forEach(file -> System.out.println(String.format("- %s", file.getAbsolutePath())));
		directories.stream()
				.forEach(this::filterAndPrintFilesRecursivelyInDirectory);
	}

}
