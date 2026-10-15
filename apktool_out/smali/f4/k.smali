.class public final Lf4/k;
.super Lf4/y;
.source "SourceFile"


# instance fields
.field public e:Lf4/y;


# direct methods
.method public constructor <init>(Lf4/y;)V
    .locals 1

    const-string v0, "delegate"

    invoke-static {p1, v0}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf4/k;->e:Lf4/y;

    return-void
.end method


# virtual methods
.method public final a()Lf4/y;
    .locals 1

    iget-object v0, p0, Lf4/k;->e:Lf4/y;

    invoke-virtual {v0}, Lf4/y;->a()Lf4/y;

    move-result-object v0

    return-object v0
.end method

.method public final b()Lf4/y;
    .locals 1

    iget-object v0, p0, Lf4/k;->e:Lf4/y;

    invoke-virtual {v0}, Lf4/y;->b()Lf4/y;

    move-result-object v0

    return-object v0
.end method

.method public final c()J
    .locals 2

    iget-object v0, p0, Lf4/k;->e:Lf4/y;

    invoke-virtual {v0}, Lf4/y;->c()J

    move-result-wide v0

    return-wide v0
.end method

.method public final d(J)Lf4/y;
    .locals 1

    iget-object v0, p0, Lf4/k;->e:Lf4/y;

    invoke-virtual {v0, p1, p2}, Lf4/y;->d(J)Lf4/y;

    move-result-object p1

    return-object p1
.end method

.method public final e()Z
    .locals 1

    iget-object v0, p0, Lf4/k;->e:Lf4/y;

    invoke-virtual {v0}, Lf4/y;->e()Z

    move-result v0

    return v0
.end method

.method public final f()V
    .locals 1

    iget-object v0, p0, Lf4/k;->e:Lf4/y;

    invoke-virtual {v0}, Lf4/y;->f()V

    return-void
.end method

.method public final g(JLjava/util/concurrent/TimeUnit;)Lf4/y;
    .locals 1

    const-string v0, "unit"

    invoke-static {p3, v0}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lf4/k;->e:Lf4/y;

    invoke-virtual {v0, p1, p2, p3}, Lf4/y;->g(JLjava/util/concurrent/TimeUnit;)Lf4/y;

    move-result-object p1

    return-object p1
.end method
