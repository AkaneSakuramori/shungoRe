package i;

import android.text.StaticLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final class m1 extends l1 {
    @Override // i.l1, i.n1
    public void a(StaticLayout.Builder builder, TextView textView) {
        builder.setTextDirection(textView.getTextDirectionHeuristic());
    }

    @Override // i.n1
    public boolean b(TextView textView) {
        return textView.isHorizontallyScrollable();
    }
}
