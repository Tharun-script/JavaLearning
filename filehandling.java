import java.io.*;

public class Main {
    public static void main(String[] args) {

        // -------------------------------
        // 1️⃣ FILE CREATION / CHECKING
        // -------------------------------
        try {
            File file = new File("example.txt");

            if (file.exists()) {
                System.out.println("📄 File already exists!");
            } else {
                file.createNewFile();
                System.out.println("✅ New file created: " + file.getName());
            }

            System.out.println("File path: " + file.getAbsolutePath());
            System.out.println("----------------------------------");

        } catch (IOException e) {
            e.printStackTrace();
        }

        // -------------------------------
        // 2️⃣ FILE WRITER (WRITE CHARACTERS)
        // -------------------------------
        try (FileWriter fw = new FileWriter("example.txt")) {
            fw.write("hello i am tharun\n");
            fw.write("This line is written using FileWriter.\n");
            System.out.println("✍️ Data written using FileWriter.");
            System.out.println("----------------------------------");

        } catch (IOException e) {
            e.printStackTrace();
        }

        // -------------------------------
        // 3️⃣ FILE READER (READ CHARACTERS)
        // -------------------------------
        try (FileReader fr = new FileReader("example.txt")) {
            System.out.println("📖 Reading data using FileReader:");
            int ch;
            while ((ch = fr.read()) != -1) {
                System.out.print((char) ch);
            }
            System.out.println("\n----------------------------------");

        } catch (IOException e) {
            e.printStackTrace();
        }

        // -------------------------------
        // 4️⃣ BUFFERED WRITER (EFFICIENT WRITING)
        // -------------------------------
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("example.txt", true))) {
            bw.write("This is an additional line using BufferedWriter.\n");
            bw.write("BufferedWriter writes efficiently using memory buffer.\n");
            System.out.println("🧠 Extra data appended using BufferedWriter.");
            System.out.println("----------------------------------");

        } catch (IOException e) {
            e.printStackTrace();
        }

        // -------------------------------
        // 5️⃣ BUFFERED READER (EFFICIENT READING)
        // -------------------------------
        try (BufferedReader br = new BufferedReader(new FileReader("example.txt"))) {
            System.out.println("📖 Reading data using BufferedReader (line by line):");
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            System.out.println("----------------------------------");

        } catch (IOException e) {
            e.printStackTrace();
        }

        // -------------------------------
        // 6️⃣ FILE INPUT / OUTPUT STREAM (BYTE STREAM)
        // -------------------------------
        try (FileInputStream fis = new FileInputStream("example.txt");
             FileOutputStream fos = new FileOutputStream("example1.txt")) {

            int byteData;
            while ((byteData = fis.read()) != -1) {
                fos.write(byteData);
            }

            System.out.println("📂 File copied from example.txt → example1.txt successfully!");
            System.out.println("----------------------------------");

        } catch (IOException e) {
            e.printStackTrace();
        }

        // -------------------------------
        // 7️⃣ VERIFY COPY USING BUFFERED READER
        // -------------------------------
        try (BufferedReader br1 = new BufferedReader(new FileReader("example1.txt"))) {
            System.out.println("✅ Reading copied file (example1.txt):");
            String line;
            while ((line = br1.readLine()) != null) {
                System.out.println(line);
            }
            System.out.println("----------------------------------");

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("🎉 File handling demonstration completed successfully!");
    }
}
