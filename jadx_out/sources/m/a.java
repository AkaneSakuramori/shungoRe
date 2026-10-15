package m;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import java.util.ArrayList;
import r3.q;

/* JADX INFO: loaded from: classes.dex */
public final class a implements b {
    @Override // m.b
    public final ArrayList a(PackageManager packageManager, String str) throws PackageManager.NameNotFoundException {
        PackageInfo packageInfo = packageManager.getPackageInfo(str, 134217728);
        ArrayList arrayList = new ArrayList();
        SigningInfo signingInfo = packageInfo.signingInfo;
        if (signingInfo.hasMultipleSigners()) {
            for (Signature signature : signingInfo.getApkContentsSigners()) {
                arrayList.add(q.f(signature));
            }
        } else {
            arrayList.add(q.f(signingInfo.getSigningCertificateHistory()[0]));
        }
        return arrayList;
    }
}
