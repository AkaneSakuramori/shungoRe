.class public final Lz3/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly3/d;


# instance fields
.field public final a:Lt3/w;

.field public final b:Lx3/l;

.field public final c:Lf4/i;

.field public final d:Lf4/h;

.field public e:I

.field public final f:Lz3/a;

.field public g:Lt3/q;


# direct methods
.method public constructor <init>(Lt3/w;Lx3/l;Lf4/i;Lf4/h;)V
    .locals 1

    const-string v0, "connection"

    invoke-static {p2, v0}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz3/h;->a:Lt3/w;

    iput-object p2, p0, Lz3/h;->b:Lx3/l;

    iput-object p3, p0, Lz3/h;->c:Lf4/i;

    iput-object p4, p0, Lz3/h;->d:Lf4/h;

    new-instance p1, Lz3/a;

    invoke-direct {p1, p3}, Lz3/a;-><init>(Lf4/i;)V

    iput-object p1, p0, Lz3/h;->f:Lz3/a;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    iget-object v0, p0, Lz3/h;->d:Lf4/h;

    invoke-interface {v0}, Lf4/h;->flush()V

    return-void
.end method

.method public final b()V
    .locals 1

    iget-object v0, p0, Lz3/h;->d:Lf4/h;

    invoke-interface {v0}, Lf4/h;->flush()V

    return-void
.end method

.method public final c(Li/w;J)Lf4/u;
    .locals 5

    iget-object v0, p1, Li/w;->e:Ljava/lang/Object;

    check-cast v0, Lt3/z;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_0
    iget-object p1, p1, Li/w;->d:Ljava/lang/Object;

    check-cast p1, Lt3/q;

    const-string v0, "Transfer-Encoding"

    invoke-virtual {p1, v0}, Lt3/q;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "chunked"

    invoke-static {v0, p1}, Lq3/l;->U2(Ljava/lang/String;Ljava/lang/String;)Z

    move-result p1

    const/4 v0, 0x1

    const-string v1, "state: "

    const/4 v2, 0x2

    if-eqz p1, :cond_2

    iget p1, p0, Lz3/h;->e:I

    if-ne p1, v0, :cond_1

    iput v2, p0, Lz3/h;->e:I

    new-instance p1, Lz3/c;

    invoke-direct {p1, p0}, Lz3/c;-><init>(Lz3/h;)V

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget p2, p0, Lz3/h;->e:I

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_2
    const-wide/16 v3, -0x1

    cmp-long p1, p2, v3

    if-eqz p1, :cond_4

    iget p1, p0, Lz3/h;->e:I

    if-ne p1, v0, :cond_3

    iput v2, p0, Lz3/h;->e:I

    new-instance p1, Lz3/f;

    invoke-direct {p1, p0}, Lz3/f;-><init>(Lz3/h;)V

    :goto_0
    return-object p1

    :cond_3
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget p2, p0, Lz3/h;->e:I

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Cannot stream a request body without chunked encoding or a known content length!"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final cancel()V
    .locals 1

    iget-object v0, p0, Lz3/h;->b:Lx3/l;

    iget-object v0, v0, Lx3/l;->c:Ljava/net/Socket;

    if-eqz v0, :cond_0

    invoke-static {v0}, Lu3/b;->d(Ljava/net/Socket;)V

    :cond_0
    return-void
.end method

