.class public final Le/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li0/s;
.implements Li/a2;
.implements Li/q1;
.implements Lh/b0;


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Le/e0;


# direct methods
.method public synthetic constructor <init>(Le/e0;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Le/t;->b:I

    iput-object p1, p0, Le/t;->c:Le/e0;

    return-void
.end method


# virtual methods
.method public final b(Lh/o;Z)V
    .locals 9

    iget v0, p0, Le/t;->b:I

    iget-object v1, p0, Le/t;->c:Le/e0;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p1}, Lh/o;->k()Lh/o;

    move-result-object v0

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eq v0, p1, :cond_0

    move v4, v3

    goto :goto_0

    :cond_0
    move v4, v2

    :goto_0
    if-eqz v4, :cond_1

    move-object p1, v0

    :cond_1
    iget-object v5, v1, Le/e0;->M:[Le/d0;

    if-eqz v5, :cond_2

    array-length v6, v5

    goto :goto_1

    :cond_2
    move v6, v2

    :goto_1
    if-ge v2, v6, :cond_4

    aget-object v7, v5, v2

    if-eqz v7, :cond_3

    iget-object v8, v7, Le/d0;->h:Lh/o;

    if-ne v8, p1, :cond_3

    goto :goto_2

    :cond_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_4
    const/4 v7, 0x0

    :goto_2
    if-eqz v7, :cond_6

    if-eqz v4, :cond_5

    iget p1, v7, Le/d0;->a:I

    invoke-virtual {v1, p1, v7, v0}, Le/e0;->q(ILe/d0;Lh/o;)V

    invoke-virtual {v1, v7, v3}, Le/e0;->s(Le/d0;Z)V

    goto :goto_3

    :cond_5
    invoke-virtual {v1, v7, p2}, Le/e0;->s(Le/d0;Z)V

    :cond_6
    :goto_3
    return-void

    :pswitch_0
    invoke-virtual {v1, p1}, Le/e0;->r(Lh/o;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_0
    .end packed-switch
.end method

.method public final k(Lh/o;)Z
    .locals 4

    iget v0, p0, Le/t;->b:I

    const/4 v1, 0x1

    const/16 v2, 0x6c

    iget-object v3, p0, Le/t;->c:Le/e0;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p1}, Lh/o;->k()Lh/o;

    move-result-object v0

    if-ne p1, v0, :cond_0

    iget-boolean v0, v3, Le/e0;->G:Z

    if-eqz v0, :cond_0

    iget-object v0, v3, Le/e0;->m:Landroid/view/Window;

    invoke-virtual {v0}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-boolean v3, v3, Le/e0;->R:Z

    if-nez v3, :cond_0

    invoke-interface {v0, v2, p1}, Landroid/view/Window$Callback;->onMenuOpened(ILandroid/view/Menu;)Z

    :cond_0
    return v1

    :pswitch_0
    iget-object v0, v3, Le/e0;->m:Landroid/view/Window;

    invoke-virtual {v0}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-interface {v0, v2, p1}, Landroid/view/Window$Callback;->onMenuOpened(ILandroid/view/Menu;)Z

    :cond_1
    return v1

    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_0
    .end packed-switch
.end method

.method public final q(Landroid/view/View;Li0/c2;)Li0/c2;
    .locals 5

    invoke-virtual {p2}, Li0/c2;->d()I

    move-result v0

    iget-object v1, p0, Le/t;->c:Le/e0;

    const/4 v2, 0x0

    invoke-virtual {v1, p2, v2}, Le/e0;->J(Li0/c2;Landroid/graphics/Rect;)I

    move-result v1

    if-eq v0, v1, :cond_0

    invoke-virtual {p2}, Li0/c2;->b()I

    move-result v0

    invoke-virtual {p2}, Li0/c2;->c()I

    move-result v2

    invoke-virtual {p2}, Li0/c2;->a()I

    move-result v3

    new-instance v4, Le/n0;

    invoke-direct {v4, p2}, Le/n0;-><init>(Li0/c2;)V

    invoke-static {v0, v1, v2, v3}, Lb0/c;->b(IIII)Lb0/c;

    move-result-object p2

    iget-object v0, v4, Le/n0;->c:Ljava/lang/Object;

    check-cast v0, Li0/t1;

    invoke-virtual {v0, p2}, Li0/t1;->g(Lb0/c;)V

    invoke-virtual {v4}, Le/n0;->v()Li0/c2;

    move-result-object p2

    :cond_0
    sget-object v0, Li0/v0;->a:Ljava/util/WeakHashMap;

    invoke-virtual {p2}, Li0/c2;->f()Landroid/view/WindowInsets;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-static {p1, v0}, Li0/i0;->b(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/view/WindowInsets;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {p1, v1}, Li0/c2;->g(Landroid/view/View;Landroid/view/WindowInsets;)Li0/c2;

    move-result-object p2

    :cond_1
    return-object p2
.end method
