.class public final Ls3/c;
.super Lr3/q0;
.source "SourceFile"

# interfaces
.implements Lr3/t;


# instance fields
.field private volatile _immediate:Ls3/c;

.field public final d:Landroid/os/Handler;

.field public final e:Ljava/lang/String;

.field public final f:Z

.field public final g:Ls3/c;


# direct methods
.method public constructor <init>(Landroid/os/Handler;)V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 3
    invoke-direct {p0, p1, v0, v1}, Ls3/c;-><init>(Landroid/os/Handler;Ljava/lang/String;Z)V

    return-void
.end method

.method public constructor <init>(Landroid/os/Handler;Ljava/lang/String;Z)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lr3/k;-><init>()V

    iput-object p1, p0, Ls3/c;->d:Landroid/os/Handler;

    iput-object p2, p0, Ls3/c;->e:Ljava/lang/String;

    iput-boolean p3, p0, Ls3/c;->f:Z

    if-eqz p3, :cond_0

    move-object p3, p0

    goto :goto_0

    :cond_0
    const/4 p3, 0x0

    :goto_0
    iput-object p3, p0, Ls3/c;->_immediate:Ls3/c;

    iget-object p3, p0, Ls3/c;->_immediate:Ls3/c;

    if-nez p3, :cond_1

    .line 2
    new-instance p3, Ls3/c;

    const/4 v0, 0x1

    invoke-direct {p3, p1, p2, v0}, Ls3/c;-><init>(Landroid/os/Handler;Ljava/lang/String;Z)V

    iput-object p3, p0, Ls3/c;->_immediate:Ls3/c;

    :cond_1
    iput-object p3, p0, Ls3/c;->g:Ls3/c;

    return-void
.end method


# virtual methods
.method public final C()Z
    .locals 2

    iget-boolean v0, p0, Ls3/c;->f:Z

    if-eqz v0, :cond_1

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    iget-object v1, p0, Ls3/c;->d:Landroid/os/Handler;

    invoke-virtual {v1}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-static {v0, v1}, Lc3/h;->I(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Ls3/c;

    if-eqz v0, :cond_0

    check-cast p1, Ls3/c;

    iget-object p1, p1, Ls3/c;->d:Landroid/os/Handler;

    iget-object v0, p0, Ls3/c;->d:Landroid/os/Handler;

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Ls3/c;->d:Landroid/os/Handler;

    invoke-static {v0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    sget-object v0, Lr3/x;->a:Lkotlinx/coroutines/scheduling/d;

    sget-object v0, Lkotlinx/coroutines/internal/k;->a:Lr3/q0;

    if-ne p0, v0, :cond_0

    const-string v0, "Dispatchers.Main"

    goto :goto_1

    :cond_0
    const/4 v1, 0x0

    :try_start_0
    check-cast v0, Ls3/c;

    iget-object v0, v0, Ls3/c;->g:Ls3/c;
    :try_end_0
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-object v0, v1

    :goto_0
    if-ne p0, v0, :cond_1

    const-string v0, "Dispatchers.Main.immediate"

    goto :goto_1

    :cond_1
    move-object v0, v1

    :goto_1
    if-nez v0, :cond_3

    iget-object v0, p0, Ls3/c;->e:Ljava/lang/String;

    if-nez v0, :cond_2

    iget-object v0, p0, Ls3/c;->d:Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/Handler;->toString()Ljava/lang/String;

    move-result-object v0

    :cond_2
    iget-boolean v1, p0, Ls3/c;->f:Z

    if-eqz v1, :cond_3

    const-string v1, ".immediate"

    invoke-static {v0, v1}, La;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :cond_3
    return-object v0
.end method

.method public final z(Lc3/k;Ljava/lang/Runnable;)V
    .locals 3

    iget-object v0, p0, Ls3/c;->d:Landroid/os/Handler;

    invoke-virtual {v0, p2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    move-result v0

    if-nez v0, :cond_1

    new-instance v0, Ljava/util/concurrent/CancellationException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "The task was rejected, the handler underlying the dispatcher \'"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, "\' was closed"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    sget-object v1, Lr3/l;->c:Lr3/l;

    invoke-interface {p1, v1}, Lc3/k;->e(Lc3/j;)Lc3/i;

    move-result-object v1

    check-cast v1, Lr3/i0;

    if-eqz v1, :cond_0

    check-cast v1, Lr3/p0;

    invoke-virtual {v1, v0}, Lr3/p0;->j(Ljava/lang/Object;)Z

    :cond_0
    sget-object v0, Lr3/x;->b:Lkotlinx/coroutines/scheduling/c;

    invoke-virtual {v0, p1, p2}, Lkotlinx/coroutines/scheduling/c;->z(Lc3/k;Ljava/lang/Runnable;)V

    :cond_1
    return-void
.end method
