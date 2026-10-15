.class public final Lw2/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li1/a;


# instance fields
.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Lt3/w;

.field public final synthetic e:Ljava/lang/Boolean;

.field public final synthetic f:Lc3/e;

.field public final synthetic g:Landroid/content/Context;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Lt3/w;Ljava/lang/Boolean;Lc3/m;Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw2/c;->b:Ljava/lang/String;

    iput-object p2, p0, Lw2/c;->c:Ljava/lang/String;

    iput-object p3, p0, Lw2/c;->d:Lt3/w;

    iput-object p4, p0, Lw2/c;->e:Ljava/lang/Boolean;

    iput-object p5, p0, Lw2/c;->f:Lc3/e;

    iput-object p6, p0, Lw2/c;->g:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final a(Lf1/b;)V
    .locals 1

    check-cast p1, Lh1/d;

    const-string p1, "Shungo"

    const-string v0, "couldn\'t get credentials on authenticated request"

    invoke-static {p1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p1, p0, Lw2/c;->f:Lc3/e;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Lc3/e;->b(Ljava/lang/Object;)V

    return-void
.end method

.method public final b(Ljava/lang/Object;)V
    .locals 5

    check-cast p1, Lcom/auth0/android/result/Credentials;

    const-string v0, "credentials"

    invoke-static {p1, v0}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lt3/y;

    invoke-direct {v0}, Lt3/y;-><init>()V

    iget-object v1, p0, Lw2/c;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lt3/y;->e(Ljava/lang/String;)V

    const-string v1, "Authorization"

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Bearer "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/auth0/android/result/Credentials;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lt3/y;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "Token"

    invoke-virtual {p1}, Lcom/auth0/android/result/Credentials;->c()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Lt3/y;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, "version"

    const-string v1, "1.7.2"

    invoke-virtual {v0, p1, v1}, Lt3/y;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lw2/c;->c:Ljava/lang/String;

    if-eqz p1, :cond_0

    sget-object v1, Lw2/d;->a:Lt3/u;

    invoke-static {p1, v1}, Lf2/e;->h(Ljava/lang/String;Lt3/u;)Lt3/z;

    move-result-object p1

    const-string v1, "Content-Type"

    const-string v2, "application/json"

    invoke-virtual {v0, v1, v2}, Lt3/y;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "POST"

    invoke-virtual {v0, v1, p1}, Lt3/y;->d(Ljava/lang/String;Lt3/z;)V

    :cond_0
    invoke-virtual {v0}, Lt3/y;->b()Li/w;

    move-result-object p1

    iget-object v0, p0, Lw2/c;->d:Lt3/w;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Lx3/j;

    const/4 v2, 0x0

    invoke-direct {v1, v0, p1, v2}, Lx3/j;-><init>(Lt3/w;Li/w;Z)V

    new-instance p1, Lw2/b;

    iget-object v0, p0, Lw2/c;->e:Ljava/lang/Boolean;

    iget-object v3, p0, Lw2/c;->f:Lc3/e;

    iget-object v4, p0, Lw2/c;->g:Landroid/content/Context;

    invoke-direct {p1, v0, v3, v4}, Lw2/b;-><init>(Ljava/lang/Boolean;Lc3/e;Landroid/content/Context;)V

    iget-object v0, v1, Lx3/j;->h:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v3, 0x1

    invoke-virtual {v0, v2, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-eqz v0, :cond_6

    sget-object v0, Lb4/l;->a:Lb4/l;

    sget-object v0, Lb4/l;->a:Lb4/l;

    invoke-virtual {v0}, Lb4/l;->g()Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v1, Lx3/j;->i:Ljava/lang/Object;

    iget-object v0, v1, Lx3/j;->f:Lt3/n;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, v1, Lx3/j;->b:Lt3/w;

    iget-object v0, v0, Lt3/w;->b:Lt3/l;

    new-instance v2, Lx3/g;

    invoke-direct {v2, v1, p1}, Lx3/g;-><init>(Lx3/j;Lw2/b;)V

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    monitor-enter v0

    :try_start_0
    iget-object p1, v0, Lt3/l;->b:Ljava/util/ArrayDeque;

    invoke-virtual {p1, v2}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    iget-boolean p1, v1, Lx3/j;->d:Z

    if-nez p1, :cond_5

    iget-object p1, v1, Lx3/j;->c:Li/w;

    iget-object p1, p1, Li/w;->b:Ljava/lang/Object;

    check-cast p1, Lt3/s;

    iget-object p1, p1, Lt3/s;->d:Ljava/lang/String;

    iget-object v1, v0, Lt3/l;->c:Ljava/util/ArrayDeque;

    invoke-virtual {v1}, Ljava/util/ArrayDeque;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lx3/g;

    iget-object v4, v3, Lx3/g;->d:Lx3/j;

    iget-object v4, v4, Lx3/j;->c:Li/w;

    iget-object v4, v4, Li/w;->b:Ljava/lang/Object;

    check-cast v4, Lt3/s;

    iget-object v4, v4, Lt3/s;->d:Ljava/lang/String;

    invoke-static {v4, p1}, Lc3/h;->I(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    goto :goto_0

    :cond_2
    iget-object v1, v0, Lt3/l;->b:Ljava/util/ArrayDeque;

    invoke-virtual {v1}, Ljava/util/ArrayDeque;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lx3/g;

    iget-object v4, v3, Lx3/g;->d:Lx3/j;

    iget-object v4, v4, Lx3/j;->c:Li/w;

    iget-object v4, v4, Li/w;->b:Ljava/lang/Object;

    check-cast v4, Lt3/s;

    iget-object v4, v4, Lt3/s;->d:Ljava/lang/String;

    invoke-static {v4, p1}, Lc3/h;->I(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    goto :goto_0

    :cond_4
    const/4 v3, 0x0

    :goto_0
    if-eqz v3, :cond_5

    iget-object p1, v3, Lx3/g;->c:Ljava/util/concurrent/atomic/AtomicInteger;

    iput-object p1, v2, Lx3/g;->c:Ljava/util/concurrent/atomic/AtomicInteger;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_5
    monitor-exit v0

    invoke-virtual {v0}, Lt3/l;->c()V

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0

    throw p1

    :cond_6
    const-string p1, "Already Executed"

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
