package Maraton2.exp6;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Optional;

public class File<T> {
    public void write(T log, String filename) {
        try {
            FileOutputStream file = new FileOutputStream(filename);
            ObjectOutputStream write = new ObjectOutputStream(file);
            write.writeObject(log);
            write.close();
        } catch (Exception e) {
            System.out.println("Dosya isleme hatasi...: " + e.toString());
        }
    }

    public Optional<T> read(String filename) {
        try {
            FileInputStream file = new FileInputStream(filename);
            ObjectInputStream read = new ObjectInputStream(file);
            T log = (T) read.readObject();
            return Optional.of(log);
        } catch (Exception e) {
            System.out.println("Dosya isleme hatasi...: " + e.toString());
            return Optional.empty();
        }
    }
}
