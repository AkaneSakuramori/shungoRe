package i0;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class w1 extends v1 {
    public w1(c2 c2Var, WindowInsets windowInsets) {
        super(c2Var, windowInsets);
    }

    @Override // i0.a2
    public c2 a() {
        return c2.g(null, this.f2975c.consumeDisplayCutout());
    }

    @Override // i0.a2
    public j e() {
        DisplayCutout displayCutout = this.f2975c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new j(displayCutout);
    }

    @Override // i0.u1, i0.a2
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w1)) {
            return false;
        }
        w1 w1Var = (w1) obj;
        return Objects.equals(this.f2975c, w1Var.f2975c) && Objects.equals(this.f2979g, w1Var.f2979g);
    }

    @Override // i0.a2
    public int hashCode() {
        return this.f2975c.hashCode();
    }
}
