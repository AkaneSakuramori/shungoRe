package x3;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class n extends RuntimeException {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IOException f5010b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public IOException f5011c;

    public n(IOException iOException) {
        super(iOException);
        this.f5010b = iOException;
        this.f5011c = iOException;
    }
}
