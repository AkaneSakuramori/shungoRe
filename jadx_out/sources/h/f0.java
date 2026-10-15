package h;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;

/* JADX INFO: loaded from: classes.dex */
public class f0 extends d implements Menu {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d0.a f2357d;

    public f0(Context context, d0.a aVar) {
        super(context);
        if (aVar == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f2357d = aVar;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i4) {
        return m(((o) this.f2357d).add(i4));
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i4, int i5, int i6, ComponentName componentName, Intent[] intentArr, Intent intent, int i7, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int iAddIntentOptions = ((o) this.f2357d).addIntentOptions(i4, i5, i6, componentName, intentArr, intent, i7, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i8 = 0; i8 < length; i8++) {
                menuItemArr[i8] = m(menuItemArr2[i8]);
            }
        }
        return iAddIntentOptions;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i4) {
        return ((o) this.f2357d).addSubMenu(i4);
    }

    @Override // android.view.Menu
    public final void clear() {
        n.k kVar = (n.k) this.f2351b;
        if (kVar != null) {
            kVar.clear();
        }
        n.k kVar2 = (n.k) this.f2352c;
        if (kVar2 != null) {
            kVar2.clear();
        }
        ((o) this.f2357d).clear();
    }

    @Override // android.view.Menu
    public final void close() {
        ((o) this.f2357d).c(true);
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i4) {
        return m(((o) this.f2357d).findItem(i4));
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i4) {
        return m(((o) this.f2357d).getItem(i4));
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        return ((o) this.f2357d).hasVisibleItems();
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i4, KeyEvent keyEvent) {
        return ((o) this.f2357d).isShortcutKey(i4, keyEvent);
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i4, int i5) {
        return ((o) this.f2357d).performIdentifierAction(i4, i5);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i4, KeyEvent keyEvent, int i5) {
        return ((o) this.f2357d).performShortcut(i4, keyEvent, i5);
    }

    @Override // android.view.Menu
    public final void removeGroup(int i4) {
        if (((n.k) this.f2351b) != null) {
            int i5 = 0;
            while (true) {
                n.k kVar = (n.k) this.f2351b;
                if (i5 >= kVar.f3524d) {
                    break;
                }
                if (((d0.b) kVar.h(i5)).getGroupId() == i4) {
                    ((n.k) this.f2351b).i(i5);
                    i5--;
                }
                i5++;
            }
        }
        ((o) this.f2357d).removeGroup(i4);
    }

    @Override // android.view.Menu
    public final void removeItem(int i4) {
        if (((n.k) this.f2351b) != null) {
            int i5 = 0;
            while (true) {
                n.k kVar = (n.k) this.f2351b;
                if (i5 >= kVar.f3524d) {
                    break;
                }
                if (((d0.b) kVar.h(i5)).getItemId() == i4) {
                    ((n.k) this.f2351b).i(i5);
                    break;
                }
                i5++;
            }
        }
        ((o) this.f2357d).removeItem(i4);
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i4, boolean z4, boolean z5) {
        ((o) this.f2357d).setGroupCheckable(i4, z4, z5);
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i4, boolean z4) {
        ((o) this.f2357d).setGroupEnabled(i4, z4);
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i4, boolean z4) {
        ((o) this.f2357d).setGroupVisible(i4, z4);
    }

    @Override // android.view.Menu
    public final void setQwertyMode(boolean z4) {
        this.f2357d.setQwertyMode(z4);
    }

    @Override // android.view.Menu
    public final int size() {
        return ((o) this.f2357d).f2431f.size();
    }

    @Override // android.view.Menu
    public final MenuItem add(int i4, int i5, int i6, int i7) {
        return m(((o) this.f2357d).add(i4, i5, i6, i7));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i4, int i5, int i6, CharSequence charSequence) {
        return ((o) this.f2357d).addSubMenu(i4, i5, i6, charSequence);
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return m(((o) this.f2357d).a(0, 0, 0, charSequence));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i4, int i5, int i6, int i7) {
        return ((o) this.f2357d).addSubMenu(i4, i5, i6, i7);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return ((o) this.f2357d).addSubMenu(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i4, int i5, int i6, CharSequence charSequence) {
        return m(((o) this.f2357d).a(i4, i5, i6, charSequence));
    }
}
