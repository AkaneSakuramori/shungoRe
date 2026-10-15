.class public final Li/h;
.super Lh/a0;
.source "SourceFile"


# instance fields
.field public final synthetic m:I

.field public final synthetic n:Li/m;


# direct methods
.method public constructor <init>(Li/m;Landroid/content/Context;Lh/i0;Landroid/view/View;)V
    .locals 8

    const/4 v0, 0x0

    iput v0, p0, Li/h;->m:I

    iput-object p1, p0, Li/h;->n:Li/m;

    const/4 v7, 0x0

    const v2, 0x7f030022

    const/4 v3, 0x0

    move-object v1, p0

    move-object v4, p2

    move-object v5, p4

    move-object v6, p3

    .line 4
    invoke-direct/range {v1 .. v7}, Lh/a0;-><init>(IILandroid/content/Context;Landroid/view/View;Lh/o;Z)V

    .line 5
    iget-object p2, p3, Lh/i0;->A:Lh/q;

    .line 6
    invoke-virtual {p2}, Lh/q;->f()Z

    move-result p2

    if-nez p2, :cond_1

    .line 7
    iget-object p2, p1, Li/m;->j:Li/l;

    if-nez p2, :cond_0

    .line 8
    iget-object p2, p1, Li/m;->i:Lh/e0;

    .line 9
    check-cast p2, Landroid/view/View;

    :cond_0
    iput-object p2, p0, Lh/a0;->f:Landroid/view/View;

    .line 10
    :cond_1
    iget-object p1, p1, Li/m;->x:Le/n0;

    iput-object p1, p0, Lh/a0;->i:Lh/b0;

    iget-object p2, p0, Lh/a0;->j:Lh/x;

    if-eqz p2, :cond_2

    .line 11
    invoke-interface {p2, p1}, Lh/c0;->e(Lh/b0;)V

    :cond_2
    return-void
.end method

.method public constructor <init>(Li/m;Landroid/content/Context;Lh/o;Li/l;)V
    .locals 7

    const/4 v6, 0x1

    const/4 v0, 0x1

    iput v0, p0, Li/h;->m:I

    iput-object p1, p0, Li/h;->n:Li/m;

    const v1, 0x7f030022

    const/4 v2, 0x0

    move-object v0, p0

    move-object v3, p2

    move-object v4, p4

    move-object v5, p3

    .line 1
    invoke-direct/range {v0 .. v6}, Lh/a0;-><init>(IILandroid/content/Context;Landroid/view/View;Lh/o;Z)V

    const p2, 0x800005

    iput p2, p0, Lh/a0;->g:I

    .line 2
    iget-object p1, p1, Li/m;->x:Le/n0;

    iput-object p1, p0, Lh/a0;->i:Lh/b0;

    iget-object p2, p0, Lh/a0;->j:Lh/x;

    if-eqz p2, :cond_0

    .line 3
    invoke-interface {p2, p1}, Lh/c0;->e(Lh/b0;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public final c()V
    .locals 4

    iget v0, p0, Li/h;->m:I

    const/4 v1, 0x0

    iget-object v2, p0, Li/h;->n:Li/m;

    packed-switch v0, :pswitch_data_0

    iget-object v0, v2, Li/m;->d:Lh/o;

    if-eqz v0, :cond_0

    const/4 v3, 0x1

    invoke-virtual {v0, v3}, Lh/o;->c(Z)V

    :cond_0
    iput-object v1, v2, Li/m;->t:Li/h;

    invoke-super {p0}, Lh/a0;->c()V

    return-void

    :pswitch_0
    iput-object v1, v2, Li/m;->u:Li/h;

    invoke-super {p0}, Lh/a0;->c()V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
