package Model;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Model {
    private List<String[]> data;

    public Model() {
        data = new ArrayList<>();
    }

    public List<String[]> getData() {
        return data;
    }

    public void setData(List<String[]> data) {
        this.data = data;
    }

    public void addData(String[] rowData) {
        data.add(rowData);
    }

    public void writeToCSV(String filePath) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(filePath, false))) {
            for (String[] rowData : data) {
                StringBuilder sb = new StringBuilder();
                for (String value : rowData) {
                    sb.append(value).append(",");
                }
                writer.println(sb.toString().substring(0, sb.length() - 1));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
