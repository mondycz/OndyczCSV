
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Odczytcsv {

  public static void main(String[] args) {

	Odczytcsv obj = new Odczytcsv();
	obj.run();

  }

  public void run() {

	String csvFile = "/Users/Jazera/Documents/Eclipse_projekty/Odczyr/src/Lista.csv";
	BufferedReader br = null;
	String line = "";
	String cvsSplitBy = ",";

	try {

		br = new BufferedReader(new FileReader(csvFile));
		while ((line = br.readLine()) != null) {

			String[] spacja = line.split(cvsSplitBy);

			System.out.println("Imie: " + spacja[0] 
                                 + ", Nazwisko: " + spacja[1]);

		}

	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	} finally {
		if (br != null) {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	System.out.println("Udalo sie!");
  }

}