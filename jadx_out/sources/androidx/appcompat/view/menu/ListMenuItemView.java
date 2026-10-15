package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import com.shungo.app.R;
import d.a;
import e.c;
import h.d0;
import h.o;
import h.q;
import i0.e0;
import i0.v0;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements d0, AbsListView.SelectionBoundsAdjuster {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public q f359b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ImageView f360c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public RadioButton f361d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f362e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public CheckBox f363f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TextView f364g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ImageView f365h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ImageView f366i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public LinearLayout f367j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Drawable f368k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f369l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Context f370m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f371n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Drawable f372o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f373p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public LayoutInflater f374q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f375r;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        c cVarU = c.u(getContext(), attributeSet, a.f1671r, R.attr.listMenuViewStyle);
        this.f368k = cVarU.h(5);
        this.f369l = cVarU.n(1, -1);
        this.f371n = cVarU.b(7, false);
        this.f370m = context;
        this.f372o = cVarU.h(8);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.divider}, R.attr.dropDownListViewStyle, 0);
        this.f373p = typedArrayObtainStyledAttributes.hasValue(0);
        cVarU.v();
        typedArrayObtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.f374q == null) {
            this.f374q = LayoutInflater.from(getContext());
        }
        return this.f374q;
    }

    private void setSubMenuArrowVisible(boolean z4) {
        ImageView imageView = this.f365h;
        if (imageView != null) {
            imageView.setVisibility(z4 ? 0 : 8);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f366i;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f366i.getLayoutParams();
        rect.top = this.f366i.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0037  */
    /* JADX WARN: Code duplicated, block: B:25:0x0059  */
    @Override // h.d0
    public final void c(q qVar) {
        boolean z4;
        int i4;
        String string;
        this.f359b = qVar;
        setVisibility(qVar.isVisible() ? 0 : 8);
        setTitle(qVar.f2457e);
        setCheckable(qVar.isCheckable());
        if (qVar.f2466n.o()) {
            if ((qVar.f2466n.n() ? qVar.f2462j : qVar.f2460h) != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
        } else {
            z4 = false;
        }
        qVar.f2466n.n();
        if (z4) {
            q qVar2 = this.f359b;
            if (qVar2.f2466n.o()) {
                i4 = (qVar2.f2466n.n() ? qVar2.f2462j : qVar2.f2460h) == 0 ? 8 : 0;
            }
        }
        if (i4 == 0) {
            TextView textView = this.f364g;
            q qVar3 = this.f359b;
            char c5 = qVar3.f2466n.n() ? qVar3.f2462j : qVar3.f2460h;
            if (c5 == 0) {
                string = "";
            } else {
                o oVar = qVar3.f2466n;
                Resources resources = oVar.f2426a.getResources();
                StringBuilder sb = new StringBuilder();
                if (ViewConfiguration.get(oVar.f2426a).hasPermanentMenuKey()) {
                    sb.append(resources.getString(R.string.abc_prepend_shortcut_label));
                }
                int i5 = oVar.n() ? qVar3.f2463k : qVar3.f2461i;
                q.c(i5, 65536, resources.getString(R.string.abc_menu_meta_shortcut_label), sb);
                q.c(i5, 4096, resources.getString(R.string.abc_menu_ctrl_shortcut_label), sb);
                q.c(i5, 2, resources.getString(R.string.abc_menu_alt_shortcut_label), sb);
                q.c(i5, 1, resources.getString(R.string.abc_menu_shift_shortcut_label), sb);
                q.c(i5, 4, resources.getString(R.string.abc_menu_sym_shortcut_label), sb);
                q.c(i5, 8, resources.getString(R.string.abc_menu_function_shortcut_label), sb);
                if (c5 == '\b') {
                    sb.append(resources.getString(R.string.abc_menu_delete_shortcut_label));
                } else if (c5 == '\n') {
                    sb.append(resources.getString(R.string.abc_menu_enter_shortcut_label));
                } else if (c5 != ' ') {
                    sb.append(c5);
                } else {
                    sb.append(resources.getString(R.string.abc_menu_space_shortcut_label));
                }
                string = sb.toString();
            }
            textView.setText(string);
        }
        if (this.f364g.getVisibility() != i4) {
            this.f364g.setVisibility(i4);
        }
        setIcon(qVar.getIcon());
        setEnabled(qVar.isEnabled());
        setSubMenuArrowVisible(qVar.hasSubMenu());
        setContentDescription(qVar.f2469q);
    }

    @Override // h.d0
    public q getItemData() {
        return this.f359b;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        WeakHashMap weakHashMap = v0.f2983a;
        e0.q(this, this.f368k);
        TextView textView = (TextView) findViewById(R.id.title);
        this.f362e = textView;
        int i4 = this.f369l;
        if (i4 != -1) {
            textView.setTextAppearance(this.f370m, i4);
        }
        this.f364g = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.f365h = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f372o);
        }
        this.f366i = (ImageView) findViewById(R.id.group_divider);
        this.f367j = (LinearLayout) findViewById(R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i4, int i5) {
        if (this.f360c != null && this.f371n) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f360c.getLayoutParams();
            int i6 = layoutParams.height;
            if (i6 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i6;
            }
        }
        super.onMeasure(i4, i5);
    }

    public void setCheckable(boolean z4) {
        CompoundButton compoundButton;
        View view;
        if (!z4 && this.f361d == null && this.f363f == null) {
            return;
        }
        if ((this.f359b.f2476x & 4) != 0) {
            if (this.f361d == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f361d = radioButton;
                LinearLayout linearLayout = this.f367j;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f361d;
            view = this.f363f;
        } else {
            if (this.f363f == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f363f = checkBox;
                LinearLayout linearLayout2 = this.f367j;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f363f;
            view = this.f361d;
        }
        if (z4) {
            compoundButton.setChecked(this.f359b.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox2 = this.f363f;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        RadioButton radioButton2 = this.f361d;
        if (radioButton2 != null) {
            radioButton2.setVisibility(8);
        }
    }

    public void setChecked(boolean z4) {
        CompoundButton compoundButton;
        if ((this.f359b.f2476x & 4) != 0) {
            if (this.f361d == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f361d = radioButton;
                LinearLayout linearLayout = this.f367j;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f361d;
        } else {
            if (this.f363f == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f363f = checkBox;
                LinearLayout linearLayout2 = this.f367j;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f363f;
        }
        compoundButton.setChecked(z4);
    }

    public void setForceShowIcon(boolean z4) {
        this.f375r = z4;
        this.f371n = z4;
    }

    public void setGroupDividerEnabled(boolean z4) {
        ImageView imageView = this.f366i;
        if (imageView != null) {
            imageView.setVisibility((this.f373p || !z4) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        this.f359b.f2466n.getClass();
        boolean z4 = this.f375r;
        if (z4 || this.f371n) {
            ImageView imageView = this.f360c;
            if (imageView == null && drawable == null && !this.f371n) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.f360c = imageView2;
                LinearLayout linearLayout = this.f367j;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.f371n) {
                this.f360c.setVisibility(8);
                return;
            }
            ImageView imageView3 = this.f360c;
            if (!z4) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.f360c.getVisibility() != 0) {
                this.f360c.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.f362e.getVisibility() != 8) {
                this.f362e.setVisibility(8);
            }
        } else {
            this.f362e.setText(charSequence);
            if (this.f362e.getVisibility() != 0) {
                this.f362e.setVisibility(0);
            }
        }
    }
}
