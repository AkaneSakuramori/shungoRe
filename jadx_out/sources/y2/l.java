package y2;

import java.io.FilterOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class l extends FilterOutputStream {
    public final void a() throws IOException {
        super.close();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        ((FilterOutputStream) this).out.flush();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i4, int i5) throws IOException {
        ((FilterOutputStream) this).out.write(bArr, i4, i5);
    }
}
