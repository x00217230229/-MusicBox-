import java.io.*;  
  
public class Main {  
    public static void main(String[] args) {  
        String inputFilePath = "Groceries.txt";  
        String outputFilePath = "GroceriesFormatted.txt";  
  
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));  
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath))) {  
  
            String line;  
            while ((line = reader.readLine()) != null) {  
                // Assuming the input file has the following format: ID,Item,Quantity,Price  
                String[] parts = line.split(",");  
                if (parts.length >= 4) {  
                    // Format the line as specified  
                    String formattedLine = parts[0] + "#" + parts[1] + parts[2] + "G" + parts[3] + " (euro)";  
                    writer.write(formattedLine);  
                    writer.newLine();  
                } else {  
                    // Handle the case where the line does not have the expected format  
                    System.err.println("Invalid line format: " + line);  
                }  
            }  
  
            // Calculate the total price (assuming the price is in the fourth field)  
            double total = 0;  
            try (BufferedReader totalReader = new BufferedReader(new FileReader(inputFilePath))) {  
                while ((line = totalReader.readLine()) != null) {  
                    String[] parts = line.split(",");  
                    if (parts.length >= 4) {  
                        total += Double.parseDouble(parts[3]);  
                    }  
                }  
            }  
  
            // Write the total to the output file  
            writer.write("\nThe grocery shopping total is: €" + Math.round(total * 100.0) / 100.0);  
            writer.newLine();  
  
            // Flush and close the writer  
            writer.flush();  
        } catch (IOException e) {  
            e.printStackTrace();  
        }  
  
        // The reader is automatically closed because it's in a try-with-resources block  
    }  
}