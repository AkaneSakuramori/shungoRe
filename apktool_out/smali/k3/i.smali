.class public abstract Lk3/i;
.super Lk3/a;
.source "SourceFile"

# interfaces
.implements Lo3/d;
.implements Lj3/a;


# instance fields
.field public final h:Z


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .locals 6

    const-class v2, Lr3/q;

    const-string v3, "classSimpleName"

    const-string v4, "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;"

    const/4 v5, 0x1

    move-object v0, p0

    move-object v1, p1

    invoke-direct/range {v0 .. v5}, Lk3/a;-><init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;Z)V

    const/4 p1, 0x0

    iput-boolean p1, p0, Lk3/i;->h:Z

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 1

    move-object v0, p0

    check-cast v0, Lkotlinx/coroutines/internal/e;

    iget-object v0, v0, Lk3/a;->c:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final c()Lo3/a;
    .locals 1

    iget-boolean v0, p0, Lk3/i;->h:Z

    if-eqz v0, :cond_0

    :goto_0
    move-object v0, p0

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lk3/a;->b:Lo3/a;

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lk3/i;->e()Lo3/a;

    iput-object p0, p0, Lk3/a;->b:Lo3/a;

    goto :goto_0

    :cond_1
    :goto_1
    return-object v0
.end method

.method public final e()Lo3/a;
    .locals 1

    sget-object v0, Lk3/n;->a:Lk3/o;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-object p0
.end method

.method public final bridge synthetic equals(Ljava/lang/Object;)Z
    .locals 0

    invoke-virtual {p0, p1}, Lk3/i;->f(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final f(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lk3/i;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    check-cast p1, Lk3/i;

    invoke-virtual {p0}, Lk3/a;->b()Lk3/b;

    move-result-object v1

    invoke-virtual {p1}, Lk3/a;->b()Lk3/b;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lk3/a;->e:Ljava/lang/String;

    iget-object v3, p1, Lk3/a;->e:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lk3/a;->f:Ljava/lang/String;

    iget-object v3, p1, Lk3/a;->f:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lk3/a;->c:Ljava/lang/Object;

    iget-object p1, p1, Lk3/a;->c:Ljava/lang/Object;

    invoke-static {v1, p1}, Lc3/h;->I(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    move v0, v2

    :goto_0
    return v0

    :cond_2
    instance-of v0, p1, Lo3/d;

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Lk3/i;->c()Lo3/a;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_3
    return v2
.end method

.method public final g()I
    .locals 2

    invoke-virtual {p0}, Lk3/a;->b()Lk3/b;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lk3/a;->e:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lk3/a;->f:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    return v0
.end method

.method public final h()Ljava/lang/String;
    .locals 3

    invoke-virtual {p0}, Lk3/i;->c()Lo3/a;

    move-result-object v0

    if-eq v0, p0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "property "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lk3/a;->e:Ljava/lang/String;

    const-string v2, " (Kotlin reflection is not available)"

    invoke-static {v0, v1, v2}, La;->h(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic hashCode()I
    .locals 1

    invoke-virtual {p0}, Lk3/i;->g()I

    move-result v0

    return v0
.end method

.method public final bridge synthetic toString()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lk3/i;->h()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
