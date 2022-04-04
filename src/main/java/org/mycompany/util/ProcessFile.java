package org.mycompany.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class ProcessFile implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {
		// TODO Auto-generated method stub
		// astraPay_NIK_04042022.zip
		System.out.println("File Name: " + exchange.getIn().getHeader("CamelFileName"));
		String fileName = exchange.getIn().getHeader("CamelFileName").toString();
		String partner = fileName.substring(0, fileName.indexOf("_"));
		System.out.println("partner: " + partner);
		String uniqueId = fileName.substring(fileName.indexOf("_") + 1,
				fileName.indexOf("_", fileName.indexOf("_") + 1));
		System.out.println("uniqueId: " + uniqueId);
		DateFormat dateFormat = new SimpleDateFormat("ddMMyyyy");
		Date date = new Date();
		String fullPath = partner + "/" + dateFormat.format(date) + "/" + uniqueId;
		exchange.setProperty("path", fullPath);
		System.out.println("path: " + fullPath);
//		Object body = exchange.getIn().getBody();

	}

}
