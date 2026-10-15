.class public abstract Lk1/d;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    sget-object v0, Lk1/c;->a:Lk1/c;

    invoke-static {p0, v0}, Lc3/h;->I(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "GET"

    goto :goto_0

    :cond_0
    sget-object v0, Lk1/b;->c:Lk1/b;

    invoke-static {p0, v0}, Lc3/h;->I(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "POST"

    goto :goto_0

    :cond_1
    sget-object v0, Lk1/b;->b:Lk1/b;

    invoke-static {p0, v0}, Lc3/h;->I(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, "PATCH"

    goto :goto_0

    :cond_2
    sget-object v0, Lk1/b;->a:Lk1/b;

    invoke-static {p0, v0}, Lc3/h;->I(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    const-string v0, "DELETE"

    :goto_0
    return-object v0

    :cond_3
    new-instance v0, Landroidx/fragment/app/p;

    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    throw v0
.end method
