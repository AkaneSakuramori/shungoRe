package r0;

import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import androidx.emoji2.text.m;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes.dex */
public final class a extends f2.e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final EditText f4026d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final k f4027e;

    public a(EditText editText) {
        super(17);
        this.f4026d = editText;
        k kVar = new k(editText);
        this.f4027e = kVar;
        editText.addTextChangedListener(kVar);
        if (c.f4032b == null) {
            synchronized (c.f4031a) {
                try {
                    if (c.f4032b == null) {
                        c cVar = new c();
                        try {
                            c.f4033c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, c.class.getClassLoader());
                        } catch (Throwable unused) {
                        }
                        c.f4032b = cVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        editText.setEditableFactory(c.f4032b);
    }

    @Override // f2.e
    public final InputConnection G(InputConnection inputConnection, EditorInfo editorInfo) {
        return inputConnection instanceof d ? inputConnection : new d(this.f4026d, inputConnection, editorInfo);
    }

    @Override // f2.e
    public final void O(boolean z4) {
        k kVar = this.f4027e;
        if (kVar.f4050e != z4) {
            if (kVar.f4049d != null) {
                m mVarA = m.a();
                j jVar = kVar.f4049d;
                mVarA.getClass();
                c3.h.Z(jVar, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = mVarA.f610a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    mVarA.f611b.remove(jVar);
                    reentrantReadWriteLock.writeLock().unlock();
                } catch (Throwable th) {
                    reentrantReadWriteLock.writeLock().unlock();
                    throw th;
                }
            }
            kVar.f4050e = z4;
            if (z4) {
                k.a(kVar.f4047b, m.a().b());
            }
        }
    }

    @Override // f2.e
    public final KeyListener v(KeyListener keyListener) {
        if (keyListener instanceof g) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new g(keyListener);
    }
}
