import java.io.*;

public class FileWriteExample {
    public static void main(String[] args) {
        String path = "test.txt";
        String filePath="out.txt";
        try (BufferedWriter writer=new BufferedWriter(new FileWriter(path))){
            writer.write("Hello, World!");
            writer.newLine();
            writer.write("This is a test.");
            System.out.println("文件写入成功");
        } catch (IOException e) {
            e.printStackTrace();
        }
            try(BufferedReader reader=new BufferedReader(new FileReader(filePath))){
                String line;
                while((line=reader.readLine())!=null){
                    System.out.println(line);
                }
            }catch(IOException te)
            {
               te.printStackTrace();
            }
    }
    }
