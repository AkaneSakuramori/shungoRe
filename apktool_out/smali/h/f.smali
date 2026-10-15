.class public final Lh/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnAttachStateChangeListener;


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lh/f;->b:I

    iput-object p2, p0, Lh/f;->c:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final onViewAttachedToWindow(Landroid/view/View;)V
    .locals 2

    iget p1, p0, Lh/f;->b:I

    packed-switch p1, :pswitch_data_0

    iget-object p1, p0, Lh/f;->c:Ljava/lang/Object;

    check-cast p1, Li2/n;

    sget v0, Li2/n;->x:I

    iget-object v0, p1, Li2/n;->v:Lj0/d;

    if-eqz v0, :cond_0

    iget-object v0, p1, Li2/n;->u:Landroid/view/accessibility/AccessibilityManager;

    if-eqz v0, :cond_0

    sget-object v1, Li0/v0;->a:Ljava/util/WeakHashMap;

    invoke-static {p1}, Li0/h0;->b(Landroid/view/View;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object p1, p1, Li2/n;->v:Lj0/d;

    invoke-static {v0, p1}, Lj0/c;->a(Landroid/view/accessibility/AccessibilityManager;Lj0/d;)Z

    :cond_0
    :pswitch_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public final onViewDetachedFromWindow(Landroid/view/View;)V
    .locals 2

    iget v0, p0, Lh/f;->b:I

    iget-object v1, p0, Lh/f;->c:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    check-cast v1, Li2/n;

    sget p1, Li2/n;->x:I

    iget-object p1, v1, Li2/n;->v:Lj0/d;

    if-eqz p1, :cond_0

    iget-object v0, v1, Li2/n;->u:Landroid/view/accessibility/AccessibilityManager;

    if-eqz v0, :cond_0

    invoke-static {v0, p1}, Lj0/c;->b(Landroid/view/accessibility/AccessibilityManager;Lj0/d;)Z

    :cond_0
    return-void

    :pswitch_0
    check-cast v1, Lh/h0;

    iget-object v0, v1, Lh/h0;->q:Landroid/view/ViewTreeObserver;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroid/view/ViewTreeObserver;->isAlive()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    iput-object v0, v1, Lh/h0;->q:Landroid/view/ViewTreeObserver;

    :cond_1
    iget-object v0, v1, Lh/h0;->q:Landroid/view/ViewTreeObserver;

    iget-object v1, v1, Lh/h0;->k:Lh/e;

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->removeGlobalOnLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    :cond_2
    invoke-virtual {p1, p0}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    return-void

    :pswitch_1
    check-cast v1, Lh/i;

    iget-object v0, v1, Lh/i;->z:Landroid/view/ViewTreeObserver;

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Landroid/view/ViewTreeObserver;->isAlive()Z

    move-result v0

    if-nez v0, :cond_3

    invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    iput-object v0, v1, Lh/i;->z:Landroid/view/ViewTreeObserver;

    :cond_3
    iget-object v0, v1, Lh/i;->z:Landroid/view/ViewTreeObserver;

    iget-object v1, v1, Lh/i;->k:Lh/e;

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->removeGlobalOnLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    :cond_4
    invoke-virtual {p1, p0}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
