.class public final Lc4/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc4/n;


# instance fields
.field public final a:Lc4/l;

.field public b:Lc4/n;


# direct methods
.method public constructor <init>(Lc4/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc4/m;->a:Lc4/l;

    return-void
.end method


# virtual methods
.method public final a(Ljavax/net/ssl/SSLSocket;)Z
    .locals 1

    iget-object v0, p0, Lc4/m;->a:Lc4/l;

    invoke-interface {v0, p1}, Lc4/l;->a(Ljavax/net/ssl/SSLSocket;)Z

    move-result p1

    return p1
.end method

.method public final b(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;
    .locals 1

    invoke-virtual {p0, p1}, Lc4/m;->e(Ljavax/net/ssl/SSLSocket;)Lc4/n;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lc4/n;->b(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public final c()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final d(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V
    .locals 1

    const-string v0, "protocols"

    invoke-static {p3, v0}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lc4/m;->e(Ljavax/net/ssl/SSLSocket;)Lc4/n;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0, p1, p2, p3}, Lc4/n;->d(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V

    :cond_0
    return-void
.end method

.method public final declared-synchronized e(Ljavax/net/ssl/SSLSocket;)Lc4/n;
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lc4/m;->b:Lc4/n;

    if-nez v0, :cond_0

    iget-object v0, p0, Lc4/m;->a:Lc4/l;

    invoke-interface {v0, p1}, Lc4/l;->a(Ljavax/net/ssl/SSLSocket;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lc4/m;->a:Lc4/l;

    invoke-interface {v0, p1}, Lc4/l;->b(Ljavax/net/ssl/SSLSocket;)Lc4/n;

    move-result-object p1

    iput-object p1, p0, Lc4/m;->b:Lc4/n;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    iget-object p1, p0, Lc4/m;->b:Lc4/n;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p1

    :goto_1
    monitor-exit p0

    throw p1
.end method
