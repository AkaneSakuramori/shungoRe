package n0;

import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import androidx.emoji2.text.u;

/* JADX INFO: loaded from: classes.dex */
public final class a extends ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3529a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3530b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar) {
        super(new Handler());
        this.f3530b = bVar;
    }

    @Override // android.database.ContentObserver
    public final boolean deliverSelfNotifications() {
        switch (this.f3529a) {
            case 0:
                return true;
            default:
                return super.deliverSelfNotifications();
        }
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z4, Uri uri) {
        switch (this.f3529a) {
            case 1:
                ((u) this.f3530b).c();
                break;
            default:
                super.onChange(z4, uri);
                break;
        }
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z4) {
        Cursor cursor;
        switch (this.f3529a) {
            case 0:
                b bVar = (b) this.f3530b;
                if (bVar.f3532c && (cursor = bVar.f3533d) != null && !cursor.isClosed()) {
                    bVar.f3531b = bVar.f3533d.requery();
                    break;
                }
                break;
            default:
                super.onChange(z4);
                break;
        }
    }
}
