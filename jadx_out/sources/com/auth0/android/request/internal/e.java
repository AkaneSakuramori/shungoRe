package com.auth0.android.request.internal;

import com.google.gson.reflect.TypeToken;
import m2.b0;

/* JADX INFO: loaded from: classes.dex */
public final class e implements k1.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f1314a;

    public e(b0 b0Var) {
        this.f1314a = b0Var;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e(Class cls, m2.m mVar) {
        this(mVar.c(TypeToken.get(cls)));
        c3.h.b0(mVar, "gson");
    }
}
