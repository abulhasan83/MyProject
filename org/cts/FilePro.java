package org.cts;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class FilePro {
public static void main(String[] args) throws IOException {
	File f = new File("D://Abul//Hasan");
	     File[] listFiles = f.listFiles();
	     for(File l: listFiles) {
	    	 System.out.println(l);
	     }
	
}
}

