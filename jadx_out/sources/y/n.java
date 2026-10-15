package y;

import android.app.Notification;

/* JADX INFO: loaded from: classes.dex */
public abstract class n {
    public static Notification a(Notification.Builder builder) {
        return builder.build();
    }

    public static Notification.Builder b(Notification.Builder builder, int i4) {
        return builder.setPriority(i4);
    }

    public static Notification.Builder c(Notification.Builder builder, CharSequence charSequence) {
        return builder.setSubText(charSequence);
    }

    public static Notification.Builder d(Notification.Builder builder, boolean z4) {
        return builder.setUsesChronometer(z4);
    }
}
