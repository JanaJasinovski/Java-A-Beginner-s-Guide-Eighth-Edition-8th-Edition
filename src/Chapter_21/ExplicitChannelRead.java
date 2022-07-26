package Chapter_21;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ExplicitChannelRead {
    public static void main(String[] args) throws IOException {
        int count;
        Path path = null;

        try {
            path = Paths.get("test.txt");
        } catch (InvalidPathException e) {
            System.out.println("Path Error " + e);
            return;
        }

        try (SeekableByteChannel seekableByteChannel = Files.newByteChannel(path)) {
            {
                ByteBuffer byteBuffer = ByteBuffer.allocate(128);
                do {
                    count = seekableByteChannel.read(byteBuffer);

                    if (count != -1) {
                        byteBuffer.rewind();

                        for (int i = 0; i < count; i++) {
                            System.out.println((char) byteBuffer.get());
                        }
                    }
                } while (count != -1);
            }
        }
    }
}
