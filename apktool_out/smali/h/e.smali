.class public final Lh/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lh/e;->b:I

    iput-object p2, p0, Lh/e;->c:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final onGlobalLayout()V
    .locals 4

    iget v0, p0, Lh/e;->b:I

    iget-object v1, p0, Lh/e;->c:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    check-cast v1, Li/t0;

    iget-object v0, v1, Li/t0;->H:Li/w0;

    sget-object v2, Li0/v0;->a:Ljava/util/WeakHashMap;

    invoke-static {v0}, Li0/h0;->b(Landroid/view/View;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, v1, Li/t0;->F:Landroid/graphics/Rect;

    invoke-virtual {v0, v2}, Landroid/view/View;->getGlobalVisibleRect(Landroid/graphics/Rect;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {v1}, Li/t0;->s()V

    invoke-virtual {v1}, Li/m2;->h()V

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Li/m2;->dismiss()V

    :goto_0
    return-void

    :pswitch_0
    check-cast v1, Li/w0;

    invoke-virtual {v1}, Li/w0;->getInternalPopup()Li/v0;

    move-result-object v0

    invoke-interface {v0}, Li/v0;->a()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {v1}, Li/o0;->b(Landroid/view/View;)I

    move-result v0

    invoke-static {v1}, Li/o0;->a(Landroid/view/View;)I

    move-result v2

    iget-object v3, v1, Li/w0;->g:Li/v0;

    invoke-interface {v3, v0, v2}, Li/v0;->e(II)V

    :cond_1
    invoke-virtual {v1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-static {v0, p0}, Li/n0;->a(Landroid/view/ViewTreeObserver;Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    :cond_2
    return-void

    :pswitch_1
    check-cast v1, Lh/h0;

    invoke-virtual {v1}, Lh/h0;->a()Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object v0, v1, Lh/h0;->j:Li/s2;

    iget-boolean v2, v0, Li/m2;->z:Z

    if-nez v2, :cond_5

    iget-object v2, v1, Lh/h0;->o:Landroid/view/View;

    if-eqz v2, :cond_4

    invoke-virtual {v2}, Landroid/view/View;->isShown()Z

    move-result v2

    if-nez v2, :cond_3

    goto :goto_1

    :cond_3
    invoke-virtual {v0}, Li/m2;->h()V

    goto :goto_2

    :cond_4
    :goto_1
    invoke-virtual {v1}, Lh/h0;->dismiss()V

    :cond_5
    :goto_2
    return-void

    :pswitch_2
    check-cast v1, Lh/i;

    invoke-virtual {v1}, Lh/i;->a()Z

    move-result v0

    if-eqz v0, :cond_8

    iget-object v0, v1, Lh/i;->j:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-lez v2, :cond_8

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lh/h;

    iget-object v2, v2, Lh/h;->a:Li/s2;

    iget-boolean v2, v2, Li/m2;->z:Z

    if-nez v2, :cond_8

    iget-object v2, v1, Lh/i;->q:Landroid/view/View;

    if-eqz v2, :cond_7

    invoke-virtual {v2}, Landroid/view/View;->isShown()Z

    move-result v2

    if-nez v2, :cond_6

    goto :goto_4

    :cond_6
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_8

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lh/h;

    iget-object v1, v1, Lh/h;->a:Li/s2;

    invoke-virtual {v1}, Li/m2;->h()V

    goto :goto_3

    :cond_7
    :goto_4
    invoke-virtual {v1}, Lh/i;->dismiss()V

    :cond_8
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
