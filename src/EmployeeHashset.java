import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;

public class EmployeeHashset {
        public static void main(String[] args) {
            String data;
            // I  create a hashset object
            HashSet<String> set = new HashSet<>();

            try (BufferedReader br = new BufferedReader(new FileReader("employee.txt"))) {
                while ((data = br.readLine()) != null) { // reads lines from file set.add (data):
                }
            } catch (IOException e) {
                System.out.println("Data loading error");
            }
            System.out.println("The list consists of" + "elements.");

            Iterator<String> iter = set.iterator();

            while (iter.hasNext()) {
                String element = iter.next();
                System.out.println(element);
            }
            System.out.println(set.contains("Prince Mapumah"));
        }
    }

