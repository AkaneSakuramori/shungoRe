.class public final Lj/b;
.super Lc3/h;
.source "SourceFile"


# static fields
.field public static volatile k:Lj/b;


# instance fields
.field public final j:Lj/e;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lj/e;

    invoke-direct {v0}, Lj/e;-><init>()V

    iput-object v0, p0, Lj/b;->j:Lj/e;

    return-void
.end method

.method public static Q2()Lj/b;
    .locals 2

    sget-object v0, Lj/b;->k:Lj/b;

    if-eqz v0, :cond_0

    sget-object v0, Lj/b;->k:Lj/b;

    return-object v0

    :cond_0
    const-class v0, Lj/b;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lj/b;->k:Lj/b;

    if-nez v1, :cond_1

    new-instance v1, Lj/b;

    invoke-direct {v1}, Lj/b;-><init>()V

    sput-object v1, Lj/b;->k:Lj/b;

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_1
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    sget-object v0, Lj/b;->k:Lj/b;

    return-object v0

    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method
