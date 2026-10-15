.class public final Li/k;
.super Li/c2;
.source "SourceFile"


# instance fields
.field public final synthetic k:I

.field public final synthetic l:Ljava/lang/Object;

.field public final synthetic m:Landroid/view/View;


# direct methods
.method public synthetic constructor <init>(Landroid/view/View;Landroid/view/View;Ljava/lang/Object;I)V
    .locals 0

    iput p4, p0, Li/k;->k:I

    iput-object p1, p0, Li/k;->m:Landroid/view/View;

    iput-object p3, p0, Li/k;->l:Ljava/lang/Object;

    invoke-direct {p0, p2}, Li/c2;-><init>(Landroid/view/View;)V

    return-void
.end method


# virtual methods
.method public final b()Lh/g0;
    .locals 1

    iget v0, p0, Li/k;->k:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Li/k;->l:Ljava/lang/Object;

    check-cast v0, Li/t0;

    return-object v0

    :pswitch_0
    iget-object v0, p0, Li/k;->m:Landroid/view/View;

    check-cast v0, Li/l;

    iget-object v0, v0, Li/l;->e:Li/m;

    iget-object v0, v0, Li/m;->t:Li/h;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lh/a0;->a()Lh/x;

    move-result-object v0

    :goto_0
    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final c()Z
    .locals 4

    iget v0, p0, Li/k;->k:I

    const/4 v1, 0x1

    iget-object v2, p0, Li/k;->m:Landroid/view/View;

    packed-switch v0, :pswitch_data_0

    check-cast v2, Li/w0;

    invoke-virtual {v2}, Li/w0;->getInternalPopup()Li/v0;

    move-result-object v0

    invoke-interface {v0}, Li/v0;->a()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {v2}, Li/o0;->b(Landroid/view/View;)I

    move-result v0

    invoke-static {v2}, Li/o0;->a(Landroid/view/View;)I

    move-result v3

    iget-object v2, v2, Li/w0;->g:Li/v0;

    invoke-interface {v2, v0, v3}, Li/v0;->e(II)V

    :cond_0
    return v1

    :pswitch_0
    check-cast v2, Li/l;

    iget-object v0, v2, Li/l;->e:Li/m;

    invoke-virtual {v0}, Li/m;->l()Z

    return v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final d()Z
    .locals 3

    iget v0, p0, Li/k;->k:I

    const/4 v1, 0x1

    packed-switch v0, :pswitch_data_0

    invoke-super {p0}, Li/c2;->d()Z

    return v1

    :pswitch_0
    iget-object v0, p0, Li/k;->m:Landroid/view/View;

    check-cast v0, Li/l;

    iget-object v0, v0, Li/l;->e:Li/m;

    iget-object v2, v0, Li/m;->v:Li/j;

    if-eqz v2, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Li/m;->f()Z

    :goto_0
    return v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
