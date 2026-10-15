package c4;

import android.util.Log;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;

/* JADX INFO: loaded from: classes.dex */
public final class d extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f1283a = new d();

    @Override // java.util.logging.Handler
    public final void close() {
    }

    @Override // java.util.logging.Handler
    public final void flush() {
    }

    @Override // java.util.logging.Handler
    public final void publish(LogRecord logRecord) {
        int i4;
        int iMin;
        c3.h.b0(logRecord, "record");
        CopyOnWriteArraySet copyOnWriteArraySet = c.f1281a;
        String loggerName = logRecord.getLoggerName();
        c3.h.a0(loggerName, "record.loggerName");
        int iIntValue = logRecord.getLevel().intValue();
        Level level = Level.INFO;
        if (iIntValue > level.intValue()) {
            i4 = 5;
        } else {
            i4 = logRecord.getLevel().intValue() == level.intValue() ? 4 : 3;
        }
        String message = logRecord.getMessage();
        c3.h.a0(message, "record.message");
        Throwable thrown = logRecord.getThrown();
        String strU3 = (String) c.f1282b.get(loggerName);
        if (strU3 == null) {
            strU3 = q3.m.u3(loggerName, 23);
        }
        if (Log.isLoggable(strU3, i4)) {
            if (thrown != null) {
                message = message + '\n' + Log.getStackTraceString(thrown);
            }
            int length = message.length();
            int i5 = 0;
            while (i5 < length) {
                int iY2 = q3.l.Y2(message, '\n', i5, false, 4);
                if (iY2 == -1) {
                    iY2 = length;
                }
                while (true) {
                    iMin = Math.min(iY2, i5 + 4000);
                    String strSubstring = message.substring(i5, iMin);
                    c3.h.a0(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    Log.println(i4, strU3, strSubstring);
                    if (iMin >= iY2) {
                        break;
                    } else {
                        i5 = iMin;
                    }
                }
                i5 = iMin + 1;
            }
        }
    }
}
