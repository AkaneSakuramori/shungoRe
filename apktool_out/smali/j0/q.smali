.class public abstract Lj0/q;
.super Lj0/p;
.source "SourceFile"


# virtual methods
.method public final findFocus(I)Landroid/view/accessibility/AccessibilityNodeInfo;
    .locals 1

    iget-object v0, p0, Lj0/p;->a:Lc/a;

    invoke-virtual {v0, p1}, Lc/a;->c(I)Lj0/o;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    iget-object p1, p1, Lj0/o;->a:Landroid/view/accessibility/AccessibilityNodeInfo;

    return-object p1
.end method
