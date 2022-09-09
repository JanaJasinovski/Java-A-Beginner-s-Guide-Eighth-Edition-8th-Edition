package Chapter_21;

import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Paths;

public class MappedChannelRead {
    public static void main(String[] args) {
        try (FileChannel fileCannel = (FileChannel) Files.newByteChannel(Paths.get("test.txt"))){
            long fSize = fileCannel.size();

            MappedByteBuffer mappedByteBuffer = fileCannel.map(FileChannel.MapMode.READ_ONLY, 0, fSize);

            for (int i = 0; i < fSize; i++) {
                System.out.println((char) mappedByteBuffer.get());
            }

            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