.method public final d(Lt3/b0;)Lf4/w;
    .locals 8

    invoke-static {p1}, Ly3/e;->a(Lt3/b0;)Z

    move-result v0

    if-nez v0, :cond_0

    const-wide/16 v0, 0x0

    invoke-virtual {p0, v0, v1}, Lz3/h;->i(J)Lz3/e;

    move-result-object p1

    goto :goto_0

    :cond_0
    const-string v0, "Transfer-Encoding"

    invoke-static {p1, v0}, Lt3/b0;->a(Lt3/b0;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "chunked"

    invoke-static {v1, v0}, Lq3/l;->U2(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    const-string v1, "state: "

    const/4 v2, 0x5

    const/4 v3, 0x4

    if-eqz v0, :cond_2

    iget-object p1, p1, Lt3/b0;->b:Li/w;

    iget-object p1, p1, Li/w;->b:Ljava/lang/Object;

    check-cast p1, Lt3/s;

    iget v0, p0, Lz3/h;->e:I

    if-ne v0, v3, :cond_1

    iput v2, p0, Lz3/h;->e:I

    new-instance v0, Lz3/d;

    invoke-direct {v0, p0, p1}, Lz3/d;-><init>(Lz3/h;Lt3/s;)V

    move-object p1, v0

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v0, p0, Lz3/h;->e:I

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    invoke-static {p1}, Lu3/b;->j(Lt3/b0;)J

    move-result-wide v4

    const-wide/16 v6, -0x1

    cmp-long p1, v4, v6

    if-eqz p1, :cond_3

    invoke-virtual {p0, v4, v5}, Lz3/h;->i(J)Lz3/e;

    move-result-object p1

    goto :goto_0

    :cond_3
    iget p1, p0, Lz3/h;->e:I

    if-ne p1, v3, :cond_4

    iput v2, p0, Lz3/h;->e:I

    iget-object p1, p0, Lz3/h;->b:Lx3/l;

    invoke-virtual {p1}, Lx3/l;->k()V

    new-instance p1, Lz3/g;

    invoke-direct {p1, p0}, Lz3/b;-><init>(Lz3/h;)V

    :goto_0
    return-object p1

    :cond_4
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v0, p0, Lz3/h;->e:I

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final e(Z)Lt3/a0;
    .locals 8

    iget-object v0, p0, Lz3/h;->f:Lz3/a;

    iget v1, p0, Lz3/h;->e:I

    const/4 v2, 0x1

    const/4 v3, 0x3

    if-eq v1, v2, :cond_1

    const/4 v2, 0x2

    if-eq v1, v2, :cond_1

    if-ne v1, v3, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, "state: "

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v0, p0, Lz3/h;->e:I

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    :try_start_0
    iget-object v1, v0, Lz3/a;->a:Lf4/i;

    iget-wide v4, v0, Lz3/a;->b:J

    invoke-interface {v1, v4, v5}, Lf4/i;->n(J)Ljava/lang/String;

    move-result-object v1

    iget-wide v4, v0, Lz3/a;->b:J

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    int-to-long v6, v2

    sub-long/2addr v4, v6

    iput-wide v4, v0, Lz3/a;->b:J

    invoke-static {v1}, Lf2/e;->H(Ljava/lang/String;)Ly3/h;

    move-result-object v1
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    iget v2, v1, Ly3/h;->b:I

    :try_start_1
    new-instance v4, Lt3/a0;

    invoke-direct {v4}, Lt3/a0;-><init>()V

    iget-object v5, v1, Ly3/h;->a:Lt3/x;

    const-string v6, "protocol"

    invoke-static {v5, v6}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v5, v4, Lt3/a0;->b:Lt3/x;

    iput v2, v4, Lt3/a0;->c:I

    iget-object v1, v1, Ly3/h;->c:Ljava/lang/String;

    const-string v5, "message"

    invoke-static {v1, v5}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, v4, Lt3/a0;->d:Ljava/lang/String;

    invoke-virtual {v0}, Lz3/a;->a()Lt3/q;

    move-result-object v0

    invoke-virtual {v0}, Lt3/q;->c()Lt3/p;

    move-result-object v0

    iput-object v0, v4, Lt3/a0;->f:Lt3/p;

    const/16 v0, 0x64

    if-eqz p1, :cond_2

    if-ne v2, v0, :cond_2

    const/4 v4, 0x0

    goto :goto_1

    :cond_2
    if-ne v2, v0, :cond_3

    iput v3, p0, Lz3/h;->e:I

    goto :goto_1

    :catch_0
    move-exception p1

    goto :goto_2

    :cond_3
    const/16 p1, 0x66

    if-gt p1, v2, :cond_4

    const/16 p1, 0xc8

    if-ge v2, p1, :cond_4

    iput v3, p0, Lz3/h;->e:I

    goto :goto_1

    :cond_4
    const/4 p1, 0x4

    iput p1, p0, Lz3/h;->e:I
    :try_end_1
    .catch Ljava/io/EOFException; {:try_start_1 .. :try_end_1} :catch_0

    :goto_1
    return-object v4

    :goto_2
    iget-object v0, p0, Lz3/h;->b:Lx3/l;

    iget-object v0, v0, Lx3/l;->b:Lt3/e0;

    iget-object v0, v0, Lt3/e0;->a:Lt3/a;

    iget-object v0, v0, Lt3/a;->i:Lt3/s;

    invoke-virtual {v0}, Lt3/s;->g()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/io/IOException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "unexpected end of stream on "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method public final f(Lt3/b0;)J
    .locals 2

    invoke-static {p1}, Ly3/e;->a(Lt3/b0;)Z

    move-result v0

    if-nez v0, :cond_0

    const-wide/16 v0, 0x0

    goto :goto_0

    :cond_0
    const-string v0, "Transfer-Encoding"

    invoke-static {p1, v0}, Lt3/b0;->a(Lt3/b0;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "chunked"

    invoke-static {v1, v0}, Lq3/l;->U2(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-wide/16 v0, -0x1

    goto :goto_0

    :cond_1
    invoke-static {p1}, Lu3/b;->j(Lt3/b0;)J

    move-result-wide v0

    :goto_0
    return-wide v0
.end method

.method public final g(Li/w;)V
    .locals 4

    iget-object v0, p0, Lz3/h;->b:Lx3/l;

    iget-object v0, v0, Lx3/l;->b:Lt3/e0;

    iget-object v0, v0, Lt3/e0;->b:Ljava/net/Proxy;

    invoke-virtual {v0}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object v0

    const-string v1, "connection.route().proxy.type()"

    invoke-static {v0, v1}, Lc3/h;->a0(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p1, Li/w;->c:Ljava/io/Serializable;

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0x20

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v2, p1, Li/w;->b:Ljava/lang/Object;

    move-object v3, v2

    check-cast v3, Lt3/s;

    iget-boolean v3, v3, Lt3/s;->i:Z

    if-nez v3, :cond_0

    sget-object v3, Ljava/net/Proxy$Type;->HTTP:Ljava/net/Proxy$Type;

    if-ne v0, v3, :cond_0

    check-cast v2, Lt3/s;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_0
    check-cast v2, Lt3/s;

    invoke-static {v2}, Lc3/h;->h2(Lt3/s;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_0
    const-string v0, " HTTP/1.1"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "StringBuilder().apply(builderAction).toString()"

    invoke-static {v0, v1}, Lc3/h;->a0(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p1, Li/w;->d:Ljava/lang/Object;

    check-cast p1, Lt3/q;

    invoke-virtual {p0, p1, v0}, Lz3/h;->j(Lt3/q;Ljava/lang/String;)V

    return-void
.end method

.method public final h()Lx3/l;
    .locals 1

    iget-object v0, p0, Lz3/h;->b:Lx3/l;

    return-object v0
.end method

.method public final i(J)Lz3/e;
    .locals 2

    iget v0, p0, Lz3/h;->e:I

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    const/4 v0, 0x5

    iput v0, p0, Lz3/h;->e:I

    new-instance v0, Lz3/e;

    invoke-direct {v0, p0, p1, p2}, Lz3/e;-><init>(Lz3/h;J)V

    return-object v0

    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    const-string p2, "state: "

    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget p2, p0, Lz3/h;->e:I

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public final j(Lt3/q;Ljava/lang/String;)V
    .locals 5

    const-string v0, "headers"

    invoke-static {p1, v0}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "requestLine"

    invoke-static {p2, v0}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    iget v0, p0, Lz3/h;->e:I

    if-nez v0, :cond_1

    iget-object v0, p0, Lz3/h;->d:Lf4/h;

    invoke-interface {v0, p2}, Lf4/h;->m(Ljava/lang/String;)Lf4/h;

    move-result-object p2

    const-string v1, "\r\n"

    invoke-interface {p2, v1}, Lf4/h;->m(Ljava/lang/String;)Lf4/h;

    invoke-virtual {p1}, Lt3/q;->size()I

    move-result p2

    const/4 v2, 0x0

    :goto_0
    if-ge v2, p2, :cond_0

    invoke-virtual {p1, v2}, Lt3/q;->b(I)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v3}, Lf4/h;->m(Ljava/lang/String;)Lf4/h;

    move-result-object v3

    const-string v4, ": "

    invoke-interface {v3, v4}, Lf4/h;->m(Ljava/lang/String;)Lf4/h;

    move-result-object v3

    invoke-virtual {p1, v2}, Lt3/q;->d(I)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3, v4}, Lf4/h;->m(Ljava/lang/String;)Lf4/h;

    move-result-object v3

    invoke-interface {v3, v1}, Lf4/h;->m(Ljava/lang/String;)Lf4/h;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    invoke-interface {v0, v1}, Lf4/h;->m(Ljava/lang/String;)Lf4/h;

    const/4 p1, 0x1

    iput p1, p0, Lz3/h;->e:I

    return-void

    :cond_1
    new-instance p1, Ljava/lang/StringBuilder;

    const-string p2, "state: "

    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget p2, p0, Lz3/h;->e:I

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2
.end method
