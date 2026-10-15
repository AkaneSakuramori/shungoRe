package defpackage;

import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import c3.i;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import s3.b;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class a {
    public static final void a(int i4, View view) {
        if (i4 == 0) {
            throw null;
        }
        int i5 = i4 - 1;
        if (i5 == 0) {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            if (viewGroup != null) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                }
                viewGroup.removeView(view);
                return;
            }
            return;
        }
        if (i5 == 1) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
            }
            view.setVisibility(0);
            return;
        }
        if (i5 == 2) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
            }
            view.setVisibility(8);
            return;
        }
        if (i5 != 3) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
        }
        view.setVisibility(4);
    }

    public static int b(int i4) {
        if (i4 == 0) {
            return 2;
        }
        if (i4 == 4) {
            return 4;
        }
        if (i4 == 8) {
            return 3;
        }
        throw new IllegalArgumentException(e("Unknown visibility ", i4));
    }

    public static int c(View view) {
        if (view.getAlpha() == 0.0f && view.getVisibility() == 0) {
            return 4;
        }
        return b(view.getVisibility());
    }

    public static /* synthetic */ long d(int i4) {
        if (i4 == 1) {
            return 0L;
        }
        if (i4 == 2) {
            return 1L;
        }
        if (i4 == 3) {
            return 2L;
        }
        if (i4 == 4) {
            return 3L;
        }
        if (i4 == 5) {
            return 4L;
        }
        throw null;
    }

    public static String e(String str, int i4) {
        return str + i4;
    }

    public static String f(String str, String str2) {
        return str + str2;
    }

    public static String g(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String h(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static /* synthetic */ Iterator i() {
        try {
            return Arrays.asList(new s3.a()).iterator();
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }

    public static /* synthetic */ void j(Parcelable parcelable) {
        if (parcelable != null) {
            throw new ClassCastException();
        }
    }

    public static /* synthetic */ void k(i iVar) {
        if (iVar != null) {
            throw new ClassCastException();
        }
    }

    public static /* synthetic */ void l(Object obj) {
        throw new ClassCastException();
    }

    public static /* synthetic */ Iterator m() {
        try {
            return Arrays.asList(new b()).iterator();
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }

    public static /* synthetic */ void n(Object obj) {
        if (obj != null) {
            throw new ClassCastException();
        }
    }

    public static /* synthetic */ String o(int i4) {
        switch (i4) {
            case 1:
                return "NONE";
            case 2:
                return "LEFT";
            case 3:
                return "TOP";
            case 4:
                return "RIGHT";
            case 5:
                return "BOTTOM";
            case 6:
                return "BASELINE";
            case 7:
                return "CENTER";
            case 8:
                return "CENTER_X";
            case 9:
                return "CENTER_Y";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String p(int i4) {
        if (i4 == 1) {
            return "NONE";
        }
        if (i4 != 2) {
            return i4 != 3 ? "null" : "REMOVING";
        }
        return "ADDING";
    }

    public static /* synthetic */ String q(int i4) {
        if (i4 == 1) {
            return "REMOVED";
        }
        if (i4 == 2) {
            return "VISIBLE";
        }
        if (i4 != 3) {
            return i4 != 4 ? "null" : "INVISIBLE";
        }
        return "GONE";
    }

    public static /* synthetic */ String r(int i4) {
        switch (i4) {
            case 1:
                return "UNKNOWN";
            case 2:
                return "HORIZONTAL_DIMENSION";
            case 3:
                return "VERTICAL_DIMENSION";
            case 4:
                return "LEFT";
            case 5:
                return "RIGHT";
            case 6:
                return "TOP";
            case 7:
                return "BOTTOM";
            case 8:
                return "BASELINE";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String s(int i4) {
        switch (i4) {
            case 1:
                return "BEGIN_ARRAY";
            case 2:
                return "END_ARRAY";
            case 3:
                return "BEGIN_OBJECT";
            case 4:
                return "END_OBJECT";
            case 5:
                return "NAME";
            case 6:
                return "STRING";
            case 7:
                return "NUMBER";
            case 8:
                return "BOOLEAN";
            case 9:
                return "NULL";
            case 10:
                return "END_DOCUMENT";
            default:
                return "null";
        }
    }
}
