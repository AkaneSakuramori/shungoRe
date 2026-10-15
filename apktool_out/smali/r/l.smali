.class public abstract Lr/l;
.super Lr/d;
.source "SourceFile"


# instance fields
.field public q0:Ljava/util/ArrayList;


# virtual methods
.method public D()V
    .locals 1

    iget-object v0, p0, Lr/l;->q0:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    invoke-super {p0}, Lr/d;->D()V

    return-void
.end method

.method public final G(Lg/h;)V
    .locals 3

    invoke-super {p0, p1}, Lr/d;->G(Lg/h;)V

    iget-object v0, p0, Lr/l;->q0:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v2, p0, Lr/l;->q0:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lr/d;

    invoke-virtual {v2, p1}, Lr/d;->G(Lg/h;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public abstract S()V
.end method
