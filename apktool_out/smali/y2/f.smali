.class public final synthetic Ly2/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx2/b;


# instance fields
.field public final synthetic a:Ly2/g;

.field public final synthetic b:Ljava/util/concurrent/Executor;

.field public final synthetic c:Ly2/f;


# direct methods
.method public synthetic constructor <init>(Ly2/g;Ljava/util/concurrent/Executor;Ly2/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly2/f;->a:Ly2/g;

    iput-object p2, p0, Ly2/f;->b:Ljava/util/concurrent/Executor;

    iput-object p3, p0, Ly2/f;->c:Ly2/f;

    return-void
.end method


# virtual methods
.method public final a(Lx2/d;)V
    .locals 5

    iget-object v0, p0, Ly2/f;->a:Ly2/g;

    iget-boolean v1, v0, Ly2/g;->r:Z

    iget-object v2, p0, Ly2/f;->b:Ljava/util/concurrent/Executor;

    iget-object v3, p0, Ly2/f;->c:Ly2/f;

    if-eqz v1, :cond_1

    invoke-virtual {p1}, Lx2/d;->e()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {v0}, Ly2/c;->close()V

    sget-object p1, Ly2/h;->l:Ly2/h;

    if-eqz v3, :cond_4

    if-nez v2, :cond_0

    invoke-virtual {v3, p1}, Ly2/f;->b(Lc3/h;)V

    goto :goto_1

    :cond_0
    new-instance v0, Le/k0;

    const/16 v1, 0xc

    invoke-direct {v0, p1, v1, v3}, Le/k0;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    invoke-interface {v2, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    goto :goto_1

    :cond_1
    iget-object v1, v0, Ly2/c;->l:Ljava/util/List;

    instance-of v1, v1, Ly2/e;

    if-eqz v1, :cond_3

    if-nez v3, :cond_2

    const/4 v1, 0x0

    goto :goto_0

    :cond_2
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    :goto_0
    iput-object v1, v0, Ly2/c;->l:Ljava/util/List;

    :cond_3
    check-cast p1, Ly2/m;

    iput-object p1, v0, Ly2/c;->n:Ly2/m;

    new-instance v1, Ly2/f;

    invoke-direct {v1, v0, v2, v3}, Ly2/f;-><init>(Ly2/g;Ljava/util/concurrent/Executor;Ly2/f;)V

    iget-object p1, p1, Ly2/m;->d:Ly2/i;

    new-instance v3, Landroidx/emoji2/text/n;

    const/4 v4, 0x3

    invoke-direct {v3, v0, v2, v1, v4}, Landroidx/emoji2/text/n;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {p1, v3}, Ly2/i;->execute(Ljava/lang/Runnable;)V

    :cond_4
    :goto_1
    return-void
.end method

.method public final b(Lc3/h;)V
    .locals 3

    iget-object v0, p0, Ly2/f;->a:Ly2/g;

    iget-boolean v1, v0, Ly2/g;->s:Z

    iget-object v2, p0, Ly2/f;->c:Ly2/f;

    if-eqz v1, :cond_0

    sget-object v1, Ly2/h;->m:Ly2/h;

    if-ne p1, v1, :cond_0

    const/4 p1, 0x0

    iput-boolean p1, v0, Ly2/g;->s:Z

    new-instance p1, Ly2/f;

    iget-object v1, p0, Ly2/f;->b:Ljava/util/concurrent/Executor;

    invoke-direct {p1, v0, v1, v2}, Ly2/f;-><init>(Ly2/g;Ljava/util/concurrent/Executor;Ly2/f;)V

    const/4 v0, 0x0

    invoke-static {v0, p1}, Ly2/d;->b(Lj/a;Lx2/b;)V

    goto :goto_0

    :cond_0
    if-eqz v2, :cond_1

    invoke-virtual {v2, p1}, Ly2/f;->b(Lc3/h;)V

    :cond_1
    :goto_0
    return-void
.end method
