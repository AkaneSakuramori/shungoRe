package a4;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class h0 extends IOException {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f155b;

    public h0(b bVar) {
        super("stream was reset: " + bVar);
        this.f155b = bVar;
    }
}
