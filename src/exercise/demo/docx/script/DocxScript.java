package exercise.demo.docx.script;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class DocxScript {
	public void allFile(String path, String encoding) {
		File file = new File(path);
		File[] tempList = file.listFiles();
		if (tempList == null || tempList.length == 0) {
			return;
		}
		for (File tempFile : tempList) {
//			readMyDocument(tempFile, encoding);
		}

	}

	public void readMyDocument(File file, String encoding) throws FileNotFoundException {
		FileInputStream fis = new FileInputStream(file);

	}
}
