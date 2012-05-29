import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.File;

public class DOM {

	public static void main(String argv[]) {

		try {

			// Laden des XML Files
			File fXmlFile = new File("c:\\test.xml");
			// Erzeigen einer neuen Factory vom Typ DocumentBuidlerFactory
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory
					.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			// Erzeugen des DOM parsers und übergabe des XMl Files
			Document doc = dBuilder.parse(fXmlFile);
			doc.getDocumentElement().normalize();

			// Ausgabe des Root Elementes
			System.out.println("Root element :"
					+ doc.getDocumentElement().getNodeName());
			// Erzeugen einer NodeList die alle Elemente des Types "staff"
			// einliest
			NodeList nList = doc.getElementsByTagName("staff");
			System.out.println("-----------------------");

			// Schleife zum durchlaufen aller Listen Elemente
			for (int temp = 0; temp < nList.getLength(); temp++) {

				//Einlesen des aktuellen Knotens
				Node nNode = nList.item(temp);
				//Wenn es sich um ein Knoten vom Typ Element handelt soll der Inhalt ausgegeben werden
				
				if (nNode.getNodeType() == Node.ELEMENT_NODE) {

					//Einlesen des aktuellen Elementes
					Element eElement = (Element) nNode;

					//Ausgabe aller Attribute
					System.out.println("First Name : "
							+ getTagValue("firstname", eElement));
					System.out.println("Last Name : "
							+ getTagValue("lastname", eElement));
					System.out.println("Nick Name : "
							+ getTagValue("nickname", eElement));
					System.out.println("Salary : "
							+ getTagValue("salary", eElement));

				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//Diese Methode liest lediglich den Wert eines aktuellen Elementes aus
	private static String getTagValue(String sTag, Element eElement) {
		NodeList nlList = eElement.getElementsByTagName(sTag).item(0)
				.getChildNodes();

		Node nValue = (Node) nlList.item(0);

		return nValue.getNodeValue();
	}

}