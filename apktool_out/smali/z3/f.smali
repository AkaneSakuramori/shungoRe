.class public final Lz3/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf4/u;


# instance fields
.field public final b:Lf4/k;

.field public c:Z

.field public final synthetic d:Lz3/h;


# direct methods
.method public constructor <init>(Lz3/h;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz3/f;->d:Lz3/h;

    new-instance v0, Lf4/k;

    iget-object p1, p1, Lz3/h;->d:Lf4/h;

    invoke-interface {p1}, Lf4/u;->b()Lf4/y;

    move-result-object p1

    invoke-direct {v0, p1}, Lf4/k;-><init>(Lf4/y;)V

    iput-object v0, p0, Lz3/f;->b:Lf4/k;

    return-void
.end method


# virtual methods
.method public final D(Lf4/g;J)V
    .locals 5

    const-string v0, "source"

    invoke-static {p1, v0}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Lz3/f;->c:Z

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_1

    iget-wide v0, p1, Lf4/g;->c:J

    sget-object v2, Lu3/b;->a:[B

    const-wide/16 v2, 0x0

    cmp-long v4, p2, v2

    if-ltz v4, :cond_0

    cmp-long v2, v2, v0

    if-gtz v2, :cond_0

    cmp-long v0, v0, p2

    if-ltz v0, :cond_0

    iget-object v0, p0, Lz3/f;->d:Lz3/h;

    iget-object v0, v0, Lz3/h;->d:Lf4/h;

    invoke-interface {v0, p1, p2, p3}, Lf4/u;->D(Lf4/g;J)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/ArrayIndexOutOfBoundsException;

    invoke-direct {p1}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>()V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "closed"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final b()Lf4/y;
    .locals 1

    iget-object v0, p0, Lz3/f;->b:Lf4/k;

    return-object v0
.end method

.method public final close()V
    .locals 4

    iget-boolean v0, p0, Lz3/f;->c:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lz3/f;->c:Z

    iget-object v0, p0, Lz3/f;->d:Lz3/h;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v1, p0, Lz3/f;->b:Lf4/k;

    iget-object v2, v1, Lf4/k;->e:Lf4/y;

    sget-object v3, Lf4/y;->d:Lf4/x;

    iput-object v3, v1, Lf4/k;->e:Lf4/y;

    invoke-virtual {v2}, Lf4/y;->a()Lf4/y;

    invoke-virtual {v2}, Lf4/y;->b()Lf4/y;

    const/4 v1, 0x3

    iput v1, v0, Lz3/h;->e:I

    return-void
.end method

.method public final flush()V
    .locals 1

    iget-boolean v0, p0, Lz3/f;->c:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lz3/f;->d:Lz3/h;

    iget-object v0, v0, Lz3/h;->d:Lf4/h;

    invoke-interface {v0}, Lf4/h;->flush()V

    return-void
.end method
