.class public final Ly2/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:J

.field public final b:I


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x14

    iput-wide v0, p0, Ly2/a;->a:J

    const/4 v0, 0x0

    iput v0, p0, Ly2/a;->b:I

    return-void
.end method


# virtual methods
.method public final a()Ly2/m;
    .locals 6

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Ly2/a;->c(I)Z

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    if-nez v1, :cond_0

    const/4 v1, 0x2

    invoke-virtual {p0, v1}, Ly2/a;->c(I)Z

    move-result v4

    if-eqz v4, :cond_0

    :try_start_0
    new-array v1, v1, [Ljava/lang/String;

    const-string v4, "su"

    aput-object v4, v1, v2

    const-string v4, "--mount-master"

    aput-object v4, v1, v0

    invoke-virtual {p0, v1}, Ly2/a;->b([Ljava/lang/String;)Ly2/m;

    move-result-object v1
    :try_end_0
    .catch Lx2/a; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    invoke-virtual {v1}, Lx2/d;->e()Z

    move-result v4
    :try_end_1
    .catch Lx2/a; {:try_start_1 .. :try_end_1} :catch_1

    if-nez v4, :cond_1

    :catch_0
    :cond_0
    move-object v1, v3

    :catch_1
    :cond_1
    if-nez v1, :cond_3

    invoke-virtual {p0, v0}, Ly2/a;->c(I)Z

    move-result v4

    if-nez v4, :cond_3

    :try_start_2
    new-array v4, v0, [Ljava/lang/String;

    const-string v5, "su"

    aput-object v5, v4, v2

    invoke-virtual {p0, v4}, Ly2/a;->b([Ljava/lang/String;)Ly2/m;

    move-result-object v1

    invoke-virtual {v1}, Lx2/d;->e()Z

    move-result v2
    :try_end_2
    .catch Lx2/a; {:try_start_2 .. :try_end_2} :catch_2

    if-nez v2, :cond_2

    goto :goto_0

    :cond_2
    move-object v3, v1

    :goto_0
    move-object v1, v3

    :catch_2
    :cond_3
    if-nez v1, :cond_5

    invoke-virtual {p0, v0}, Ly2/a;->c(I)Z

    move-result v0

    if-nez v0, :cond_4

    const-class v0, Ly2/r;

    monitor-enter v0

    monitor-exit v0

    :cond_4
    const-string v0, "sh"

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ly2/a;->b([Ljava/lang/String;)Ly2/m;

    move-result-object v1

    :cond_5
    return-object v1
.end method

.method public final varargs b([Ljava/lang/String;)Ly2/m;
    .locals 4

    const-string v0, "Unable to create a shell!"

    :try_start_0
    const-string v1, " "

    invoke-static {v1, p1}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;[Ljava/lang/Object;)Ljava/lang/String;

    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/Runtime;->exec([Ljava/lang/String;)Ljava/lang/Process;

    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    :try_start_1
    new-instance v1, Ly2/m;

    invoke-direct {v1, p0, p1}, Ly2/m;-><init>(Ly2/a;Ljava/lang/Process;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    :try_start_2
    const-class p1, Ly2/d;

    monitor-enter p1
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    :try_start_3
    sget-boolean v2, Ly2/d;->b:Z

    if-eqz v2, :cond_0

    sget-object v2, Ly2/d;->a:[Ly2/m;

    monitor-enter v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    const/4 v3, 0x0

    :try_start_4
    aput-object v1, v2, v3

    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :try_start_5
    throw v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    :catchall_1
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    :try_start_6
    monitor-exit p1

    return-object v1

    :goto_1
    monitor-exit p1

    throw v1

    :catch_0
    move-exception p1

    new-instance v1, Lx2/a;

    invoke-direct {v1, v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_1

    :catch_1
    move-exception p1

    new-instance v1, Lx2/a;

    invoke-direct {v1, v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method public final c(I)Z
    .locals 1

    iget v0, p0, Ly2/a;->b:I

    and-int/2addr v0, p1

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
