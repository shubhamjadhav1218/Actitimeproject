package com.Actitime.Genericlibrary;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import javax.imageio.stream.FileImageInputStream;

import org.openqa.selenium.devtools.v111.layertree.model.StickyPositionConstraint;

public class filelibrary {
	
	public String readDataFromProperty(String key) throws IOException  {
	FileInputStream fir=new FileInputStream("./Testdata/commandata.property");
	Properties p=new Properties();
	p.load(fir);
	String value=p.getProperty(key);
	return value;
	} 
	public String readDataFromeProperty(String sheetname,int row,int cell) {
		FileInputStream fir=new FileInputStream("./Testdata/AUTOMATIONTESTDATA.xlsx");
Object wb = .create(fir);
	
	}

}

