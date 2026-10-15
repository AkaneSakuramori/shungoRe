package z0;

import android.content.Intent;
import android.graphics.Path;
import android.net.Uri;
import android.util.Log;
import android.view.View;
import c3.h;
import com.auth0.android.provider.AuthenticationActivity;
import com.shungo.app.MainActivity;
import j1.m;
import java.lang.reflect.Field;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Field f5430b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f5431c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5432a;

    public /* synthetic */ c(int i4) {
        this.f5432a = i4;
    }

    public static void a(MainActivity mainActivity, Uri uri, boolean z4, m mVar) {
        h.b0(mVar, "options");
        Intent intent = new Intent(mainActivity, (Class<?>) AuthenticationActivity.class);
        intent.putExtra("com.auth0.android.EXTRA_AUTHORIZE_URI", uri);
        intent.putExtra("com.auth0.android.EXTRA_LAUNCH_AS_TWA", z4);
        intent.putExtra("com.auth0.android.EXTRA_CT_OPTIONS", mVar);
        intent.addFlags(67108864);
        mainActivity.startActivity(intent);
    }

    public static f b(g gVar) {
        h.b0(gVar, "owner");
        return new f(gVar);
    }

    public static Path c(float f5, float f6, float f7, float f8) {
        Path path = new Path();
        path.moveTo(f5, f6);
        path.lineTo(f7, f8);
        return path;
    }

    public final String d(long j4, Long l4) {
        switch (this.f5432a) {
            case 14:
                return "Authentication Time (auth_time) claim in the ID token indicates that too much time has passed since the last end-user authentication. Current time (" + j4 + ") is after last auth at (" + l4 + ')';
            default:
                return "Expiration Time (exp) claim error in the ID token; current time (" + j4 + ") is after expiration time (" + l4 + ')';
        }
    }

    public final String e(String str, String str2) {
        switch (this.f5432a) {
            case 17:
                return "Authorized Party (azp) claim mismatch in the ID token; expected \"" + str + "\", found \"" + str2 + '\"';
            case 26:
                return "Issuer (iss) claim mismatch in the ID token, expected \"" + str + "\", found \"" + str2 + '\"';
            default:
                return "Nonce (nonce) claim mismatch in the ID token; expected \"" + str + "\", found \"" + str2 + '\"';
        }
    }

    public final String f(String str, List list) {
        switch (this.f5432a) {
            case 12:
                return "Audience (aud) claim mismatch in the ID token; expected \"" + str + "\" but was not one of \"" + list + '\"';
            default:
                if (list.size() == 1) {
                    return "Signature algorithm of \"" + str + "\" is not supported. Expected the ID token to be signed with " + ((String) list.get(0)) + '.';
                }
                return "Signature algorithm of \"" + str + "\" is not supported. Expected the ID token to be signed with any of " + list + '.';
        }
    }

    public void g(View view, int i4) {
        if (!f5431c) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f5430b = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsBase", "fetchViewFlagsField: ");
            }
            f5431c = true;
        }
        Field field = f5430b;
        if (field != null) {
            try {
                f5430b.setInt(view, i4 | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i4, int i5) {
        this(0);
        this.f5432a = i4;
        switch (i4) {
            case 1:
                this(1);
                break;
            case 2:
            case 3:
            case 10:
            default:
                break;
            case 4:
                this(4);
                break;
            case 5:
                this(5);
                break;
            case 6:
                this(6);
                break;
            case 7:
                this(7);
                break;
            case 8:
                this(8);
                break;
            case 9:
                this(9);
                break;
            case 11:
                this(11);
                break;
            case 12:
                this(12);
                break;
            case 13:
                this(13);
                break;
            case 14:
                this(14);
                break;
            case 15:
                this(15);
                break;
            case 16:
                this(16);
                break;
            case 17:
                this(17);
                break;
            case 18:
                this(18);
                break;
            case 19:
                this(19);
                break;
            case 20:
                this(20);
                break;
            case 21:
                this(21);
                break;
            case 22:
                this(22);
                break;
            case 23:
                this(23);
                break;
            case 24:
                this(24);
                break;
            case 25:
                this(25);
                break;
            case 26:
                this(26);
                break;
            case 27:
                this(27);
                break;
            case 28:
                this(28);
                break;
            case 29:
                this(29);
                break;
        }
    }

    public c() {
        this.f5432a = 2;
    }
}
