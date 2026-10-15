package com.topjohnwu.superuser.internal;

import android.content.ComponentName;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
final class a implements c {
    private IBinder a;

    a(IBinder iBinder) {
        this.a = iBinder;
    }

    public final void a(int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.topjohnwu.superuser.internal.IRootServiceManager");
            parcelObtain.writeInt(i);
            this.a.transact(1, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.a;
    }

    public final void b(ComponentName componentName, int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.topjohnwu.superuser.internal.IRootServiceManager");
            parcelObtain.writeInt(1);
            componentName.writeToParcel(parcelObtain, 0);
            parcelObtain.writeInt(i);
            this.a.transact(2, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }
}
