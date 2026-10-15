package u2;

import android.content.Context;
import android.util.Log;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n f4742a = new n();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Process f4743b;

    public final synchronized void a(Context context) {
        Process processStart;
        c3.h.b0(context, "context");
        Process process = f4743b;
        if (process == null || !process.isAlive()) {
            File file = new File(context.getFilesDir(), "logs");
            if (!file.exists()) {
                file.mkdirs();
            }
            File file2 = new File(file, "shungo.log");
            x2.d.a("pkill -f 'logcat -f " + file2.getAbsolutePath() + '\'').S2();
            try {
                processStart = new ProcessBuilder("logcat", "-f", file2.getAbsolutePath(), "-r", "1024", "-n", "1").redirectErrorStream(true).start();
            } catch (Exception e5) {
                Log.e("SHUNGO", "log capture failed to start", e5);
                processStart = null;
            }
            f4743b = processStart;
        }
    }
}
