package f4;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes.dex */
public final class v extends e {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Socket f2202m;

    public v(Socket socket) {
        this.f2202m = socket;
    }

    @Override // f4.e
    public final IOException j(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    @Override // f4.e
    public final void k() {
        Socket socket = this.f2202m;
        try {
            socket.close();
        } catch (AssertionError e5) {
            if (!r3.q.m(e5)) {
                throw e5;
            }
            n.f2181a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e5);
        } catch (Exception e6) {
            n.f2181a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e6);
        }
    }
}
