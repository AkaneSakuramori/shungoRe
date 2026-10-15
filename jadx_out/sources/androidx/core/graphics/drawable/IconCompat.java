package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.os.Build;
import android.os.Parcelable;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import c0.d;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final PorterDuff.Mode f559k = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f561b;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f569j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f560a = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f562c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Parcelable f563d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f564e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f565f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ColorStateList f566g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f567h = f559k;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f568i = null;

    public final String toString() {
        String str;
        int iIntValue;
        if (this.f560a == -1) {
            return String.valueOf(this.f561b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (this.f560a) {
            case 1:
                str = "BITMAP";
                break;
            case 2:
                str = "RESOURCE";
                break;
            case 3:
                str = "DATA";
                break;
            case 4:
                str = "URI";
                break;
            case 5:
                str = "BITMAP_MASKABLE";
                break;
            case 6:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb.append(str);
        switch (this.f560a) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f561b).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.f561b).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.f569j);
                sb.append(" id=");
                int i4 = this.f560a;
                if (i4 == -1) {
                    int i5 = Build.VERSION.SDK_INT;
                    Object obj = this.f561b;
                    if (i5 >= 28) {
                        iIntValue = d.a(obj);
                    } else {
                        iIntValue = 0;
                        try {
                            iIntValue = ((Integer) obj.getClass().getMethod("getResId", new Class[0]).invoke(obj, new Object[0])).intValue();
                        } catch (IllegalAccessException e5) {
                            Log.e("IconCompat", "Unable to get icon resource", e5);
                        } catch (NoSuchMethodException e6) {
                            Log.e("IconCompat", "Unable to get icon resource", e6);
                        } catch (InvocationTargetException e7) {
                            Log.e("IconCompat", "Unable to get icon resource", e7);
                        }
                    }
                } else {
                    if (i4 != 2) {
                        throw new IllegalStateException("called getResId() on " + this);
                    }
                    iIntValue = this.f564e;
                }
                sb.append(String.format("0x%08x", Integer.valueOf(iIntValue)));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f564e);
                if (this.f565f != 0) {
                    sb.append(" off=");
                    sb.append(this.f565f);
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f561b);
                break;
        }
        if (this.f566g != null) {
            sb.append(" tint=");
            sb.append(this.f566g);
        }
        if (this.f567h != f559k) {
            sb.append(" mode=");
            sb.append(this.f567h);
        }
        sb.append(")");
        return sb.toString();
    }
}
