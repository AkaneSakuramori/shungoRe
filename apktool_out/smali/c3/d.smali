.class public final Lc3/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc3/k;
.implements Ljava/io/Serializable;


# instance fields
.field public final b:Lc3/k;

.field public final c:Lc3/i;


# direct methods
.method public constructor <init>(Lc3/i;Lc3/k;)V
    .locals 1

    const-string v0, "left"

    invoke-static {p2, v0}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "element"

    invoke-static {p1, v0}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lc3/d;->b:Lc3/k;

    iput-object p1, p0, Lc3/d;->c:Lc3/i;

    return-void
.end method


# virtual methods
.method public final e(Lc3/j;)Lc3/i;
    .locals 2

    const-string v0, "key"

    invoke-static {p1, v0}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p0

    :goto_0
    iget-object v1, v0, Lc3/d;->c:Lc3/i;

    invoke-interface {v1, p1}, Lc3/k;->e(Lc3/j;)Lc3/i;

    move-result-object v1

    if-eqz v1, :cond_0

    return-object v1

    :cond_0
    iget-object v0, v0, Lc3/d;->b:Lc3/k;

    instance-of v1, v0, Lc3/d;

    if-eqz v1, :cond_1

    check-cast v0, Lc3/d;

    goto :goto_0

    :cond_1
    invoke-interface {v0, p1}, Lc3/k;->e(Lc3/j;)Lc3/i;

    move-result-object p1

    return-object p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 5

    if-eq p0, p1, :cond_7

    instance-of v0, p1, Lc3/d;

    if-eqz v0, :cond_6

    check-cast p1, Lc3/d;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x2

    move-object v1, p1

    move v2, v0

    :goto_0
    iget-object v1, v1, Lc3/d;->b:Lc3/k;

    instance-of v3, v1, Lc3/d;

    const/4 v4, 0x0

    if-eqz v3, :cond_0

    check-cast v1, Lc3/d;

    goto :goto_1

    :cond_0
    move-object v1, v4

    :goto_1
    if-nez v1, :cond_5

    move-object v1, p0

    :goto_2
    iget-object v1, v1, Lc3/d;->b:Lc3/k;

    instance-of v3, v1, Lc3/d;

    if-eqz v3, :cond_1

    check-cast v1, Lc3/d;

    goto :goto_3

    :cond_1
    move-object v1, v4

    :goto_3
    if-nez v1, :cond_4

    if-ne v2, v0, :cond_6

    move-object v0, p0

    :goto_4
    iget-object v1, v0, Lc3/d;->c:Lc3/i;

    invoke-interface {v1}, Lc3/i;->getKey()Lc3/j;

    move-result-object v2

    invoke-virtual {p1, v2}, Lc3/d;->e(Lc3/j;)Lc3/i;

    move-result-object v2

    invoke-static {v2, v1}, Lc3/h;->I(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    goto :goto_5

    :cond_2
    iget-object v0, v0, Lc3/d;->b:Lc3/k;

    instance-of v1, v0, Lc3/d;

    if-eqz v1, :cond_3

    check-cast v0, Lc3/d;

    goto :goto_4

    :cond_3
    const-string v1, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element"

    invoke-static {v0, v1}, Lc3/h;->Y(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lc3/i;

    invoke-interface {v0}, Lc3/i;->getKey()Lc3/j;

    move-result-object v1

    invoke-virtual {p1, v1}, Lc3/d;->e(Lc3/j;)Lc3/i;

    move-result-object p1

    invoke-static {p1, v0}, Lc3/h;->I(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_6

    goto :goto_6

    :cond_4
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_5
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_6
    :goto_5
    const/4 p1, 0x0

    goto :goto_7

    :cond_7
    :goto_6
    const/4 p1, 0x1

    :goto_7
    return p1
.end method

.method public final h(Ljava/lang/Object;Lj3/p;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lc3/d;->b:Lc3/k;

    invoke-interface {v0, p1, p2}, Lc3/k;->h(Ljava/lang/Object;Lj3/p;)Ljava/lang/Object;

    move-result-object p1

    iget-object v0, p0, Lc3/d;->c:Lc3/i;

    invoke-interface {p2, p1, v0}, Lj3/p;->c(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final hashCode()I
    .locals 2

    iget-object v0, p0, Lc3/d;->b:Lc3/k;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    iget-object v1, p0, Lc3/d;->c:Lc3/i;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final t(Lc3/j;)Lc3/k;
    .locals 3

    const-string v0, "key"

    invoke-static {p1, v0}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lc3/d;->c:Lc3/i;

    invoke-interface {v0, p1}, Lc3/k;->e(Lc3/j;)Lc3/i;

    move-result-object v1

    iget-object v2, p0, Lc3/d;->b:Lc3/k;

    if-eqz v1, :cond_0

    return-object v2

    :cond_0
    invoke-interface {v2, p1}, Lc3/k;->t(Lc3/j;)Lc3/k;

    move-result-object p1

    if-ne p1, v2, :cond_1

    move-object v0, p0

    goto :goto_0

    :cond_1
    sget-object v1, Lc3/l;->b:Lc3/l;

    if-ne p1, v1, :cond_2

    goto :goto_0

    :cond_2
    new-instance v1, Lc3/d;

    invoke-direct {v1, v0, p1}, Lc3/d;-><init>(Lc3/i;Lc3/k;)V

    move-object v0, v1

    :goto_0
    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "["

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v1, Lc3/c;->d:Lc3/c;

    const-string v2, ""

    invoke-virtual {p0, v2, v1}, Lc3/d;->h(Ljava/lang/Object;Lj3/p;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x5d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final x(Lc3/k;)Lc3/k;
    .locals 0

    invoke-static {p0, p1}, Lc3/h;->W1(Lc3/k;Lc3/k;)Lc3/k;

    move-result-object p1

    return-object p1
.end method
