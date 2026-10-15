.class public abstract Lz3/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf4/w;


# instance fields
.field public final b:Lf4/k;

.field public c:Z

.field public final synthetic d:Lz3/h;


# direct methods
.method public constructor <init>(Lz3/h;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz3/b;->d:Lz3/h;

    new-instance v0, Lf4/k;

    iget-object p1, p1, Lz3/h;->c:Lf4/i;

    invoke-interface {p1}, Lf4/w;->b()Lf4/y;

    move-result-object p1

    invoke-direct {v0, p1}, Lf4/k;-><init>(Lf4/y;)V

    iput-object v0, p0, Lz3/b;->b:Lf4/k;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 5

    iget-object v0, p0, Lz3/b;->d:Lz3/h;

    iget v1, v0, Lz3/h;->e:I

    const/4 v2, 0x6

    if-ne v1, v2, :cond_0

    return-void

    :cond_0
    const/4 v3, 0x5

    if-ne v1, v3, :cond_1

    iget-object v1, p0, Lz3/b;->b:Lf4/k;

    iget-object v3, v1, Lf4/k;->e:Lf4/y;

    sget-object v4, Lf4/y;->d:Lf4/x;

    iput-object v4, v1, Lf4/k;->e:Lf4/y;

    invoke-virtual {v3}, Lf4/y;->a()Lf4/y;

    invoke-virtual {v3}, Lf4/y;->b()Lf4/y;

    iput v2, v0, Lz3/h;->e:I

    return-void

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "state: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v0, v0, Lz3/h;->e:I

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public final b()Lf4/y;
    .locals 1

    iget-object v0, p0, Lz3/b;->b:Lf4/k;

    return-object v0
.end method

.method public f(Lf4/g;J)J
    .locals 2

    iget-object v0, p0, Lz3/b;->d:Lz3/h;

    const-string v1, "sink"

    invoke-static {p1, v1}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    iget-object v1, v0, Lz3/h;->c:Lf4/i;

    invoke-interface {v1, p1, p2, p3}, Lf4/w;->f(Lf4/g;J)J

    move-result-wide p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-wide p1

    :catch_0
    move-exception p1

    iget-object p2, v0, Lz3/h;->b:Lx3/l;

    invoke-virtual {p2}, Lx3/l;->k()V

    invoke-virtual {p0}, Lz3/b;->a()V

    throw p1
.end method
