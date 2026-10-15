.class public final Lx3/l;
.super La4/j;
.source "SourceFile"


# instance fields
.field public final b:Lt3/e0;

.field public c:Ljava/net/Socket;

.field public d:Ljava/net/Socket;

.field public e:Lt3/o;

.field public f:Lt3/x;

.field public g:La4/t;

.field public h:Lf4/q;

.field public i:Lf4/p;

.field public j:Z

.field public k:Z

.field public l:I

.field public m:I

.field public n:I

.field public o:I

.field public final p:Ljava/util/ArrayList;

.field public q:J


# direct methods
.method public constructor <init>(Lx3/m;Lt3/e0;)V
    .locals 1

    const-string v0, "connectionPool"

    invoke-static {p1, v0}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "route"

    invoke-static {p2, p1}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lx3/l;->b:Lt3/e0;

    const/4 p1, 0x1

    iput p1, p0, Lx3/l;->o:I

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lx3/l;->p:Ljava/util/ArrayList;

    const-wide p1, 0x7fffffffffffffffL

    iput-wide p1, p0, Lx3/l;->q:J

    return-void
.end method

.method public static d(Lt3/w;Lt3/e0;Ljava/io/IOException;)V
    .locals 3

    const-string v0, "client"

    invoke-static {p0, v0}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "failedRoute"

    invoke-static {p1, v0}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "failure"

    invoke-static {p2, v0}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p1, Lt3/e0;->b:Ljava/net/Proxy;

    invoke-virtual {v0}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object v0

    sget-object v1, Ljava/net/Proxy$Type;->DIRECT:Ljava/net/Proxy$Type;

    if-eq v0, v1, :cond_0

    iget-object v0, p1, Lt3/e0;->a:Lt3/a;

    iget-object v1, v0, Lt3/a;->h:Ljava/net/ProxySelector;

    iget-object v0, v0, Lt3/a;->i:Lt3/s;

    invoke-virtual {v0}, Lt3/s;->h()Ljava/net/URI;

    move-result-object v0

    iget-object v2, p1, Lt3/e0;->b:Ljava/net/Proxy;

    invoke-virtual {v2}, Ljava/net/Proxy;->address()Ljava/net/SocketAddress;

    move-result-object v2

    invoke-virtual {v1, v0, v2, p2}, Ljava/net/ProxySelector;->connectFailed(Ljava/net/URI;Ljava/net/SocketAddress;Ljava/io/IOException;)V

    :cond_0
    iget-object p0, p0, Lt3/w;->z:Lc/a;

    monitor-enter p0

    :try_start_0
    iget-object p2, p0, Lc/a;->a:Ljava/lang/Object;

    check-cast p2, Ljava/util/Set;

    invoke-interface {p2, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method


# virtual methods
.method public final declared-synchronized a(La4/t;La4/g0;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    const-string v0, "connection"

    invoke-static {p1, v0}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "settings"

    invoke-static {p2, p1}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    iget p1, p2, La4/g0;->a:I

    and-int/lit8 p1, p1, 0x10

    if-eqz p1, :cond_0

    iget-object p1, p2, La4/g0;->b:[I

    const/4 p2, 0x4

    aget p1, p1, p2

    goto :goto_0

    :cond_0
    const p1, 0x7fffffff

    :goto_0
    iput p1, p0, Lx3/l;->o:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final b(La4/b0;)V
    .locals 2

    const-string v0, "stream"

    invoke-static {p1, v0}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, La4/b;->g:La4/b;

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, La4/b0;->c(La4/b;Ljava/io/IOException;)V

    return-void
.end method

.method public final c(IIIZLx3/j;Lt3/n;)V
    .locals 15

    move-object v7, p0

    move-object/from16 v8, p5

    move-object/from16 v9, p6

    const-string v10, "proxy"

    const-string v11, "inetSocketAddress"

    const-string v0, "call"

    invoke-static {v8, v0}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "eventListener"

    invoke-static {v9, v0}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, v7, Lx3/l;->f:Lt3/x;

    if-nez v0, :cond_d

    iget-object v0, v7, Lx3/l;->b:Lt3/e0;

    iget-object v0, v0, Lt3/e0;->a:Lt3/a;

    iget-object v0, v0, Lt3/a;->k:Ljava/util/List;

    new-instance v12, Lx3/b;

    invoke-direct {v12, v0}, Lx3/b;-><init>(Ljava/util/List;)V

    iget-object v1, v7, Lx3/l;->b:Lt3/e0;

    iget-object v1, v1, Lt3/e0;->a:Lt3/a;

    iget-object v2, v1, Lt3/a;->c:Ljavax/net/ssl/SSLSocketFactory;

    if-nez v2, :cond_2

    sget-object v1, Lt3/i;->f:Lt3/i;

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, v7, Lx3/l;->b:Lt3/e0;

    iget-object v0, v0, Lt3/e0;->a:Lt3/a;

    iget-object v0, v0, Lt3/a;->i:Lt3/s;

    iget-object v0, v0, Lt3/s;->d:Ljava/lang/String;

    sget-object v1, Lb4/l;->a:Lb4/l;

    sget-object v1, Lb4/l;->a:Lb4/l;

    invoke-virtual {v1, v0}, Lb4/l;->h(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v1, Lx3/n;

    new-instance v2, Ljava/net/UnknownServiceException;

    const-string v3, "CLEARTEXT communication to "

    const-string v4, " not permitted by network security policy"

    invoke-static {v3, v0, v4}, La;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/net/UnknownServiceException;-><init>(Ljava/lang/String;)V

    invoke-direct {v1, v2}, Lx3/n;-><init>(Ljava/io/IOException;)V

    throw v1

    :cond_1
    new-instance v0, Lx3/n;

    new-instance v1, Ljava/net/UnknownServiceException;

    const-string v2, "CLEARTEXT communication not enabled for client"

    invoke-direct {v1, v2}, Ljava/net/UnknownServiceException;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1}, Lx3/n;-><init>(Ljava/io/IOException;)V

    throw v0

    :cond_2
    iget-object v0, v1, Lt3/a;->j:Ljava/util/List;

    sget-object v1, Lt3/x;->g:Lt3/x;

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_c

    :goto_0
    const/4 v13, 0x0

    move-object v14, v13

    :goto_1
    :try_start_0
    iget-object v0, v7, Lx3/l;->b:Lt3/e0;

    iget-object v1, v0, Lt3/e0;->a:Lt3/a;

    iget-object v1, v1, Lt3/a;->c:Ljavax/net/ssl/SSLSocketFactory;

    if-eqz v1, :cond_4

    iget-object v0, v0, Lt3/e0;->b:Ljava/net/Proxy;

    invoke-virtual {v0}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object v0

    sget-object v1, Ljava/net/Proxy$Type;->HTTP:Ljava/net/Proxy$Type;

    if-ne v0, v1, :cond_4

    move-object v1, p0

    move/from16 v2, p1

    move/from16 v3, p2

    move/from16 v4, p3

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    invoke-virtual/range {v1 .. v6}, Lx3/l;->f(IIILx3/j;Lt3/n;)V

    iget-object v0, v7, Lx3/l;->c:Ljava/net/Socket;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    if-nez v0, :cond_3

    goto :goto_3

    :cond_3
    move/from16 v1, p1

    move/from16 v2, p2

    goto :goto_2

    :catch_0
    move-exception v0

    move/from16 v1, p1

    move/from16 v2, p2

    goto :goto_5

    :cond_4
    move/from16 v1, p1

    move/from16 v2, p2

    :try_start_1
    invoke-virtual {p0, v1, v2, v8, v9}, Lx3/l;->e(IILx3/j;Lt3/n;)V

    :goto_2
    invoke-virtual {p0, v12, v8, v9}, Lx3/l;->g(Lx3/b;Lx3/j;Lt3/n;)V

    iget-object v0, v7, Lx3/l;->b:Lt3/e0;

    iget-object v3, v0, Lt3/e0;->c:Ljava/net/InetSocketAddress;

    iget-object v0, v0, Lt3/e0;->b:Ljava/net/Proxy;

    invoke-static {v3, v11}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, v10}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    :goto_3
    iget-object v0, v7, Lx3/l;->b:Lt3/e0;

    iget-object v1, v0, Lt3/e0;->a:Lt3/a;

    iget-object v1, v1, Lt3/a;->c:Ljavax/net/ssl/SSLSocketFactory;

    if-eqz v1, :cond_6

    iget-object v0, v0, Lt3/e0;->b:Ljava/net/Proxy;

    invoke-virtual {v0}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object v0

    sget-object v1, Ljava/net/Proxy$Type;->HTTP:Ljava/net/Proxy$Type;

    if-ne v0, v1, :cond_6

    iget-object v0, v7, Lx3/l;->c:Ljava/net/Socket;

    if-eqz v0, :cond_5

    goto :goto_4

    :cond_5
    new-instance v0, Lx3/n;

    new-instance v1, Ljava/net/ProtocolException;

    const-string v2, "Too many tunnel connections attempted: 21"

    invoke-direct {v1, v2}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1}, Lx3/n;-><init>(Ljava/io/IOException;)V

    throw v0

    :cond_6
    :goto_4
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    iput-wide v0, v7, Lx3/l;->q:J

    return-void

    :catch_1
    move-exception v0

    :goto_5
    iget-object v3, v7, Lx3/l;->d:Ljava/net/Socket;

    if-eqz v3, :cond_7

    invoke-static {v3}, Lu3/b;->d(Ljava/net/Socket;)V

    :cond_7
    iget-object v3, v7, Lx3/l;->c:Ljava/net/Socket;

    if-eqz v3, :cond_8

    invoke-static {v3}, Lu3/b;->d(Ljava/net/Socket;)V

    :cond_8
    iput-object v13, v7, Lx3/l;->d:Ljava/net/Socket;

    iput-object v13, v7, Lx3/l;->c:Ljava/net/Socket;

    iput-object v13, v7, Lx3/l;->h:Lf4/q;

    iput-object v13, v7, Lx3/l;->i:Lf4/p;

    iput-object v13, v7, Lx3/l;->e:Lt3/o;

    iput-object v13, v7, Lx3/l;->f:Lt3/x;

    iput-object v13, v7, Lx3/l;->g:La4/t;

    const/4 v3, 0x1

    iput v3, v7, Lx3/l;->o:I

    iget-object v4, v7, Lx3/l;->b:Lt3/e0;

    iget-object v5, v4, Lt3/e0;->c:Ljava/net/InetSocketAddress;

    iget-object v4, v4, Lt3/e0;->b:Ljava/net/Proxy;

    invoke-static {v5, v11}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v4, v10}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez v14, :cond_9

    new-instance v14, Lx3/n;

    invoke-direct {v14, v0}, Lx3/n;-><init>(Ljava/io/IOException;)V

    goto :goto_6

    :cond_9
    iget-object v4, v14, Lx3/n;->b:Ljava/io/IOException;

    invoke-static {v4, v0}, Lc3/h;->F(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    iput-object v0, v14, Lx3/n;->c:Ljava/io/IOException;

    :goto_6
    if-eqz p4, :cond_b

    iput-boolean v3, v12, Lx3/b;->d:Z

    iget-boolean v3, v12, Lx3/b;->c:Z

    if-eqz v3, :cond_b

    instance-of v3, v0, Ljava/net/ProtocolException;

    if-nez v3, :cond_b

    instance-of v3, v0, Ljava/io/InterruptedIOException;

    if-nez v3, :cond_b

    instance-of v3, v0, Ljavax/net/ssl/SSLHandshakeException;

    if-eqz v3, :cond_a

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v3

    instance-of v3, v3, Ljava/security/cert/CertificateException;

    if-nez v3, :cond_b

    :cond_a
    instance-of v3, v0, Ljavax/net/ssl/SSLPeerUnverifiedException;

    if-nez v3, :cond_b

    instance-of v0, v0, Ljavax/net/ssl/SSLException;

    if-eqz v0, :cond_b

    goto/16 :goto_1

    :cond_b
    throw v14

    :cond_c
    new-instance v0, Lx3/n;

    new-instance v1, Ljava/net/UnknownServiceException;

    const-string v2, "H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"

    invoke-direct {v1, v2}, Ljava/net/UnknownServiceException;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1}, Lx3/n;-><init>(Ljava/io/IOException;)V

    throw v0

    :cond_d
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "already connected"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final e(IILx3/j;Lt3/n;)V
    .locals 4

    iget-object v0, p0, Lx3/l;->b:Lt3/e0;

    iget-object v1, v0, Lt3/e0;->b:Ljava/net/Proxy;

    iget-object v0, v0, Lt3/e0;->a:Lt3/a;

    invoke-virtual {v1}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object v2

    if-nez v2, :cond_0

    const/4 v2, -0x1

    goto :goto_0

    :cond_0
    sget-object v3, Lx3/k;->a:[I

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v2, v3, v2

    :goto_0
    const/4 v3, 0x1

    if-eq v2, v3, :cond_1

    const/4 v3, 0x2

    if-eq v2, v3, :cond_1

    new-instance v0, Ljava/net/Socket;

    invoke-direct {v0, v1}, Ljava/net/Socket;-><init>(Ljava/net/Proxy;)V

    goto :goto_1

    :cond_1
    iget-object v0, v0, Lt3/a;->b:Ljavax/net/SocketFactory;

    invoke-virtual {v0}, Ljavax/net/SocketFactory;->createSocket()Ljava/net/Socket;

    move-result-object v0

    invoke-static {v0}, Lc3/h;->X(Ljava/lang/Object;)V

    :goto_1
    iput-object v0, p0, Lx3/l;->c:Ljava/net/Socket;

    iget-object v1, p0, Lx3/l;->b:Lt3/e0;

    iget-object v1, v1, Lt3/e0;->c:Ljava/net/InetSocketAddress;

    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string p4, "call"

    invoke-static {p3, p4}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "inetSocketAddress"

    invoke-static {v1, p3}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Ljava/net/Socket;->setSoTimeout(I)V

    :try_start_0
    sget-object p2, Lb4/l;->a:Lb4/l;

    sget-object p2, Lb4/l;->a:Lb4/l;

    iget-object p3, p0, Lx3/l;->b:Lt3/e0;

    iget-object p3, p3, Lt3/e0;->c:Ljava/net/InetSocketAddress;

    invoke-virtual {p2, v0, p3, p1}, Lb4/l;->e(Ljava/net/Socket;Ljava/net/InetSocketAddress;I)V
    :try_end_0
    .catch Ljava/net/ConnectException; {:try_start_0 .. :try_end_0} :catch_1

    :try_start_1
    invoke-static {v0}, Lr3/q;->s(Ljava/net/Socket;)Lf4/d;

    move-result-object p1

    new-instance p2, Lf4/q;

    invoke-direct {p2, p1}, Lf4/q;-><init>(Lf4/w;)V

    iput-object p2, p0, Lx3/l;->h:Lf4/q;

    invoke-static {v0}, Lr3/q;->r(Ljava/net/Socket;)Lf4/c;

    move-result-object p1

    new-instance p2, Lf4/p;

    invoke-direct {p2, p1}, Lf4/p;-><init>(Lf4/u;)V

    iput-object p2, p0, Lx3/l;->i:Lf4/p;
    :try_end_1
    .catch Ljava/lang/NullPointerException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_2

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p2

    const-string p3, "throw with null exception"

    invoke-static {p2, p3}, Lc3/h;->I(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_2

    :goto_2
    return-void

    :cond_2
    new-instance p2, Ljava/io/IOException;

    invoke-direct {p2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    throw p2

    :catch_1
    move-exception p1

    new-instance p2, Ljava/net/ConnectException;

    new-instance p3, Ljava/lang/StringBuilder;

    const-string p4, "Failed to connect to "

    invoke-direct {p3, p4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object p4, p0, Lx3/l;->b:Lt3/e0;

    iget-object p4, p4, Lt3/e0;->c:Ljava/net/InetSocketAddress;

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-direct {p2, p3}, Ljava/net/ConnectException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    throw p2
.end method

.method public final f(IIILx3/j;Lt3/n;)V
    .locals 20

    move-object/from16 v0, p0

    move/from16 v1, p2

    move-object/from16 v2, p4

    new-instance v3, Lt3/y;

    invoke-direct {v3}, Lt3/y;-><init>()V

    iget-object v4, v0, Lx3/l;->b:Lt3/e0;

    iget-object v5, v4, Lt3/e0;->a:Lt3/a;

    iget-object v5, v5, Lt3/a;->i:Lt3/s;

    const-string v6, "url"

    invoke-static {v5, v6}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v5, v3, Lt3/y;->a:Lt3/s;

    const-string v5, "CONNECT"

    const/4 v6, 0x0

    invoke-virtual {v3, v5, v6}, Lt3/y;->d(Ljava/lang/String;Lt3/z;)V

    iget-object v5, v4, Lt3/e0;->a:Lt3/a;

    iget-object v7, v5, Lt3/a;->i:Lt3/s;

    const/4 v8, 0x1

    invoke-static {v7, v8}, Lu3/b;->v(Lt3/s;Z)Ljava/lang/String;

    move-result-object v7

    const-string v9, "Host"

    invoke-virtual {v3, v9, v7}, Lt3/y;->c(Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "Proxy-Connection"

    const-string v9, "Keep-Alive"

    invoke-virtual {v3, v7, v9}, Lt3/y;->c(Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "User-Agent"

    const-string v9, "okhttp/4.12.0"

    invoke-virtual {v3, v7, v9}, Lt3/y;->c(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v3}, Lt3/y;->b()Li/w;

    move-result-object v3

    new-instance v7, Lt3/a0;

    invoke-direct {v7}, Lt3/a0;-><init>()V

    iput-object v3, v7, Lt3/a0;->a:Li/w;

    sget-object v9, Lt3/x;->d:Lt3/x;

    iput-object v9, v7, Lt3/a0;->b:Lt3/x;

    const/16 v9, 0x197

    iput v9, v7, Lt3/a0;->c:I

    const-string v10, "Preemptive Authenticate"

    iput-object v10, v7, Lt3/a0;->d:Ljava/lang/String;

    sget-object v10, Lu3/b;->c:Lt3/c0;

    iput-object v10, v7, Lt3/a0;->g:Lt3/d0;

    const-wide/16 v10, -0x1

    iput-wide v10, v7, Lt3/a0;->k:J

    iput-wide v10, v7, Lt3/a0;->l:J

    iget-object v12, v7, Lt3/a0;->f:Lt3/p;

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v13, "Proxy-Authenticate"

    invoke-static {v13}, Lf2/e;->f(Ljava/lang/String;)V

    const-string v14, "OkHttp-Preemptive"

    invoke-static {v14, v13}, Lf2/e;->g(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v12, v13}, Lt3/p;->c(Ljava/lang/String;)V

    invoke-virtual {v12, v13, v14}, Lt3/p;->a(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v7}, Lt3/a0;->a()Lt3/b0;

    move-result-object v7

    iget-object v12, v5, Lt3/a;->f:Lt3/b;

    invoke-interface {v12, v4, v7}, Lt3/b;->a(Lt3/e0;Lt3/b0;)Li/w;

    move-result-object v7

    if-nez v7, :cond_0

    goto :goto_0

    :cond_0
    move-object v3, v7

    :goto_0
    iget-object v7, v3, Li/w;->b:Ljava/lang/Object;

    check-cast v7, Lt3/s;

    const/4 v13, 0x0

    :goto_1
    const/16 v14, 0x15

    if-ge v13, v14, :cond_9

    move/from16 v14, p1

    move-object/from16 v15, p5

    invoke-virtual {v0, v14, v1, v2, v15}, Lx3/l;->e(IILx3/j;Lt3/n;)V

    new-instance v9, Ljava/lang/StringBuilder;

    const-string v10, "CONNECT "

    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v7, v8}, Lu3/b;->v(Lt3/s;Z)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v10, " HTTP/1.1"

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    :goto_2
    iget-object v10, v0, Lx3/l;->h:Lf4/q;

    invoke-static {v10}, Lc3/h;->X(Ljava/lang/Object;)V

    iget-object v11, v0, Lx3/l;->i:Lf4/p;

    invoke-static {v11}, Lc3/h;->X(Ljava/lang/Object;)V

    new-instance v8, Lz3/h;

    invoke-direct {v8, v6, v0, v10, v11}, Lz3/h;-><init>(Lt3/w;Lx3/l;Lf4/i;Lf4/h;)V

    iget-object v6, v10, Lf4/q;->b:Lf4/w;

    invoke-interface {v6}, Lf4/w;->b()Lf4/y;

    move-result-object v6

    move/from16 v19, v13

    int-to-long v12, v1

    sget-object v1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v6, v12, v13, v1}, Lf4/y;->g(JLjava/util/concurrent/TimeUnit;)Lf4/y;

    iget-object v6, v11, Lf4/p;->b:Lf4/u;

    invoke-interface {v6}, Lf4/u;->b()Lf4/y;

    move-result-object v6

    move/from16 v12, p3

    int-to-long v13, v12

    invoke-virtual {v6, v13, v14, v1}, Lf4/y;->g(JLjava/util/concurrent/TimeUnit;)Lf4/y;

    iget-object v6, v3, Li/w;->d:Ljava/lang/Object;

    check-cast v6, Lt3/q;

    invoke-virtual {v8, v6, v9}, Lz3/h;->j(Lt3/q;Ljava/lang/String;)V

    invoke-virtual {v8}, Lz3/h;->a()V

    const/4 v6, 0x0

    invoke-virtual {v8, v6}, Lz3/h;->e(Z)Lt3/a0;

    move-result-object v13

    invoke-static {v13}, Lc3/h;->X(Ljava/lang/Object;)V

    iput-object v3, v13, Lt3/a0;->a:Li/w;

    invoke-virtual {v13}, Lt3/a0;->a()Lt3/b0;

    move-result-object v3

    invoke-static {v3}, Lu3/b;->j(Lt3/b0;)J

    move-result-wide v13

    const-wide/16 v16, -0x1

    cmp-long v18, v13, v16

    if-nez v18, :cond_1

    goto :goto_3

    :cond_1
    invoke-virtual {v8, v13, v14}, Lz3/h;->i(J)Lz3/e;

    move-result-object v8

    const v13, 0x7fffffff

    invoke-static {v8, v13, v1}, Lu3/b;->t(Lf4/w;ILjava/util/concurrent/TimeUnit;)Z

    invoke-virtual {v8}, Lz3/e;->close()V

    :goto_3
    const/16 v1, 0xc8

    iget v8, v3, Lt3/b0;->e:I

    if-eq v8, v1, :cond_5

    const/16 v1, 0x197

    if-ne v8, v1, :cond_4

    iget-object v8, v5, Lt3/a;->f:Lt3/b;

    invoke-interface {v8, v4, v3}, Lt3/b;->a(Lt3/e0;Lt3/b0;)Li/w;

    move-result-object v8

    if-eqz v8, :cond_3

    const-string v10, "Connection"

    invoke-static {v3, v10}, Lt3/b0;->a(Lt3/b0;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v10, "close"

    invoke-static {v10, v3}, Lq3/l;->U2(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_2

    move-object v3, v8

    goto :goto_4

    :cond_2
    move/from16 v14, p1

    move/from16 v1, p2

    move-object v3, v8

    move/from16 v13, v19

    const/4 v6, 0x0

    const/4 v8, 0x1

    goto/16 :goto_2

    :cond_3
    new-instance v1, Ljava/io/IOException;

    const-string v2, "Failed to authenticate with proxy"

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_4
    new-instance v1, Ljava/io/IOException;

    const-string v2, "Unexpected response code for CONNECT: "

    invoke-static {v2, v8}, La;->e(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_5
    const/16 v1, 0x197

    iget-object v3, v10, Lf4/q;->c:Lf4/g;

    invoke-virtual {v3}, Lf4/g;->r()Z

    move-result v3

    if-eqz v3, :cond_8

    iget-object v3, v11, Lf4/p;->c:Lf4/g;

    invoke-virtual {v3}, Lf4/g;->r()Z

    move-result v3

    if-eqz v3, :cond_8

    const/4 v3, 0x0

    :goto_4
    if-nez v3, :cond_6

    goto :goto_5

    :cond_6
    iget-object v8, v0, Lx3/l;->c:Ljava/net/Socket;

    if-eqz v8, :cond_7

    invoke-static {v8}, Lu3/b;->d(Ljava/net/Socket;)V

    :cond_7
    const/4 v8, 0x0

    iput-object v8, v0, Lx3/l;->c:Ljava/net/Socket;

    iput-object v8, v0, Lx3/l;->i:Lf4/p;

    iput-object v8, v0, Lx3/l;->h:Lf4/q;

    const-string v9, "call"

    invoke-static {v2, v9}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v9, "inetSocketAddress"

    iget-object v10, v4, Lt3/e0;->c:Ljava/net/InetSocketAddress;

    invoke-static {v10, v9}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v9, "proxy"

    iget-object v10, v4, Lt3/e0;->b:Ljava/net/Proxy;

    invoke-static {v10, v9}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    add-int/lit8 v13, v19, 0x1

    move v9, v1

    move-object v6, v8

    move-wide/from16 v10, v16

    const/4 v8, 0x1

    move/from16 v1, p2

    goto/16 :goto_1

    :cond_8
    new-instance v1, Ljava/io/IOException;

    const-string v2, "TLS tunnel buffered too many bytes!"

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_9
    :goto_5
    return-void
.end method

.method public final g(Lx3/b;Lx3/j;Lt3/n;)V
    .locals 10

    iget-object v0, p0, Lx3/l;->b:Lt3/e0;

    iget-object v0, v0, Lt3/e0;->a:Lt3/a;

    iget-object v1, v0, Lt3/a;->c:Ljavax/net/ssl/SSLSocketFactory;

    sget-object v2, Lt3/x;->d:Lt3/x;

    if-nez v1, :cond_1

    iget-object p1, v0, Lt3/a;->j:Ljava/util/List;

    sget-object p2, Lt3/x;->g:Lt3/x;

    invoke-interface {p1, p2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lx3/l;->c:Ljava/net/Socket;

    iput-object p1, p0, Lx3/l;->d:Ljava/net/Socket;

    iput-object p2, p0, Lx3/l;->f:Lt3/x;

    invoke-virtual {p0}, Lx3/l;->l()V

    return-void

    :cond_0
    iget-object p1, p0, Lx3/l;->c:Ljava/net/Socket;

    iput-object p1, p0, Lx3/l;->d:Ljava/net/Socket;

    iput-object v2, p0, Lx3/l;->f:Lt3/x;

    return-void

    :cond_1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string p3, "call"

    invoke-static {p2, p3}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "Hostname "

    const-string p3, "\n              |Hostname "

    iget-object v0, p0, Lx3/l;->b:Lt3/e0;

    iget-object v0, v0, Lt3/e0;->a:Lt3/a;

    iget-object v1, v0, Lt3/a;->c:Ljavax/net/ssl/SSLSocketFactory;

    const/4 v3, 0x0

    :try_start_0
    invoke-static {v1}, Lc3/h;->X(Ljava/lang/Object;)V

    iget-object v4, p0, Lx3/l;->c:Ljava/net/Socket;

    iget-object v5, v0, Lt3/a;->i:Lt3/s;

    iget-object v6, v5, Lt3/s;->d:Ljava/lang/String;

    iget v5, v5, Lt3/s;->e:I

    const/4 v7, 0x1

    invoke-virtual {v1, v4, v6, v5, v7}, Ljavax/net/ssl/SSLSocketFactory;->createSocket(Ljava/net/Socket;Ljava/lang/String;IZ)Ljava/net/Socket;

    move-result-object v1

    const-string v4, "null cannot be cast to non-null type javax.net.ssl.SSLSocket"

    invoke-static {v1, v4}, Lc3/h;->Y(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljavax/net/ssl/SSLSocket;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    invoke-virtual {p1, v1}, Lx3/b;->a(Ljavax/net/ssl/SSLSocket;)Lt3/i;

    move-result-object p1

    iget-boolean v4, p1, Lt3/i;->b:Z

    if-eqz v4, :cond_2

    sget-object v4, Lb4/l;->a:Lb4/l;

    sget-object v4, Lb4/l;->a:Lb4/l;

    iget-object v5, v0, Lt3/a;->i:Lt3/s;

    iget-object v5, v5, Lt3/s;->d:Ljava/lang/String;

    iget-object v6, v0, Lt3/a;->j:Ljava/util/List;

    invoke-virtual {v4, v1, v5, v6}, Lb4/l;->d(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    move-object v3, v1

    goto/16 :goto_1

    :cond_2
    :goto_0
    invoke-virtual {v1}, Ljavax/net/ssl/SSLSocket;->startHandshake()V

    invoke-virtual {v1}, Ljavax/net/ssl/SSLSocket;->getSession()Ljavax/net/ssl/SSLSession;

    move-result-object v4

    const-string v5, "sslSocketSession"

    invoke-static {v4, v5}, Lc3/h;->a0(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v4}, Lf2/e;->p(Ljavax/net/ssl/SSLSession;)Lt3/o;

    move-result-object v5

    iget-object v6, v0, Lt3/a;->d:Ljavax/net/ssl/HostnameVerifier;

    invoke-static {v6}, Lc3/h;->X(Ljava/lang/Object;)V

    iget-object v8, v0, Lt3/a;->i:Lt3/s;

    iget-object v8, v8, Lt3/s;->d:Ljava/lang/String;

    invoke-interface {v6, v8, v4}, Ljavax/net/ssl/HostnameVerifier;->verify(Ljava/lang/String;Ljavax/net/ssl/SSLSession;)Z

    move-result v4

    if-nez v4, :cond_4

    invoke-virtual {v5}, Lt3/o;->a()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    xor-int/2addr v2, v7

    if-eqz v2, :cond_3

    const/4 p2, 0x0

    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    const-string p2, "null cannot be cast to non-null type java.security.cert.X509Certificate"

    invoke-static {p1, p2}, Lc3/h;->Y(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/security/cert/X509Certificate;

    new-instance p2, Ljavax/net/ssl/SSLPeerUnverifiedException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object p3, v0, Lt3/a;->i:Lt3/s;

    iget-object p3, p3, Lt3/s;->d:Ljava/lang/String;

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, " not verified:\n              |    certificate: "

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object p3, Lt3/f;->c:Lt3/f;

    new-instance p3, Ljava/lang/StringBuilder;

    const-string v0, "sha256/"

    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v0, Lf4/j;->e:Lf4/j;

    invoke-virtual {p1}, Ljava/security/cert/Certificate;->getPublicKey()Ljava/security/PublicKey;

    move-result-object v0

    invoke-interface {v0}, Ljava/security/Key;->getEncoded()[B

    move-result-object v0

    const-string v3, "publicKey.encoded"

    invoke-static {v0, v3}, Lc3/h;->a0(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, La4/x;->m([B)Lf4/j;

    move-result-object v0

    const-string v3, "SHA-256"

    invoke-virtual {v0, v3}, Lf4/j;->b(Ljava/lang/String;)Lf4/j;

    move-result-object v0

    invoke-virtual {v0}, Lf4/j;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, "\n              |    DN: "

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/security/cert/X509Certificate;->getSubjectDN()Ljava/security/Principal;

    move-result-object p3

    invoke-interface {p3}, Ljava/security/Principal;->getName()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, "\n              |    subjectAltNames: "

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 p3, 0x7

    invoke-static {p1, p3}, Le4/c;->a(Ljava/security/cert/X509Certificate;I)Ljava/util/List;

    move-result-object p3

    const/4 v0, 0x2

    invoke-static {p1, v0}, Le4/c;->a(Ljava/security/cert/X509Certificate;I)Ljava/util/List;

    move-result-object p1

    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p3}, Ljava/util/Collection;->size()I

    move-result v3

    invoke-interface {p1}, Ljava/util/Collection;->size()I

    move-result v4

    add-int/2addr v4, v3

    invoke-direct {v0, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v0, p3}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, "\n              "

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lc3/h;->G2(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljavax/net/ssl/SSLPeerUnverifiedException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_3
    new-instance p1, Ljavax/net/ssl/SSLPeerUnverifiedException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object p2, v0, Lt3/a;->i:Lt3/s;

    iget-object p2, p2, Lt3/s;->d:Ljava/lang/String;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, " not verified (no certificates)"

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljavax/net/ssl/SSLPeerUnverifiedException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    iget-object p2, v0, Lt3/a;->e:Lt3/f;

    invoke-static {p2}, Lc3/h;->X(Ljava/lang/Object;)V

    new-instance p3, Lt3/o;

    iget-object v4, v5, Lt3/o;->a:Lt3/f0;

    iget-object v6, v5, Lt3/o;->b:Lt3/g;

    iget-object v8, v5, Lt3/o;->c:Ljava/util/List;

    new-instance v9, Lt3/e;

    invoke-direct {v9, p2, v5, v0, v7}, Lt3/e;-><init>(Lt3/f;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-direct {p3, v4, v6, v8, v9}, Lt3/o;-><init>(Lt3/f0;Lt3/g;Ljava/util/List;Lj3/a;)V

    iput-object p3, p0, Lx3/l;->e:Lt3/o;

    iget-object p3, v0, Lt3/a;->i:Lt3/s;

    iget-object p3, p3, Lt3/s;->d:Ljava/lang/String;

    new-instance v0, Landroidx/lifecycle/k0;

    const/4 v4, 0x3

    invoke-direct {v0, v4, p0}, Landroidx/lifecycle/k0;-><init>(ILjava/lang/Object;)V

    invoke-virtual {p2, p3, v0}, Lt3/f;->a(Ljava/lang/String;Lj3/a;)V

    iget-boolean p1, p1, Lt3/i;->b:Z

    if-eqz p1, :cond_5

    sget-object p1, Lb4/l;->a:Lb4/l;

    sget-object p1, Lb4/l;->a:Lb4/l;

    invoke-virtual {p1, v1}, Lb4/l;->f(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;

    move-result-object v3

    :cond_5
    iput-object v1, p0, Lx3/l;->d:Ljava/net/Socket;

    invoke-static {v1}, Lr3/q;->s(Ljava/net/Socket;)Lf4/d;

    move-result-object p1

    new-instance p2, Lf4/q;

    invoke-direct {p2, p1}, Lf4/q;-><init>(Lf4/w;)V

    iput-object p2, p0, Lx3/l;->h:Lf4/q;

    invoke-static {v1}, Lr3/q;->r(Ljava/net/Socket;)Lf4/c;

    move-result-object p1

    new-instance p2, Lf4/p;

    invoke-direct {p2, p1}, Lf4/p;-><init>(Lf4/u;)V

    iput-object p2, p0, Lx3/l;->i:Lf4/p;

    if-eqz v3, :cond_6

    invoke-static {v3}, Lf2/e;->s(Ljava/lang/String;)Lt3/x;

    move-result-object v2

    :cond_6
    iput-object v2, p0, Lx3/l;->f:Lt3/x;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    sget-object p1, Lb4/l;->a:Lb4/l;

    sget-object p1, Lb4/l;->a:Lb4/l;

    invoke-virtual {p1, v1}, Lb4/l;->a(Ljavax/net/ssl/SSLSocket;)V

    iget-object p1, p0, Lx3/l;->f:Lt3/x;

    sget-object p2, Lt3/x;->f:Lt3/x;

    if-ne p1, p2, :cond_7

    invoke-virtual {p0}, Lx3/l;->l()V

    :cond_7
    return-void

    :catchall_1
    move-exception p1

    :goto_1
    if-eqz v3, :cond_8

    sget-object p2, Lb4/l;->a:Lb4/l;

    sget-object p2, Lb4/l;->a:Lb4/l;

    invoke-virtual {p2, v3}, Lb4/l;->a(Ljavax/net/ssl/SSLSocket;)V

    :cond_8
    if-eqz v3, :cond_9

    invoke-static {v3}, Lu3/b;->d(Ljava/net/Socket;)V

    :cond_9
    throw p1
.end method

.method public final h(Lt3/a;Ljava/util/List;)Z
    .locals 8

    const-string v0, "address"

    invoke-static {p1, v0}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lu3/b;->a:[B

    iget-object v0, p0, Lx3/l;->p:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    iget v1, p0, Lx3/l;->o:I

    const/4 v2, 0x0

    if-ge v0, v1, :cond_9

    iget-boolean v0, p0, Lx3/l;->j:Z

    if-eqz v0, :cond_0

    goto/16 :goto_1

    :cond_0
    iget-object v0, p0, Lx3/l;->b:Lt3/e0;

    iget-object v1, v0, Lt3/e0;->a:Lt3/a;

    invoke-virtual {v1, p1}, Lt3/a;->a(Lt3/a;)Z

    move-result v1

    if-nez v1, :cond_1

    return v2

    :cond_1
    iget-object v1, p1, Lt3/a;->i:Lt3/s;

    iget-object v3, v1, Lt3/s;->d:Ljava/lang/String;

    iget-object v4, v0, Lt3/e0;->a:Lt3/a;

    iget-object v5, v4, Lt3/a;->i:Lt3/s;

    iget-object v5, v5, Lt3/s;->d:Ljava/lang/String;

    invoke-static {v3, v5}, Lc3/h;->I(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    const/4 v5, 0x1

    if-eqz v3, :cond_2

    return v5

    :cond_2
    iget-object v3, p0, Lx3/l;->g:La4/t;

    if-nez v3, :cond_3

    return v2

    :cond_3
    if-eqz p2, :cond_9

    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_4

    goto/16 :goto_1

    :cond_4
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_5
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_9

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lt3/e0;

    iget-object v6, v3, Lt3/e0;->b:Ljava/net/Proxy;

    invoke-virtual {v6}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object v6

    sget-object v7, Ljava/net/Proxy$Type;->DIRECT:Ljava/net/Proxy$Type;

    if-ne v6, v7, :cond_5

    iget-object v6, v0, Lt3/e0;->b:Ljava/net/Proxy;

    invoke-virtual {v6}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object v6

    if-ne v6, v7, :cond_5

    iget-object v3, v3, Lt3/e0;->c:Ljava/net/InetSocketAddress;

    iget-object v6, v0, Lt3/e0;->c:Ljava/net/InetSocketAddress;

    invoke-static {v6, v3}, Lc3/h;->I(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_5

    sget-object p2, Le4/c;->a:Le4/c;

    iget-object v0, p1, Lt3/a;->d:Ljavax/net/ssl/HostnameVerifier;

    if-eq v0, p2, :cond_6

    return v2

    :cond_6
    sget-object p2, Lu3/b;->a:[B

    iget-object p2, v4, Lt3/a;->i:Lt3/s;

    iget v0, p2, Lt3/s;->e:I

    iget v3, v1, Lt3/s;->e:I

    if-eq v3, v0, :cond_7

    goto :goto_1

    :cond_7
    iget-object p2, p2, Lt3/s;->d:Ljava/lang/String;

    iget-object v0, v1, Lt3/s;->d:Ljava/lang/String;

    invoke-static {v0, p2}, Lc3/h;->I(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_8

    goto :goto_0

    :cond_8
    iget-boolean p2, p0, Lx3/l;->k:Z

    if-nez p2, :cond_9

    iget-object p2, p0, Lx3/l;->e:Lt3/o;

    if-eqz p2, :cond_9

    invoke-virtual {p2}, Lt3/o;->a()Ljava/util/List;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    xor-int/2addr v1, v5

    if-eqz v1, :cond_9

    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    const-string v1, "null cannot be cast to non-null type java.security.cert.X509Certificate"

    invoke-static {p2, v1}, Lc3/h;->Y(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Ljava/security/cert/X509Certificate;

    invoke-static {v0, p2}, Le4/c;->c(Ljava/lang/String;Ljava/security/cert/X509Certificate;)Z

    move-result p2

    if-eqz p2, :cond_9

    :goto_0
    :try_start_0
    iget-object p1, p1, Lt3/a;->e:Lt3/f;

    invoke-static {p1}, Lc3/h;->X(Ljava/lang/Object;)V

    iget-object p2, p0, Lx3/l;->e:Lt3/o;

    invoke-static {p2}, Lc3/h;->X(Ljava/lang/Object;)V

    invoke-virtual {p2}, Lt3/o;->a()Ljava/util/List;

    move-result-object p2

    const-string v1, "hostname"

    invoke-static {v0, v1}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "peerCertificates"

    invoke-static {p2, v1}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lt3/e;

    invoke-direct {v1, p1, p2, v0, v2}, Lt3/e;-><init>(Lt3/f;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {p1, v0, v1}, Lt3/f;->a(Ljava/lang/String;Lj3/a;)V
    :try_end_0
    .catch Ljavax/net/ssl/SSLPeerUnverifiedException; {:try_start_0 .. :try_end_0} :catch_0

    return v5

    :catch_0
    :cond_9
    :goto_1
    return v2
.end method

.method public final i(Z)Z
    .locals 9

    sget-object v0, Lu3/b;->a:[B

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    iget-object v2, p0, Lx3/l;->c:Ljava/net/Socket;

    invoke-static {v2}, Lc3/h;->X(Ljava/lang/Object;)V

    iget-object v3, p0, Lx3/l;->d:Ljava/net/Socket;

    invoke-static {v3}, Lc3/h;->X(Ljava/lang/Object;)V

    iget-object v4, p0, Lx3/l;->h:Lf4/q;

    invoke-static {v4}, Lc3/h;->X(Ljava/lang/Object;)V

    invoke-virtual {v2}, Ljava/net/Socket;->isClosed()Z

    move-result v2

    const/4 v5, 0x0

    if-nez v2, :cond_5

    invoke-virtual {v3}, Ljava/net/Socket;->isClosed()Z

    move-result v2

    if-nez v2, :cond_5

    invoke-virtual {v3}, Ljava/net/Socket;->isInputShutdown()Z

    move-result v2

    if-nez v2, :cond_5

    invoke-virtual {v3}, Ljava/net/Socket;->isOutputShutdown()Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_3

    :cond_0
    iget-object v2, p0, Lx3/l;->g:La4/t;

    const/4 v6, 0x1

    if-eqz v2, :cond_3

    monitor-enter v2

    :try_start_0
    iget-boolean p1, v2, La4/t;->h:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p1, :cond_1

    monitor-exit v2

    goto :goto_0

    :cond_1
    :try_start_1
    iget-wide v3, v2, La4/t;->q:J

    iget-wide v7, v2, La4/t;->p:J

    cmp-long p1, v3, v7

    if-gez p1, :cond_2

    iget-wide v3, v2, La4/t;->r:J
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    cmp-long p1, v0, v3

    if-ltz p1, :cond_2

    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_2
    monitor-exit v2

    move v5, v6

    :goto_0
    return v5

    :goto_1
    monitor-exit v2

    throw p1

    :cond_3
    monitor-enter p0

    :try_start_2
    iget-wide v7, p0, Lx3/l;->q:J
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    sub-long/2addr v0, v7

    monitor-exit p0

    const-wide v7, 0x2540be400L

    cmp-long v0, v0, v7

    if-ltz v0, :cond_4

    if-eqz p1, :cond_4

    :try_start_3
    invoke-virtual {v3}, Ljava/net/Socket;->getSoTimeout()I

    move-result p1
    :try_end_3
    .catch Ljava/net/SocketTimeoutException; {:try_start_3 .. :try_end_3} :catch_0
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1

    :try_start_4
    invoke-virtual {v3, v6}, Ljava/net/Socket;->setSoTimeout(I)V

    invoke-virtual {v4}, Lf4/q;->r()Z

    move-result v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    xor-int/2addr v0, v6

    :try_start_5
    invoke-virtual {v3, p1}, Ljava/net/Socket;->setSoTimeout(I)V

    move v5, v0

    goto :goto_2

    :catchall_1
    move-exception v0

    invoke-virtual {v3, p1}, Ljava/net/Socket;->setSoTimeout(I)V

    throw v0
    :try_end_5
    .catch Ljava/net/SocketTimeoutException; {:try_start_5 .. :try_end_5} :catch_0
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_1

    :catch_0
    move v5, v6

    :catch_1
    :goto_2
    return v5

    :cond_4
    return v6

    :catchall_2
    move-exception p1

    monitor-exit p0

    throw p1

    :cond_5
    :goto_3
    return v5
.end method

.method public final j(Lt3/w;Ly3/f;)Ly3/d;
    .locals 6

    iget-object v0, p0, Lx3/l;->d:Ljava/net/Socket;

    invoke-static {v0}, Lc3/h;->X(Ljava/lang/Object;)V

    iget-object v1, p0, Lx3/l;->h:Lf4/q;

    invoke-static {v1}, Lc3/h;->X(Ljava/lang/Object;)V

    iget-object v2, p0, Lx3/l;->i:Lf4/p;

    invoke-static {v2}, Lc3/h;->X(Ljava/lang/Object;)V

    iget-object v3, p0, Lx3/l;->g:La4/t;

    if-eqz v3, :cond_0

    new-instance v0, La4/u;

    invoke-direct {v0, p1, p0, p2, v3}, La4/u;-><init>(Lt3/w;Lx3/l;Ly3/f;La4/t;)V

    goto :goto_0

    :cond_0
    iget v3, p2, Ly3/f;->g:I

    invoke-virtual {v0, v3}, Ljava/net/Socket;->setSoTimeout(I)V

    iget-object v0, v1, Lf4/q;->b:Lf4/w;

    invoke-interface {v0}, Lf4/w;->b()Lf4/y;

    move-result-object v0

    int-to-long v3, v3

    sget-object v5, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v3, v4, v5}, Lf4/y;->g(JLjava/util/concurrent/TimeUnit;)Lf4/y;

    iget-object v0, v2, Lf4/p;->b:Lf4/u;

    invoke-interface {v0}, Lf4/u;->b()Lf4/y;

    move-result-object v0

    iget p2, p2, Ly3/f;->h:I

    int-to-long v3, p2

    invoke-virtual {v0, v3, v4, v5}, Lf4/y;->g(JLjava/util/concurrent/TimeUnit;)Lf4/y;

    new-instance v0, Lz3/h;

    invoke-direct {v0, p1, p0, v1, v2}, Lz3/h;-><init>(Lt3/w;Lx3/l;Lf4/i;Lf4/h;)V

    :goto_0
    return-object v0
.end method

.method public final declared-synchronized k()V
    .locals 1

    monitor-enter p0

    const/4 v0, 0x1

    :try_start_0
    iput-boolean v0, p0, Lx3/l;->j:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final l()V
    .locals 9

    iget-object v0, p0, Lx3/l;->d:Ljava/net/Socket;

    invoke-static {v0}, Lc3/h;->X(Ljava/lang/Object;)V

    iget-object v1, p0, Lx3/l;->h:Lf4/q;

    invoke-static {v1}, Lc3/h;->X(Ljava/lang/Object;)V

    iget-object v2, p0, Lx3/l;->i:Lf4/p;

    invoke-static {v2}, Lc3/h;->X(Ljava/lang/Object;)V

    const/4 v3, 0x0

    invoke-virtual {v0, v3}, Ljava/net/Socket;->setSoTimeout(I)V

    new-instance v4, La4/h;

    sget-object v5, Lw3/f;->i:Lw3/f;

    invoke-direct {v4, v5}, La4/h;-><init>(Lw3/f;)V

    iget-object v6, p0, Lx3/l;->b:Lt3/e0;

    iget-object v6, v6, Lt3/e0;->a:Lt3/a;

    iget-object v6, v6, Lt3/a;->i:Lt3/s;

    iget-object v6, v6, Lt3/s;->d:Ljava/lang/String;

    const-string v7, "peerName"

    invoke-static {v6, v7}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, v4, La4/h;->c:Ljava/net/Socket;

    iget-boolean v0, v4, La4/h;->a:Z

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v7, Lu3/b;->g:Ljava/lang/String;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v7, 0x20

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const-string v0, "MockWebServer "

    invoke-virtual {v0, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    const-string v6, "<set-?>"

    invoke-static {v0, v6}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, v4, La4/h;->d:Ljava/lang/String;

    iput-object v1, v4, La4/h;->e:Lf4/i;

    iput-object v2, v4, La4/h;->f:Lf4/h;

    iput-object p0, v4, La4/h;->g:La4/j;

    iput v3, v4, La4/h;->i:I

    new-instance v0, La4/t;

    invoke-direct {v0, v4}, La4/t;-><init>(La4/h;)V

    iput-object v0, p0, Lx3/l;->g:La4/t;

    sget-object v1, La4/t;->C:La4/g0;

    iget v2, v1, La4/g0;->a:I

    and-int/lit8 v2, v2, 0x10

    const/4 v4, 0x4

    if-eqz v2, :cond_1

    iget-object v1, v1, La4/g0;->b:[I

    aget v1, v1, v4

    goto :goto_1

    :cond_1
    const v1, 0x7fffffff

    :goto_1
    iput v1, p0, Lx3/l;->o:I

    iget-object v1, v0, La4/t;->z:La4/c0;

    const-string v2, ">> CONNECTION "

    monitor-enter v1

    :try_start_0
    iget-boolean v6, v1, La4/c0;->f:Z

    if-nez v6, :cond_a

    iget-boolean v6, v1, La4/c0;->c:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v6, :cond_2

    monitor-exit v1

    goto :goto_3

    :cond_2
    :try_start_1
    sget-object v6, La4/c0;->h:Ljava/util/logging/Logger;

    sget-object v7, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    invoke-virtual {v6, v7}, Ljava/util/logging/Logger;->isLoggable(Ljava/util/logging/Level;)Z

    move-result v7

    if-eqz v7, :cond_3

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v2, La4/g;->a:Lf4/j;

    invoke-virtual {v2}, Lf4/j;->d()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    new-array v7, v3, [Ljava/lang/Object;

    invoke-static {v2, v7}, Lu3/b;->h(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v6, v2}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    goto :goto_2

    :catchall_0
    move-exception v0

    goto/16 :goto_8

    :cond_3
    :goto_2
    iget-object v2, v1, La4/c0;->b:Lf4/h;

    sget-object v6, La4/g;->a:Lf4/j;

    invoke-interface {v2, v6}, Lf4/h;->g(Lf4/j;)Lf4/h;

    iget-object v2, v1, La4/c0;->b:Lf4/h;

    invoke-interface {v2}, Lf4/h;->flush()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v1

    :goto_3
    iget-object v1, v0, La4/t;->z:La4/c0;

    iget-object v2, v0, La4/t;->s:La4/g0;

    monitor-enter v1

    :try_start_2
    const-string v6, "settings"

    invoke-static {v2, v6}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v6, v1, La4/c0;->f:Z

    if-nez v6, :cond_9

    iget v6, v2, La4/g0;->a:I

    invoke-static {v6}, Ljava/lang/Integer;->bitCount(I)I

    move-result v6

    mul-int/lit8 v6, v6, 0x6

    invoke-virtual {v1, v3, v6, v4, v3}, La4/c0;->h(IIII)V

    move v6, v3

    :goto_4
    const/16 v7, 0xa

    if-ge v6, v7, :cond_7

    const/4 v7, 0x1

    shl-int/2addr v7, v6

    iget v8, v2, La4/g0;->a:I

    and-int/2addr v7, v8

    if-eqz v7, :cond_6

    if-eq v6, v4, :cond_5

    const/4 v7, 0x7

    if-eq v6, v7, :cond_4

    move v7, v6

    goto :goto_5

    :cond_4
    move v7, v4

    goto :goto_5

    :cond_5
    const/4 v7, 0x3

    :goto_5
    iget-object v8, v1, La4/c0;->b:Lf4/h;

    invoke-interface {v8, v7}, Lf4/h;->v(I)Lf4/h;

    iget-object v7, v1, La4/c0;->b:Lf4/h;

    iget-object v8, v2, La4/g0;->b:[I

    aget v8, v8, v6

    invoke-interface {v7, v8}, Lf4/h;->d(I)Lf4/h;

    goto :goto_6

    :catchall_1
    move-exception v0

    goto :goto_7

    :cond_6
    :goto_6
    add-int/lit8 v6, v6, 0x1

    goto :goto_4

    :cond_7
    iget-object v2, v1, La4/c0;->b:Lf4/h;

    invoke-interface {v2}, Lf4/h;->flush()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    monitor-exit v1

    iget-object v1, v0, La4/t;->s:La4/g0;

    invoke-virtual {v1}, La4/g0;->a()I

    move-result v1

    const v2, 0xffff

    if-eq v1, v2, :cond_8

    iget-object v4, v0, La4/t;->z:La4/c0;

    sub-int/2addr v1, v2

    int-to-long v1, v1

    invoke-virtual {v4, v3, v1, v2}, La4/c0;->C(IJ)V

    :cond_8
    invoke-virtual {v5}, Lw3/f;->f()Lw3/c;

    move-result-object v1

    iget-object v2, v0, La4/t;->e:Ljava/lang/String;

    iget-object v0, v0, La4/t;->A:La4/n;

    new-instance v4, Lw3/b;

    invoke-direct {v4, v3, v0, v2}, Lw3/b;-><init>(ILjava/lang/Object;Ljava/lang/String;)V

    const-wide/16 v2, 0x0

    invoke-virtual {v1, v4, v2, v3}, Lw3/c;->c(Lw3/a;J)V

    return-void

    :cond_9
    :try_start_3
    new-instance v0, Ljava/io/IOException;

    const-string v2, "closed"

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :goto_7
    monitor-exit v1

    throw v0

    :cond_a
    :try_start_4
    new-instance v0, Ljava/io/IOException;

    const-string v2, "closed"

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :goto_8
    monitor-exit v1

    throw v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Connection{"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lx3/l;->b:Lt3/e0;

    iget-object v2, v1, Lt3/e0;->a:Lt3/a;

    iget-object v2, v2, Lt3/a;->i:Lt3/s;

    iget-object v2, v2, Lt3/s;->d:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0x3a

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v2, v1, Lt3/e0;->a:Lt3/a;

    iget-object v2, v2, Lt3/a;->i:Lt3/s;

    iget v2, v2, Lt3/s;->e:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", proxy="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, v1, Lt3/e0;->b:Ljava/net/Proxy;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " hostAddress="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, v1, Lt3/e0;->c:Ljava/net/InetSocketAddress;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " cipherSuite="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lx3/l;->e:Lt3/o;

    if-eqz v1, :cond_0

    iget-object v1, v1, Lt3/o;->b:Lt3/g;

    if-nez v1, :cond_1

    :cond_0
    const-string v1, "none"

    :cond_1
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " protocol="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lx3/l;->f:Lt3/x;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
