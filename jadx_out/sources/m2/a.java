package m2;

import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
public final enum a extends g {
    public a() {
        super("IDENTITY", 0);
    }

    @Override // m2.h
    public final String a(Field field) {
        return field.getName();
    }
}
