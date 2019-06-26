package fusi2019;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

import org.apache.commons.io.FileUtils;

public class ReadFile {
	private String readFile(String filepath) throws IOException {
		File file = new File(filepath);
		String isifile = FileUtils.readFileToString(file, Charset.defaultCharset());
		
		return isifile;
	}
}
