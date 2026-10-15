package com.auth0.android.provider;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import c3.h;
import com.auth0.android.request.internal.b;
import j1.g;
import j1.l;
import j1.m;
import j1.p0;
import l2.f;

/* JADX INFO: loaded from: classes.dex */
public class AuthenticationActivity extends Activity {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f1300d = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f1301b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public l f1302c;

    public static void a(Intent intent) {
        if (p0.f3211b == null) {
            Log.w(p0.f3210a, "There is no previous instance of this provider.");
            return;
        }
        g gVar = new g(intent);
        h hVar = p0.f3211b;
        h.X(hVar);
        if (hVar.n2(gVar)) {
            p0.f3211b = null;
        }
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i4, int i5, Intent intent) {
        if (i5 == 0) {
            intent = new Intent();
        }
        a(intent);
        finish();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f1301b = bundle.getBoolean("com.auth0.android.EXTRA_INTENT_LAUNCHED", false);
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        l lVar = this.f1302c;
        if (lVar != null) {
            h.X(lVar);
            Log.v("l", "Trying to unbind the service");
            Context context = (Context) lVar.f3190b.get();
            if (lVar.f3196h && context != null) {
                context.unbindService(lVar);
                lVar.f3196h = false;
            }
            l2.g gVar = lVar.f3194f;
            if (!gVar.f3397h) {
                f fVar = gVar.f3394e;
                if (fVar != null) {
                    gVar.f3390a.unbindService(fVar);
                }
                gVar.f3390a = null;
                gVar.f3397h = true;
            }
            this.f1302c = null;
        }
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        Intent intent = getIntent();
        if (!this.f1301b && intent.getExtras() == null) {
            finish();
            return;
        }
        if (this.f1301b) {
            if (intent.getData() == null) {
                setResult(0);
            }
            a(intent);
            finish();
            return;
        }
        this.f1301b = true;
        Bundle extras = getIntent().getExtras();
        h.X(extras);
        final Uri uri = (Uri) extras.getParcelable("com.auth0.android.EXTRA_AUTHORIZE_URI");
        Parcelable parcelable = extras.getParcelable("com.auth0.android.EXTRA_CT_OPTIONS");
        h.X(parcelable);
        final boolean z4 = extras.getBoolean("com.auth0.android.EXTRA_LAUNCH_AS_TWA", false);
        l lVar = new l(this, (m) parcelable, new l2.g(this));
        this.f1302c = lVar;
        lVar.b();
        final l lVar2 = this.f1302c;
        h.X(lVar2);
        h.X(uri);
        final b bVarD = b.f1309b.d();
        final j1.f fVar = new j1.f(this);
        final Context context = (Context) lVar2.f3190b.get();
        if (context == null) {
            Log.v("l", "Custom Tab Context was no longer valid.");
        } else {
            bVarD.f1311a.a(new Runnable() { // from class: j1.k
                @Override // java.lang.Runnable
                public final void run() {
                    l lVar3 = lVar2;
                    lVar3.getClass();
                    boolean z5 = z4;
                    Context context2 = context;
                    Uri uri2 = uri;
                    try {
                        if (z5) {
                            lVar3.f3194f.a(lVar3.f3195g.b(context2, uri2));
                        } else {
                            lVar3.c(context2, uri2);
                        }
                    } catch (ActivityNotFoundException unused) {
                        Log.e("l", "Could not find any Browser application installed in this device to handle the intent.");
                    } catch (SecurityException e5) {
                        g1.c cVar = new g1.c("An error occurred when trying to authenticate with the server.", e5);
                        cVar.f2306b = "a0.browser_not_available";
                        cVar.f2307c = "Error launching browser for authentication";
                        bVarD.b(new e.k0(fVar, 3, cVar));
                    }
                }
            });
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        h.b0(bundle, "outState");
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("com.auth0.android.EXTRA_INTENT_LAUNCHED", this.f1301b);
    }
}
