.class public final Li0/a;
.super Landroid/view/View$AccessibilityDelegate;
.source "SourceFile"


# instance fields
.field public final a:Li0/c;


# direct methods
.method public constructor <init>(Li0/c;)V
    .locals 0

    invoke-direct {p0}, Landroid/view/View$AccessibilityDelegate;-><init>()V

    iput-object p1, p0, Li0/a;->a:Li0/c;

    return-void
.end method


# virtual methods
.method public final dispatchPopulateAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z
    .locals 1

    iget-object v0, p0, Li0/a;->a:Li0/c;

    invoke-virtual {v0, p1, p2}, Li0/c;->a(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z

    move-result p1

    return p1
.end method

.method public final getAccessibilityNodeProvider(Landroid/view/View;)Landroid/view/accessibility/AccessibilityNodeProvider;
    .locals 1

    iget-object v0, p0, Li0/a;->a:Li0/c;

    invoke-virtual {v0, p1}, Li0/c;->b(Landroid/view/View;)Lc/a;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p1, p1, Lc/a;->a:Ljava/lang/Object;

    check-cast p1, Landroid/view/accessibility/AccessibilityNodeProvider;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public final onInitializeAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 1

    iget-object v0, p0, Li0/a;->a:Li0/c;

    invoke-virtual {v0, p1, p2}, Li0/c;->c(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

    return-void
.end method

.method public final onInitializeAccessibilityNodeInfo(Landroid/view/View;Landroid/view/accessibility/AccessibilityNodeInfo;)V
    .locals 9

    new-instance v0, Lj0/o;

    invoke-direct {v0, p2}, Lj0/o;-><init>(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    sget-object v1, Li0/v0;->a:Ljava/util/WeakHashMap;

    new-instance v1, Li0/a0;

    const v2, 0x7f0801bc

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3}, Li0/a0;-><init>(II)V

    invoke-virtual {v1, p1}, Li0/c0;->a(Landroid/view/View;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    move v1, v3

    :goto_0
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    const-string v5, "androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY"

    const/16 v6, 0x1c

    if-lt v4, v6, :cond_1

    invoke-static {p2, v1}, Landroidx/emoji2/text/b;->s(Landroid/view/accessibility/AccessibilityNodeInfo;Z)V

    goto :goto_1

    :cond_1
    invoke-static {p2}, Lj0/j;->c(Landroid/view/accessibility/AccessibilityNodeInfo;)Landroid/os/Bundle;

    move-result-object v7

    if-eqz v7, :cond_2

    invoke-virtual {v7, v5, v3}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v8

    and-int/lit8 v8, v8, -0x2

    or-int/2addr v1, v8

    invoke-virtual {v7, v5, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    :cond_2
    :goto_1
    new-instance v1, Li0/a0;

    const/4 v7, 0x3

    const v8, 0x7f0801b7

    invoke-direct {v1, v8, v7}, Li0/a0;-><init>(II)V

    invoke-virtual {v1, p1}, Li0/c0;->a(Landroid/view/View;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_3

    goto :goto_2

    :cond_3
    move v2, v3

    :goto_2
    const/4 v1, 0x2

    if-lt v4, v6, :cond_4

    invoke-static {p2, v2}, Landroidx/emoji2/text/b;->x(Landroid/view/accessibility/AccessibilityNodeInfo;Z)V

    goto :goto_4

    :cond_4
    invoke-static {p2}, Lj0/j;->c(Landroid/view/accessibility/AccessibilityNodeInfo;)Landroid/os/Bundle;

    move-result-object v7

    if-eqz v7, :cond_6

    invoke-virtual {v7, v5, v3}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v8

    and-int/lit8 v8, v8, -0x3

    if-eqz v2, :cond_5

    move v2, v1

    goto :goto_3

    :cond_5
    move v2, v3

    :goto_3
    or-int/2addr v2, v8

    invoke-virtual {v7, v5, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    :cond_6
    :goto_4
    invoke-static {p1}, Li0/v0;->d(Landroid/view/View;)Ljava/lang/CharSequence;

    move-result-object v2

    if-lt v4, v6, :cond_7

    invoke-static {p2, v2}, Landroidx/emoji2/text/b;->r(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/CharSequence;)V

    goto :goto_5

    :cond_7
    invoke-static {p2}, Lj0/j;->c(Landroid/view/accessibility/AccessibilityNodeInfo;)Landroid/os/Bundle;

    move-result-object v5

    const-string v6, "androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY"

    invoke-virtual {v5, v6, v2}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    :goto_5
    new-instance v2, Li0/a0;

    const v5, 0x7f0801bd

    const/16 v6, 0x40

    const/16 v7, 0x1e

    invoke-direct {v2, v5, v6, v7, v1}, Li0/a0;-><init>(IIII)V

    invoke-virtual {v2, p1}, Li0/c0;->a(Landroid/view/View;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    if-lt v4, v7, :cond_8

    invoke-static {p2, v1}, Lj0/k;->c(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/CharSequence;)V

    goto :goto_6

    :cond_8
    invoke-static {p2}, Lj0/j;->c(Landroid/view/accessibility/AccessibilityNodeInfo;)Landroid/os/Bundle;

    move-result-object v2

    const-string v4, "androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY"

    invoke-virtual {v2, v4, v1}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    :goto_6
    iget-object v1, p0, Li0/a;->a:Li0/c;

    invoke-virtual {v1, p1, v0}, Li0/c;->d(Landroid/view/View;Lj0/o;)V

    invoke-virtual {p2}, Landroid/view/accessibility/AccessibilityNodeInfo;->getText()Ljava/lang/CharSequence;

    const p2, 0x7f0801b5

    invoke-virtual {p1, p2}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    if-nez p1, :cond_9

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object p1

    :cond_9
    :goto_7
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p2

    if-ge v3, p2, :cond_a

    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lj0/i;

    invoke-virtual {v0, p2}, Lj0/o;->b(Lj0/i;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_7

    :cond_a
    return-void
.end method

.method public final onPopulateAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 1

    iget-object v0, p0, Li0/a;->a:Li0/c;

    invoke-virtual {v0, p1, p2}, Li0/c;->e(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

    return-void
.end method

.method public final onRequestSendAccessibilityEvent(Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z
    .locals 1

    iget-object v0, p0, Li0/a;->a:Li0/c;

    invoke-virtual {v0, p1, p2, p3}, Li0/c;->f(Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z

    move-result p1

    return p1
.end method

.method public final performAccessibilityAction(Landroid/view/View;ILandroid/os/Bundle;)Z
    .locals 1

    iget-object v0, p0, Li0/a;->a:Li0/c;

    invoke-virtual {v0, p1, p2, p3}, Li0/c;->g(Landroid/view/View;ILandroid/os/Bundle;)Z

    move-result p1

    return p1
.end method

.method public final sendAccessibilityEvent(Landroid/view/View;I)V
    .locals 1

    iget-object v0, p0, Li0/a;->a:Li0/c;

    invoke-virtual {v0, p1, p2}, Li0/c;->h(Landroid/view/View;I)V

    return-void
.end method

.method public final sendAccessibilityEventUnchecked(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 1

    iget-object v0, p0, Li0/a;->a:Li0/c;

    invoke-virtual {v0, p1, p2}, Li0/c;->i(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

    return-void
.end method
