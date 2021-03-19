package curso.springboot.springboot;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class TestePegarData {
	
	final DateFormat df = new SimpleDateFormat("ddMMyyyy");
	final Calendar cal = Calendar.getInstance();
	String dataAtual = (df.format(cal.getTime()));

}
