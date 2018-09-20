import java.io.File;
import java.io.IOException;
import java.util.Base64;

import com.google.common.io.Files;

/* 
Created on Thu Sep 13 11:14:11 2018

@author: Kapil Kaushik - github.com/linkwithkk
*/

public class Base64EncodeDecode {

	public static void encoder(String inp, String opt) throws IOException {
		byte[] encoded = Base64.getEncoder().encode(Files.toByteArray(new File(inp)));
        Files.write(encoded, new File(opt));
	}
	
	public static void decoder(String inp, String opt) throws IOException {
		Files.write(Base64.getDecoder().decode(Files.toByteArray(new File(inp))),new File(opt));
	}

}
