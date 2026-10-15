.class public final Lc1/u;
.super Lc1/r;
.source "SourceFile"


# instance fields
.field public a:Lc1/v;


# virtual methods
.method public final c()V
    .locals 2

    iget-object v0, p0, Lc1/u;->a:Lc1/v;

    iget-boolean v1, v0, Lc1/v;->B:Z

    if-nez v1, :cond_0

    invoke-virtual {v0}, Lc1/q;->F()V

    const/4 v1, 0x1

    iput-boolean v1, v0, Lc1/v;->B:Z

    :cond_0
    return-void
.end method

.method public final d(Lc1/q;)V
    .locals 2

    iget-object v0, p0, Lc1/u;->a:Lc1/v;

    iget v1, v0, Lc1/v;->A:I

    add-int/lit8 v1, v1, -0x1

    iput v1, v0, Lc1/v;->A:I

    if-nez v1, :cond_0

    const/4 v1, 0x0

    iput-boolean v1, v0, Lc1/v;->B:Z

    invoke-virtual {v0}, Lc1/q;->m()V

    :cond_0
    invoke-virtual {p1, p0}, Lc1/q;->v(Lc1/p;)V

    return-void
.end method
