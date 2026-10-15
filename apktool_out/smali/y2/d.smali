.class public abstract Ly2/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:[Ly2/m;

.field public static b:Z

.field public static c:Ly2/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x1

    new-array v0, v0, [Ly2/m;

    sput-object v0, Ly2/d;->a:[Ly2/m;

    return-void
.end method

.method public static declared-synchronized a()Ly2/m;
    .locals 3

    const-class v0, Ly2/d;

    monitor-enter v0

    :try_start_0
    invoke-static {}, Ly2/d;->c()Ly2/m;

    move-result-object v1

    if-nez v1, :cond_1

    const/4 v1, 0x1

    sput-boolean v1, Ly2/d;->b:Z

    sget-object v1, Ly2/d;->c:Ly2/a;

    if-nez v1, :cond_0

    new-instance v1, Ly2/a;

    invoke-direct {v1}, Ly2/a;-><init>()V

    sput-object v1, Ly2/d;->c:Ly2/a;

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    sget-object v1, Ly2/d;->c:Ly2/a;

    invoke-virtual {v1}, Ly2/a;->a()Ly2/m;

    move-result-object v1

    const/4 v2, 0x0

    sput-boolean v2, Ly2/d;->b:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    monitor-exit v0

    return-object v1

    :goto_1
    monitor-exit v0

    throw v1
.end method

.method public static b(Lj/a;Lx2/b;)V
    .locals 3

    invoke-static {}, Ly2/d;->c()Ly2/m;

    move-result-object v0

    if-eqz v0, :cond_1

    if-nez p0, :cond_0

    invoke-interface {p1, v0}, Lx2/b;->a(Lx2/d;)V

    goto :goto_0

    :cond_0
    new-instance v1, Le/k0;

    const/16 v2, 0xb

    invoke-direct {v1, p1, v2, v0}, Le/k0;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    invoke-virtual {p0, v1}, Lj/a;->execute(Ljava/lang/Runnable;)V

    goto :goto_0

    :cond_1
    sget-object v0, Lx2/d;->b:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Le/k0;

    const/16 v2, 0xa

    invoke-direct {v1, p0, v2, p1}, Le/k0;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    :goto_0
    return-void
.end method

.method public static c()Ly2/m;
    .locals 4

    sget-object v0, Ly2/d;->a:[Ly2/m;

    monitor-enter v0

    const/4 v1, 0x0

    :try_start_0
    aget-object v2, v0, v1

    if-eqz v2, :cond_0

    iget v3, v2, Ly2/m;->c:I

    if-gez v3, :cond_0

    const/4 v3, 0x0

    aput-object v3, v0, v1

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0

    return-object v2

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
