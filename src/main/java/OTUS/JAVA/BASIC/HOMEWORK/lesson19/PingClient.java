package otus.java.basic.homework.lesson19;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class PingClient implements AutoCloseable {
    private BufferedReader in;
    private DataOutputStream out;

    public PingClient(InputStream in, OutputStream out) {
        this.in = new BufferedReader(new InputStreamReader(in));
        this.out = new DataOutputStream(new BufferedOutputStream(out));
    }

    public String ping(byte[] bytes) throws IOException {
        out.write(bytes);
        out.flush();

        return in.readLine();
    }

    @Override
    public void close() throws Exception {
        in.close();
        out.close();
    }
}
