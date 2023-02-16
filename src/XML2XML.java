import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.File;

public class XML2XML {
    public static void main(String[] args) {
        String XSLFILE = "transform.xsl";
        String INPUTFILE = "courses.xml";
        String OUTPUTFILE = "student.xml";

        StreamSource xlscode = new StreamSource(new File(XSLFILE));
        StreamSource input = new StreamSource(new File(INPUTFILE));
        StreamResult output = new StreamResult(new File(OUTPUTFILE));

        TransformerFactory tf = TransformerFactory.newInstance();

        Transformer transformer;
        try {
            transformer = tf.newTransformer(xlscode);
            transformer.transform(input, output);
        } catch (TransformerConfigurationException e) {
            e.printStackTrace();
        } catch (TransformerException e) {
            e.printStackTrace();
        }


    }
}
