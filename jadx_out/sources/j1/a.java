package j1;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f3148a = Collections.singletonList("RS256");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Signature f3149b;

    public a(PublicKey publicKey) throws InvalidKeyException {
        try {
            Signature signature = Signature.getInstance("SHA256withRSA");
            this.f3149b = signature;
            signature.initVerify(publicKey);
        } catch (NoSuchAlgorithmException unused) {
        }
    }
}
