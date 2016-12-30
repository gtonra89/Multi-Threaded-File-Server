package ie.gmit.sw;

import java.io.File;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;

public class Setup {

	public static void main(String[] args) throws Exception,Throwable {

		Context ctx = new Context();
		ContextParser cp = new ContextParser(ctx);
		cp.init();
		
		System.out.println(ctx);
		MenuSystem myMenuSystem = new MenuSystem();
		myMenuSystem.menuSelection();
	}

}
