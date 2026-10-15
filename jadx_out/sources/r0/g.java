package r0;

import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.View;
import androidx.emoji2.text.m;
import androidx.emoji2.text.s;

/* JADX INFO: loaded from: classes.dex */
public final class g implements KeyListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final KeyListener f4040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f2.e f4041b;

    public g(KeyListener keyListener) {
        f2.e eVar = new f2.e(19);
        this.f4040a = keyListener;
        this.f4041b = eVar;
    }

    @Override // android.text.method.KeyListener
    public final void clearMetaKeyState(View view, Editable editable, int i4) {
        this.f4040a.clearMetaKeyState(view, editable, i4);
    }

    @Override // android.text.method.KeyListener
    public final int getInputType() {
        return this.f4040a.getInputType();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002a  */
    /* JADX WARN: Code duplicated, block: B:17:? A[RETURN, SYNTHETIC] */
    @Override // android.text.method.KeyListener
    public final boolean onKeyDown(View view, Editable editable, int i4, KeyEvent keyEvent) {
        boolean zA;
        this.f4041b.getClass();
        Object obj = m.f608i;
        if (i4 != 67) {
            if (i4 == 112) {
                zA = s.a(editable, keyEvent, true);
            }
            if (this.f4040a.onKeyDown(view, editable, i4, keyEvent)) {
                return true;
            }
            return false;
        }
        zA = s.a(editable, keyEvent, false);
        if (zA) {
            MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
            return true;
        }
        if (this.f4040a.onKeyDown(view, editable, i4, keyEvent)) {
            return true;
        }
        return false;
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f4040a.onKeyOther(view, editable, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyUp(View view, Editable editable, int i4, KeyEvent keyEvent) {
        return this.f4040a.onKeyUp(view, editable, i4, keyEvent);
    }
}
