package androidx.profileinstaller;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Process;
import c3.h;
import e.n0;
import j.a;
import java.io.File;
import w0.e;

/* JADX INFO: loaded from: classes.dex */
public class ProfileInstallReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) throws Throwable {
        Bundle extras;
        if (intent == null) {
            return;
        }
        String action = intent.getAction();
        if ("androidx.profileinstaller.action.INSTALL_PROFILE".equals(action)) {
            e.p(context, new a(2), new n0(22, this), true);
            return;
        }
        if (!"androidx.profileinstaller.action.SKIP_FILE".equals(action)) {
            if ("androidx.profileinstaller.action.SAVE_PROFILE".equals(action)) {
                n0 n0Var = new n0(22, this);
                Process.sendSignal(Process.myPid(), 10);
                n0Var.t(12, null);
                return;
            } else {
                if (!"androidx.profileinstaller.action.BENCHMARK_OPERATION".equals(action) || (extras = intent.getExtras()) == null) {
                    return;
                }
                String string = extras.getString("EXTRA_BENCHMARK_OPERATION");
                n0 n0Var2 = new n0(22, this);
                if (!"DROP_SHADER_CACHE".equals(string)) {
                    n0Var2.t(16, null);
                    return;
                } else if (h.F0(context.createDeviceProtectedStorageContext().getCodeCacheDir())) {
                    n0Var2.t(14, null);
                    return;
                } else {
                    n0Var2.t(15, null);
                    return;
                }
            }
        }
        Bundle extras2 = intent.getExtras();
        if (extras2 != null) {
            String string2 = extras2.getString("EXTRA_SKIP_FILE_OPERATION");
            if (!"WRITE_SKIP_FILE".equals(string2)) {
                if ("DELETE_SKIP_FILE".equals(string2)) {
                    n0 n0Var3 = new n0(22, this);
                    new File(context.getFilesDir(), "profileinstaller_profileWrittenFor_lastUpdateTime.dat").delete();
                    new w0.a(n0Var3, 11, null, 1).run();
                    return;
                }
                return;
            }
            a aVar = new a(3);
            n0 n0Var4 = new n0(22, this);
            try {
                e.d(context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0), context.getFilesDir());
                aVar.execute(new w0.a(n0Var4, 10, null, 1));
            } catch (PackageManager.NameNotFoundException e5) {
                aVar.execute(new w0.a(n0Var4, 7, e5, 1));
            }
        }
    }
}
