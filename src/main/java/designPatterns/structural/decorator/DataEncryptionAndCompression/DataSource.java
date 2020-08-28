package designPatterns.structural.decorator.DataEncryptionAndCompression;

public interface DataSource {
    void writeData(String data);

    String readData();
}
