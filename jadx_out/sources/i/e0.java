package i;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes.dex */
public class e0 extends ImageView {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f2556b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d0 f2557c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f2558d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        n3.a(context);
        this.f2558d = false;
        m3.a(this, getContext());
        r rVar = new r(this);
        this.f2556b = rVar;
        rVar.e(attributeSet, i4);
        d0 d0Var = new d0(this);
        this.f2557c = d0Var;
        d0Var.b(attributeSet, i4);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        r rVar = this.f2556b;
        if (rVar != null) {
            rVar.a();
        }
        d0 d0Var = this.f2557c;
        if (d0Var != null) {
            d0Var.a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        r rVar = this.f2556b;
        if (rVar != null) {
            return rVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        r rVar = this.f2556b;
        if (rVar != null) {
            return rVar.d();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        o3 o3Var;
        d0 d0Var = this.f2557c;
        if (d0Var == null || (o3Var = (o3) d0Var.f2551d) == null) {
            return null;
        }
        return (ColorStateList) o3Var.f2739c;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        o3 o3Var;
        d0 d0Var = this.f2557c;
        if (d0Var == null || (o3Var = (o3) d0Var.f2551d) == null) {
            return null;
        }
        return (PorterDuff.Mode) o3Var.f2740d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return ((((ImageView) this.f2557c.f2550c).getBackground() instanceof RippleDrawable) ^ true) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        r rVar = this.f2556b;
        if (rVar != null) {
            rVar.f();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i4) {
        super.setBackgroundResource(i4);
        r rVar = this.f2556b;
        if (rVar != null) {
            rVar.g(i4);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        d0 d0Var = this.f2557c;
        if (d0Var != null) {
            d0Var.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        d0 d0Var = this.f2557c;
        if (d0Var != null && drawable != null && !this.f2558d) {
            d0Var.f2549b = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (d0Var != null) {
            d0Var.a();
            if (this.f2558d) {
                return;
            }
            ImageView imageView = (ImageView) d0Var.f2550c;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(d0Var.f2549b);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i4) {
        super.setImageLevel(i4);
        this.f2558d = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i4) {
        d0 d0Var = this.f2557c;
        if (d0Var != null) {
            d0Var.c(i4);
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        d0 d0Var = this.f2557c;
        if (d0Var != null) {
            d0Var.a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        r rVar = this.f2556b;
        if (rVar != null) {
            rVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        r rVar = this.f2556b;
        if (rVar != null) {
            rVar.j(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        d0 d0Var = this.f2557c;
        if (d0Var != null) {
            d0Var.d(colorStateList);
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        d0 d0Var = this.f2557c;
        if (d0Var != null) {
            d0Var.e(mode);
        }
    }
}
