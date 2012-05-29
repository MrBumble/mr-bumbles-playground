import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class SAX {

	public static void main(String argv[]) {

		try {

			//Erzeugen einer factory von der Klasse SAXParser
			SAXParserFactory factory = SAXParserFactory.newInstance();
			//Erzeugen des SAXParsers
			SAXParser saxParser = factory.newSAXParser();

			//Erzeugen des Handlers für das XML File
			DefaultHandler handler = new DefaultHandler() {

				//Booleans für verschiedene Ereignisse
				boolean bfname = false;
				boolean blname = false;
				boolean bnname = false;
				boolean bsalary = false;

				//Override der Methode startElement
				//Diese Methode wird aufgerufen, wenn der Parser das ein neues Element findet
				public void startElement(String uri, String localName,
						String qName, Attributes attributes)
						throws SAXException {
					
					System.out.println("Start Element :" + qName);
					
					//Überprüfen um welches Ereignis sich handelt und setzen des entprechenden Boolens
					if (qName.equalsIgnoreCase("FIRSTNAME")) {
						bfname = true;
					}

					if (qName.equalsIgnoreCase("LASTNAME")) {
						blname = true;
					}

					if (qName.equalsIgnoreCase("NICKNAME")) {
						bnname = true;
					}

					if (qName.equalsIgnoreCase("SALARY")) {
						bsalary = true;
					}

				}
				
				//Override der Methode endElement
				//Diese Methode wird aufgerufen, wenn der Parser das ende eines Elementes findet
				public void endElement(String uri, String localName,
						String qName) throws SAXException {

					//Ausgabe des Elementes
					System.out.println("End Element :" + qName);

				}

				//Override der Methode characters
				//Diese Methode gibt alle Characters aus, die zwischen zwei Element Tags stehen
				public void characters(char ch[], int start, int length)
						throws SAXException {

					//Überprüfen, welcher Boolean gesetzt ist und Ausgabe des entsprechenden Inhaltes
					if (bfname) {
						System.out.println("First Name : "
								+ new String(ch, start, length));
						bfname = false;
					}

					if (blname) {
						System.out.println("Last Name : "
								+ new String(ch, start, length));
						blname = false;
					}

					if (bnname) {
						System.out.println("Nick Name : "
								+ new String(ch, start, length));
						bnname = false;
					}

					if (bsalary) {
						System.out.println("Salary : "
								+ new String(ch, start, length));
						bsalary = false;
					}

				}

			};

			//Übergabe des xml Files an den saxParser
			saxParser.parse("c:\\test.xml", handler);

			//Ausgabe von evtl auftretenden Fehlern
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}