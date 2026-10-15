package f4;

import java.nio.channels.WritableByteChannel;

/* JADX INFO: loaded from: classes.dex */
public interface h extends u, WritableByteChannel {
    h c(byte[] bArr);

    h d(int i4);

    @Override // f4.u, java.io.Flushable
    void flush();

    h g(j jVar);

    h j(long j4);

    h m(String str);

    h s(int i4);

    h v(int i4);
}
